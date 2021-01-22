package com.freelog.ccg;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import org.antlr.v4.runtime.tree.TerminalNode;

public class RuleCustomVisitor extends RuleBaseVisitor<Void> {

    public JSONArray mappingRules;

    private JSONObject rule;

    @Override
    public Void visitMapping_rule_section(Rule.Mapping_rule_sectionContext ctx) {
        mappingRules = new JSONArray();
        return super.visitMapping_rule_section(ctx);
    }

    @Override
    public Void visitRule_add(Rule.Rule_addContext ctx) {
        rule = new JSONObject();
        rule.put("text", ctx.getText());
        rule.put("operation", "add");
        rule.put("exhibitName", ctx.ID().getText());
        rule.put("candidate", wrapCandidate(ctx.candidate(), null));

        mappingRules.add(rule);

        return super.visitRule_add(ctx);
    }

    @Override
    public Void visitRule_alter(Rule.Rule_alterContext ctx) {
        rule = new JSONObject();
        rule.put("text", ctx.getText());
        rule.put("operation", "alter");
        rule.put("exhibitName", ctx.ID().getText());

        mappingRules.add(rule);

        return super.visitRule_alter(ctx);
    }

    @Override
    public Void visitRule_activate_theme(Rule.Rule_activate_themeContext ctx) {
        rule = new JSONObject();
        rule.put("text", ctx.getText());
        rule.put("operation", "activate_theme");
        rule.put("themeName", ctx.ID().getText());

        mappingRules.add(rule);

        return super.visitRule_activate_theme(ctx);
    }

    @Override
    public Void visitSet_labels(Rule.Set_labelsContext ctx) {
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
    public Void visitReplace(Rule.ReplaceContext ctx) {
        JSONArray replaces = rule.getJSONArray("replaces");
        if (replaces == null) {
            replaces = new JSONArray();
        }
        JSONObject replace = new JSONObject();
        replace.put("replaced", wrapCandidate(ctx.target, "*"));
        replace.put("replacer", wrapCandidate(ctx.source, null));

        JSONArray scopes = new JSONArray();
        for (Rule.ScopeContext scope : ctx.scope()) {
            JSONArray chain = new JSONArray();
            for (Rule.CandidateContext candidate : scope.candidate()) {
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
    public Void visitShow(Rule.ShowContext ctx) {
        rule.put("online", true);

        return super.visitShow(ctx);
    }

    @Override
    public Void visitHide(Rule.HideContext ctx) {
        rule.put("online", false);

        return super.visitHide(ctx);
    }

    @Override
    public Void visitSet_title(Rule.Set_titleContext ctx) {
        rule.put("title", ctx.ID().getText());

        return super.visitSet_title(ctx);
    }

    @Override
    public Void visitSet_cover(Rule.Set_coverContext ctx) {
        rule.put("cover", ctx.ID().getText());

        return super.visitSet_cover(ctx);
    }

    @Override
    public Void visitAdd_attr(Rule.Add_attrContext ctx) {
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
    public Void visitDelete_attr(Rule.Delete_attrContext ctx) {
        JSONArray attrs = rule.getJSONArray("attrs");
        if (attrs == null) {
            attrs = new JSONArray();
        }

        JSONObject attr = new JSONObject();
        attr.put("operation", "delete");
        attr.put("key", ctx.ID().getText());

        attrs.add(attr);
        rule.put("attrs", attrs);

        return super.visitDelete_attr(ctx);
    }

    public JSONObject wrapCandidate(Rule.CandidateContext ctx, String releaseDefaultVersion) {
        if (releaseDefaultVersion == null) {
            releaseDefaultVersion = "latest";
        }

        JSONObject candidate = new JSONObject();

        if (ctx.resource_name() != null) {
            Rule.Resource_nameContext rctx = ctx.resource_name();
            candidate.put("name", String.format("%s%s%s", rctx.userName.getText(), rctx.SLASH().getText(), rctx.resourceName.getText()));
            candidate.put("versionRange", rctx.SEMVER() != null ? rctx.SEMVER().getText() : releaseDefaultVersion);
            candidate.put("type", "resource");
        } else {
            Rule.Object_nameContext octx = ctx.object_name();
            candidate.put("name", String.format("%s%s%s", octx.bucketName.getText(), octx.SLASH().getText(), octx.objectName.getText()));
            candidate.put("type", "object");
        }

        return candidate;
    }

    public void verifyRuleAdd(){

    }
}
