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

public class MappingRuleCustomVisitor extends MappingRuleBaseVisitor<Void> {

    public JSONArray mappingRules;

    private JSONObject rule;

    public JSONArray errors;

    @Override
    public Void visitMapping_rule_section(MappingRule.Mapping_rule_sectionContext ctx) {
        mappingRules = new JSONArray();
        errors = new JSONArray();

        return super.visitMapping_rule_section(ctx);
    }

    @Override
    public Void visitRule_add(MappingRule.Rule_addContext ctx) {
        rule = new JSONObject();
        rule.put("text", ctx.start.getInputStream().getText(new Interval(ctx.start.getStartIndex(), ctx.stop.getStopIndex())));
        rule.put("operation", "add");
        rule.put("actions", new JSONArray());
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
        rule.put("actions", new JSONArray());
        rule.put("exhibitName", ctx.ID().getText());

        mappingRules.add(rule);

        return super.visitRule_alter(ctx);
    }

    @Override
    public Void visitRule_activate_theme(MappingRule.Rule_activate_themeContext ctx) {
        rule = new JSONObject();
        rule.put("text", ctx.start.getInputStream().getText(new Interval(ctx.start.getStartIndex(), ctx.stop.getStopIndex())));
        rule.put("operation", "activate_theme");
        rule.put("actions", new JSONArray());
        rule.put("themeName", ctx.ID().getText());

        mappingRules.add(rule);

        return super.visitRule_activate_theme(ctx);
    }

    @Override
    public Void visitRule_comment_section(MappingRule.Rule_comment_sectionContext ctx) {
        rule = new JSONObject();
        rule.put("text", ctx.start.getInputStream().getText(new Interval(ctx.start.getStartIndex(), ctx.stop.getStopIndex())));
        rule.put("operation", "comment");

        mappingRules.add(rule);

        return super.visitRule_comment_section(ctx);
    }

    @Override
    public Void visitSet_labels(MappingRule.Set_labelsContext ctx) {
        JSONArray actions = rule.getJSONArray("actions");

        JSONObject action = new JSONObject();
        boolean exist = false;
        for (int i = 0; i < actions.size(); i++) {
            JSONObject tmp = actions.getJSONObject(i);
            if (tmp.getString("operation").equals("set_labels")) {
                action = tmp;
                exist = true;
                break;
            }
        }
        JSONArray labels = new JSONArray();
        for (TerminalNode label : ctx.ID()) {
            labels.add(label.getText());
        }
        action.put("content", labels);

        if (!exist) {
            action.put("operation", "set_labels");
            actions.add(action);
        }

        return super.visitSet_labels(ctx);
    }

    @Override
    public Void visitReplace(MappingRule.ReplaceContext ctx) {
        JSONArray actions = rule.getJSONArray("actions");

        JSONObject action = new JSONObject();
        action.put("operation", "replace");
        action.put("replaced", wrapCandidate(ctx.target, "*"));
        action.put("replacer", wrapCandidate(ctx.source, null));

        JSONArray scopes = new JSONArray();
        for (MappingRule.ScopeContext scope : ctx.scope()) {
            JSONArray chain = new JSONArray();
            for (MappingRule.CandidateContext candidate : scope.candidate()) {
                chain.add(wrapCandidate(candidate, "*"));
            }
            scopes.add(chain);
        }
        if (scopes.size() != 0) {
            action.put("scopes", scopes);
        }

        actions.add(action);

        return super.visitReplace(ctx);
    }

    @Override
    public Void visitShow(MappingRule.ShowContext ctx) {
        JSONArray actions = rule.getJSONArray("actions");
        JSONObject action = new JSONObject();
        boolean exist = false;
        for (int i = 0; i < actions.size(); i++) {
            JSONObject tmp = actions.getJSONObject(i);
            if (tmp.getString("operation").equals("online")) {
                action = tmp;
                exist = true;
                break;
            }
        }
        action.put("content", true);

        if (!exist) {
            action.put("operation", "online");
            actions.add(action);
        }

        return super.visitShow(ctx);
    }

