package com.freelog.ccg;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import org.antlr.v4.runtime.misc.Interval;
import org.antlr.v4.runtime.tree.TerminalNode;
import org.apache.commons.lang3.StringUtils;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class MappingRuleCustomVisitor extends MappingRuleBaseVisitor<Void> {

    public JSONArray mappingRules;

    private JSONObject rule;

    public JSONArray errors;

    @Override
    public Void visitMapping_rule_section(MappingRule.Mapping_rule_sectionContext ctx) {
        mappingRules = new JSONArray();
        return super.visitMapping_rule_section(ctx);
    }

    @Override
    public Void visitMapping_rule_part(MappingRule.Mapping_rule_partContext ctx) {
        Void result = super.visitMapping_rule_part(ctx);

        List<MappingRule.Comment_sectionContext> ctxCss = ctx.comment_section();
        if (ctxCss.size() != 0) {
            rule.put("comments", ctxCss.stream().map(MappingRule.Comment_sectionContext::getText).collect(Collectors.toList()));
        }

        return result;
    }

    @Override
    public Void visitRule_add(MappingRule.Rule_addContext ctx) {
        rule = new JSONObject();
        rule.put("text", ctx.start.getInputStream().getText(new Interval(ctx.start.getStartIndex(), ctx.stop.getStopIndex())));
        rule.put("operation", "add");
        rule.put("exhibitName", ctx.ID().getText());
        rule.put("candidate", wrapCandidate(ctx.candidate(), null));

        mappingRules.add(rule);

        return super.visitRule_add(ctx);
    }

    @Override
    public Void visitRule_alter(MappingRule.Rule_alterContext ctx) {
        rule = new JSONObject();
        rule.put("text", ctx.start.getInputStream().getText(new Interval(ctx.start.getStartIndex(), ctx.stop.getStopIndex())));
        rule.put("operation", "alter");
        rule.put("exhibitName", ctx.ID().getText());

        mappingRules.add(rule);

        return super.visitRule_alter(ctx);
    }

    @Override
    public Void visitRule_activate_theme(MappingRule.Rule_activate_themeContext ctx) {
        rule = new JSONObject();
        rule.put("text", ctx.start.getInputStream().getText(new Interval(ctx.start.getStartIndex(), ctx.stop.getStopIndex())));
        rule.put("operation", "activate_theme");
        rule.put("themeName", ctx.ID().getText());

        mappingRules.add(rule);

        return super.visitRule_activate_theme(ctx);
    }

    @Override
    public Void visitSet_labels(MappingRule.Set_labelsContext ctx) {
        JSONArray labels = new JSONArray();
        for (TerminalNode label : ctx.ID()) {
            labels.add(label.getText());
        }

        if (labels.size() != 0) {
            rule.put("labels", labels);
        } else {
            rule.remove("labels");
        }

        return super.visitSet_labels(ctx);
    }

    @Override
    public Void visitReplace(MappingRule.ReplaceContext ctx) {
        JSONArray replaces = rule.getJSONArray("replaces");
        if (replaces == null) {
            replaces = new JSONArray();
        }
        JSONObject replace = new JSONObject();
        replace.put("replaced", wrapCandidate(ctx.target, "*"));
        replace.put("replacer", wrapCandidate(ctx.source, null));

        JSONArray scopes = new JSONArray();
        for (MappingRule.ScopeContext scope : ctx.scope()) {
            JSONArray chain = new JSONArray();
            for (MappingRule.CandidateContext candidate : scope.candidate()) {
                chain.add(wrapCandidate(candidate, "*"));
            }
            scopes.add(chain);
        }
        if (scopes.size() != 0) {
            replace.put("scopes", scopes);
        }

        replaces.add(replace);
        rule.put("replaces", replaces);

        return super.visitReplace(ctx);
    }

    @Override
    public Void visitShow(MappingRule.ShowContext ctx) {
        rule.put("online", true);

        return super.visitShow(ctx);
    }

    @Override
    public Void visitHide(MappingRule.HideContext ctx) {
        rule.put("online", false);

        return super.visitHide(ctx);
    }

    @Override
    public Void visitSet_title(MappingRule.Set_titleContext ctx) {
        if (ctx.title == null) {
            rule.put("title", null);
        } else {
            String title = ctx.title.getText();
            rule.put("title", title.substring(1, title.length() - 1));
        }
        return super.visitSet_title(ctx);
    }

    @Override
    public Void visitSet_cover(MappingRule.Set_coverContext ctx) {
        if (ctx.cover == null) {
            rule.put("cover", null);
        } else {
            String cover = ctx.cover.getText();
            rule.put("cover", cover.substring(1, cover.length() - 1));
        }
        return super.visitSet_cover(ctx);
    }

    @Override
    public Void visitAdd_attr(MappingRule.Add_attrContext ctx) {
        JSONArray attrs = rule.getJSONArray("attrs");
        if (attrs == null) {
            attrs = new JSONArray();
        }

        JSONObject attr = new JSONObject();
        attr.put("operation", "add");
        attr.put("key", ctx.key.getText());
        attr.put("value", ctx.value.getText());
        if (ctx.description != null) {
            attr.put("description", ctx.description.getText());
        }

        attrs.add(attr);
        rule.put("attrs", attrs);

        return super.visitAdd_attr(ctx);
    }

    @Override
    public Void visitDelete_attr(MappingRule.Delete_attrContext ctx) {
        JSONArray attrs = rule.getJSONArray("attrs");
        if (attrs == null) {
            attrs = new JSONArray();
        }

        JSONObject attr = new JSONObject();
        attr.put("operation", "delete");
        attr.put("key", ctx.key.getText());

        attrs.add(attr);
        rule.put("attrs", attrs);

        return super.visitDelete_attr(ctx);
    }

    public JSONObject wrapCandidate(MappingRule.CandidateContext ctx, String releaseDefaultVersion) {
        if (ctx == null) {
            return null;
        }
        if (releaseDefaultVersion == null) {
            releaseDefaultVersion = "latest";
        }

        JSONObject candidate = new JSONObject();
        if (ctx.resource_name() != null) {
            MappingRule.Resource_nameContext rctx = ctx.resource_name();
            if (rctx == null || rctx.resourceName == null) {
                return null;
            }
            candidate.put("name", String.format("%s%s%s", rctx.userName.getText(), rctx.SLASH().getText(), rctx.resourceName.getText()));
            candidate.put("versionRange", rctx.SEMVER() != null ? rctx.SEMVER().getText() : releaseDefaultVersion);
            candidate.put("type", "resource");
        } else {
            MappingRule.Object_nameContext octx = ctx.object_name();
            if (octx == null || octx.objectName == null) {
                return null;
            }
            candidate.put("name", String.format("%s%s%s", octx.bucketName.getText(), octx.SLASH().getText(), octx.objectName.getText()));
            candidate.put("type", "object");
        }

        return candidate;
    }

    public void verify() {
        errors = new JSONArray();

        verifyRuleAdd();
        verifyExhibitName4Rule();
        verifyRuleActivateTheme();
    }

    public void verifyRuleAdd() {
        List<String> ruleNameR = new ArrayList<>();
        List<String> ruleNameO = new ArrayList<>();
        Set<String> repeatNameR = new HashSet<>();
        Set<String> repeatNameO = new HashSet<>();
        for (int i = 0; i < mappingRules.size(); i++) {
            JSONObject rule = mappingRules.getJSONObject(i);
            if (!rule.getString("operation").equals("add")) {
                continue;
            }

            JSONObject candidate = rule.getJSONObject("candidate");
            if (candidate == null) {
                return;
            }
            String type = candidate.getString("type");
            String name = candidate.getString("name");
            if (type.equals("resource")) {
                if (!ruleNameR.contains(name)) {
                    ruleNameR.add(name);
                } else {
                    repeatNameR.add(name);
                }
            } else {
                if (!ruleNameO.contains(name)) {
                    ruleNameO.add(name);
                } else {
                    repeatNameO.add(name);
                }
            }
        }

        if (repeatNameR.size() != 0) {
            errors.add(String.format("添加规则中，不能重复添加 resource: %s", StringUtils.join(repeatNameR, ", ")));
        }
        if (repeatNameR.size() != 0) {
            errors.add(String.format("添加规则中，不能重复添加 object: %s", StringUtils.join(repeatNameO, ", ")));
        }
    }

    public void verifyExhibitName4Rule() {
        List<String> exhibitNames = new ArrayList<>();
        Set<String> repeatExhibitNames = new HashSet<>();
        for (int i = 0; i < mappingRules.size(); i++) {
            JSONObject rule = mappingRules.getJSONObject(i);
            String operation = rule.getString("operation");
            if (!(operation.equals("add") || operation.equals("alter"))) {
                continue;
            }
            String exhibitName = rule.getString("exhibitName");
            if (exhibitNames.contains(exhibitName)) {
                repeatExhibitNames.add(exhibitName);
            } else {
                exhibitNames.add(exhibitName);
            }
        }

        if (repeatExhibitNames.size() != 0) {
            errors.add(String.format("不能使用重复的展品名称: %s", StringUtils.join(repeatExhibitNames, ", ")));
        }
    }

    public void verifyRuleActivateTheme() {
        boolean repeatable = true;
        for (int i = 0; i < mappingRules.size(); i++) {
            if (mappingRules.getJSONObject(i).getString("operation").equals("activate_theme")) {
                if (repeatable) {
                    repeatable = false;
                } else {
                    errors.add("激活主题语句（activate_theme）不可重复");
                    break;
                }
            }
        }
    }
}
