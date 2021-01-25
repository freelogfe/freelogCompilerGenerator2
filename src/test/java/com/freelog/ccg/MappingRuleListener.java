// Generated from src\test\java\com\freelog\ccg\MappingRule.g4 by ANTLR 4.8
package com.freelog.ccg;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link MappingRule}.
 */
public interface MappingRuleListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link MappingRule#mapping_rule_section}.
	 * @param ctx the parse tree
	 */
	void enterMapping_rule_section(MappingRule.Mapping_rule_sectionContext ctx);
	/**
	 * Exit a parse tree produced by {@link MappingRule#mapping_rule_section}.
	 * @param ctx the parse tree
	 */
	void exitMapping_rule_section(MappingRule.Mapping_rule_sectionContext ctx);
	/**
	 * Enter a parse tree produced by {@link MappingRule#mapping_rule}.
	 * @param ctx the parse tree
	 */
	void enterMapping_rule(MappingRule.Mapping_ruleContext ctx);
	/**
	 * Exit a parse tree produced by {@link MappingRule#mapping_rule}.
	 * @param ctx the parse tree
	 */
	void exitMapping_rule(MappingRule.Mapping_ruleContext ctx);
	/**
	 * Enter a parse tree produced by {@link MappingRule#rule_add}.
	 * @param ctx the parse tree
	 */
	void enterRule_add(MappingRule.Rule_addContext ctx);
	/**
	 * Exit a parse tree produced by {@link MappingRule#rule_add}.
	 * @param ctx the parse tree
	 */
	void exitRule_add(MappingRule.Rule_addContext ctx);
	/**
	 * Enter a parse tree produced by {@link MappingRule#rule_alter}.
	 * @param ctx the parse tree
	 */
	void enterRule_alter(MappingRule.Rule_alterContext ctx);
	/**
	 * Exit a parse tree produced by {@link MappingRule#rule_alter}.
	 * @param ctx the parse tree
	 */
	void exitRule_alter(MappingRule.Rule_alterContext ctx);
	/**
	 * Enter a parse tree produced by {@link MappingRule#rule_activate_theme}.
	 * @param ctx the parse tree
	 */
	void enterRule_activate_theme(MappingRule.Rule_activate_themeContext ctx);
	/**
	 * Exit a parse tree produced by {@link MappingRule#rule_activate_theme}.
	 * @param ctx the parse tree
	 */
	void exitRule_activate_theme(MappingRule.Rule_activate_themeContext ctx);
	/**
	 * Enter a parse tree produced by {@link MappingRule#candidate}.
	 * @param ctx the parse tree
	 */
	void enterCandidate(MappingRule.CandidateContext ctx);
	/**
	 * Exit a parse tree produced by {@link MappingRule#candidate}.
	 * @param ctx the parse tree
	 */
	void exitCandidate(MappingRule.CandidateContext ctx);
	/**
	 * Enter a parse tree produced by {@link MappingRule#resource_name}.
	 * @param ctx the parse tree
	 */
	void enterResource_name(MappingRule.Resource_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link MappingRule#resource_name}.
	 * @param ctx the parse tree
	 */
	void exitResource_name(MappingRule.Resource_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link MappingRule#object_name}.
	 * @param ctx the parse tree
	 */
	void enterObject_name(MappingRule.Object_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link MappingRule#object_name}.
	 * @param ctx the parse tree
	 */
	void exitObject_name(MappingRule.Object_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link MappingRule#action}.
	 * @param ctx the parse tree
	 */
	void enterAction(MappingRule.ActionContext ctx);
	/**
	 * Exit a parse tree produced by {@link MappingRule#action}.
	 * @param ctx the parse tree
	 */
	void exitAction(MappingRule.ActionContext ctx);
	/**
	 * Enter a parse tree produced by {@link MappingRule#line_code}.
	 * @param ctx the parse tree
	 */
	void enterLine_code(MappingRule.Line_codeContext ctx);
	/**
	 * Exit a parse tree produced by {@link MappingRule#line_code}.
	 * @param ctx the parse tree
	 */
	void exitLine_code(MappingRule.Line_codeContext ctx);
	/**
	 * Enter a parse tree produced by {@link MappingRule#set_labels}.
	 * @param ctx the parse tree
	 */
	void enterSet_labels(MappingRule.Set_labelsContext ctx);
	/**
	 * Exit a parse tree produced by {@link MappingRule#set_labels}.
	 * @param ctx the parse tree
	 */
	void exitSet_labels(MappingRule.Set_labelsContext ctx);
	/**
	 * Enter a parse tree produced by {@link MappingRule#replace}.
	 * @param ctx the parse tree
	 */
	void enterReplace(MappingRule.ReplaceContext ctx);
	/**
	 * Exit a parse tree produced by {@link MappingRule#replace}.
	 * @param ctx the parse tree
	 */
	void exitReplace(MappingRule.ReplaceContext ctx);
	/**
	 * Enter a parse tree produced by {@link MappingRule#show}.
	 * @param ctx the parse tree
	 */
	void enterShow(MappingRule.ShowContext ctx);
	/**
	 * Exit a parse tree produced by {@link MappingRule#show}.
	 * @param ctx the parse tree
	 */
	void exitShow(MappingRule.ShowContext ctx);
	/**
	 * Enter a parse tree produced by {@link MappingRule#hide}.
	 * @param ctx the parse tree
	 */
	void enterHide(MappingRule.HideContext ctx);
	/**
	 * Exit a parse tree produced by {@link MappingRule#hide}.
	 * @param ctx the parse tree
	 */
	void exitHide(MappingRule.HideContext ctx);
	/**
	 * Enter a parse tree produced by {@link MappingRule#set_title}.
	 * @param ctx the parse tree
	 */
	void enterSet_title(MappingRule.Set_titleContext ctx);
	/**
	 * Exit a parse tree produced by {@link MappingRule#set_title}.
	 * @param ctx the parse tree
	 */
	void exitSet_title(MappingRule.Set_titleContext ctx);
	/**
	 * Enter a parse tree produced by {@link MappingRule#set_cover}.
	 * @param ctx the parse tree
	 */
	void enterSet_cover(MappingRule.Set_coverContext ctx);
	/**
	 * Exit a parse tree produced by {@link MappingRule#set_cover}.
	 * @param ctx the parse tree
	 */
	void exitSet_cover(MappingRule.Set_coverContext ctx);
	/**
	 * Enter a parse tree produced by {@link MappingRule#add_attr}.
	 * @param ctx the parse tree
	 */
	void enterAdd_attr(MappingRule.Add_attrContext ctx);
	/**
	 * Exit a parse tree produced by {@link MappingRule#add_attr}.
	 * @param ctx the parse tree
	 */
	void exitAdd_attr(MappingRule.Add_attrContext ctx);
	/**
	 * Enter a parse tree produced by {@link MappingRule#delete_attr}.
	 * @param ctx the parse tree
	 */
	void enterDelete_attr(MappingRule.Delete_attrContext ctx);
	/**
	 * Exit a parse tree produced by {@link MappingRule#delete_attr}.
	 * @param ctx the parse tree
	 */
	void exitDelete_attr(MappingRule.Delete_attrContext ctx);
	/**
	 * Enter a parse tree produced by {@link MappingRule#scope}.
	 * @param ctx the parse tree
	 */
	void enterScope(MappingRule.ScopeContext ctx);
	/**
	 * Exit a parse tree produced by {@link MappingRule#scope}.
	 * @param ctx the parse tree
	 */
	void exitScope(MappingRule.ScopeContext ctx);
}