    @Override
    public Void visitHide(MappingRule.HideContext ctx) {
        JSONArray actions = rule.getJSONArray("actions");
        JSONObject action = new JSONObject();
        boolean exist = false;
        for (int i = 0; i < actions.size(); i++) {
            JSONObject tmp = actions.getJSONObject(i);
            if (tmp.getString("operation").equals("online")) {
                action = tmp;
                exist = true;
                break;
            }
        }
        action.put("content", false);

        if (!exist) {
            action.put("operation", "online");
            actions.add(action);
        }

        return super.visitHide(ctx);
    }

    @Override
    public Void visitSet_title(MappingRule.Set_titleContext ctx) {
        JSONArray actions = rule.getJSONArray("actions");
        JSONObject action = new JSONObject();
        boolean exist = false;
        for (int i = 0; i < actions.size(); i++) {
            JSONObject tmp = actions.getJSONObject(i);
            if (tmp.getString("operation").equals("set_title")) {
                action = tmp;
                exist = true;
                break;
            }
        }
        if (ctx.title == null) {
            action.put("content", null);
        } else {
            String title = ctx.title.getText();
            action.put("content", title.substring(1, title.length() - 1));
        }

        if (!exist) {
            action.put("operation", "set_title");
            actions.add(action);
        }

        return super.visitSet_title(ctx);
    }

    @Override
    public Void visitSet_cover(MappingRule.Set_coverContext ctx) {
        JSONArray actions = rule.getJSONArray("actions");
        JSONObject action = new JSONObject();
        boolean exist = false;
        for (int i = 0; i < actions.size(); i++) {
            JSONObject tmp = actions.getJSONObject(i);
            if (tmp.getString("operation").equals("set_cover")) {
                action = tmp;
                exist = true;
                break;
            }
        }
        if (ctx.cover == null) {
            action.put("content", null);
        } else {
            String title = ctx.cover.getText();
            action.put("content", title.substring(1, title.length() - 1));
        }

        if (!exist) {
            action.put("operation", "set_cover");
            actions.add(action);
        }

        return super.visitSet_cover(ctx);
    }

    @Override
    public Void visitAdd_attr(MappingRule.Add_attrContext ctx) {
        JSONArray actions = rule.getJSONArray("actions");

        JSONObject content = new JSONObject();
        content.put("key", ctx.key.getText());
        content.put("value", ctx.value.getText());
        if (ctx.description != null) {
            content.put("description", ctx.description.getText());
        }
        for (int i = 0; i < actions.size(); i++) {
            JSONObject tmp = actions.getJSONObject(i);
            if (tmp.getString("operation").equals("add_attr")) {
                if (tmp.getJSONObject("content").getString("key").equals(content.getString("key"))) {
                    errors.add(String.format("添加属性中，不能重复添加 attr: %s", content.getString("key")));
                    break;
                }
            }
        }

        JSONObject action = new JSONObject();
        action.put("operation", "add_attr");
        action.put("content", content);

        actions.add(action);

        return super.visitAdd_attr(ctx);
    }

    @Override
    public Void visitDelete_attr(MappingRule.Delete_attrContext ctx) {
        JSONArray actions = rule.getJSONArray("actions");

        JSONObject content = new JSONObject();
        content.put("key", ctx.key.getText());

        JSONObject action = new JSONObject();
        action.put("operation", "delete_attr");
        action.put("content", content);

        actions.add(action);

        return super.visitDelete_attr(ctx);
    }

    @Override
    public Void visitLine_code_comment_section(MappingRule.Line_code_comment_sectionContext ctx) {
        JSONArray actions = rule.getJSONArray("actions");

        JSONObject action = new JSONObject();
        action.put("operation", "comment");
        action.put("content", ctx.start.getInputStream().getText(new Interval(ctx.start.getStartIndex(), ctx.stop.getStopIndex())));

        actions.add(action);

        return super.visitLine_code_comment_section(ctx);
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
