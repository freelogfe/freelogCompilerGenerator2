// Generated from src\test\java\com\freelog\ccg\Rule.g4 by ANTLR 4.8
package com.freelog.ccg;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link Rule}.
 */
public interface RuleListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link Rule#mapping_rule_section}.
	 * @param ctx the parse tree
	 */
	void enterMapping_rule_section(Rule.Mapping_rule_sectionContext ctx);
	/**
	 * Exit a parse tree produced by {@link Rule#mapping_rule_section}.
	 * @param ctx the parse tree
	 */
	void exitMapping_rule_section(Rule.Mapping_rule_sectionContext ctx);
	/**
	 * Enter a parse tree produced by {@link Rule#mapping_rule}.
	 * @param ctx the parse tree
	 */
	void enterMapping_rule(Rule.Mapping_ruleContext ctx);
	/**
	 * Exit a parse tree produced by {@link Rule#mapping_rule}.
	 * @param ctx the parse tree
	 */
	void exitMapping_rule(Rule.Mapping_ruleContext ctx);
	/**
	 * Enter a parse tree produced by {@link Rule#rule_add}.
	 * @param ctx the parse tree
	 */
	void enterRule_add(Rule.Rule_addContext ctx);
	/**
	 * Exit a parse tree produced by {@link Rule#rule_add}.
	 * @param ctx the parse tree
	 */
	void exitRule_add(Rule.Rule_addContext ctx);
	/**
	 * Enter a parse tree produced by {@link Rule#rule_alter}.
	 * @param ctx the parse tree
	 */
	void enterRule_alter(Rule.Rule_alterContext ctx);
	/**
	 * Exit a parse tree produced by {@link Rule#rule_alter}.
	 * @param ctx the parse tree
	 */
	void exitRule_alter(Rule.Rule_alterContext ctx);
	/**
	 * Enter a parse tree produced by {@link Rule#rule_activate_theme}.
	 * @param ctx the parse tree
	 */
	void enterRule_activate_theme(Rule.Rule_activate_themeContext ctx);
	/**
	 * Exit a parse tree produced by {@link Rule#rule_activate_theme}.
	 * @param ctx the parse tree
	 */
	void exitRule_activate_theme(Rule.Rule_activate_themeContext ctx);
	/**
	 * Enter a parse tree produced by {@link Rule#candidate}.
	 * @param ctx the parse tree
	 */
	void enterCandidate(Rule.CandidateContext ctx);
	/**
	 * Exit a parse tree produced by {@link Rule#candidate}.
	 * @param ctx the parse tree
	 */
	void exitCandidate(Rule.CandidateContext ctx);
	/**
	 * Enter a parse tree produced by {@link Rule#resource_name}.
	 * @param ctx the parse tree
	 */
	void enterResource_name(Rule.Resource_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link Rule#resource_name}.
	 * @param ctx the parse tree
	 */
	void exitResource_name(Rule.Resource_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link Rule#object_name}.
	 * @param ctx the parse tree
	 */
	void enterObject_name(Rule.Object_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link Rule#object_name}.
	 * @param ctx the parse tree
	 */
	void exitObject_name(Rule.Object_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link Rule#action}.
	 * @param ctx the parse tree
	 */
	void enterAction(Rule.ActionContext ctx);
	/**
	 * Exit a parse tree produced by {@link Rule#action}.
	 * @param ctx the parse tree
	 */
	void exitAction(Rule.ActionContext ctx);
	/**
	 * Enter a parse tree produced by {@link Rule#line_code}.
	 * @param ctx the parse tree
	 */
	void enterLine_code(Rule.Line_codeContext ctx);
	/**
	 * Exit a parse tree produced by {@link Rule#line_code}.
	 * @param ctx the parse tree
	 */
	void exitLine_code(Rule.Line_codeContext ctx);
	/**
	 * Enter a parse tree produced by {@link Rule#set_labels}.
	 * @param ctx the parse tree
	 */
	void enterSet_labels(Rule.Set_labelsContext ctx);
	/**
	 * Exit a parse tree produced by {@link Rule#set_labels}.
	 * @param ctx the parse tree
	 */
	void exitSet_labels(Rule.Set_labelsContext ctx);
	/**
	 * Enter a parse tree produced by {@link Rule#replace}.
	 * @param ctx the parse tree
	 */
	void enterReplace(Rule.ReplaceContext ctx);
	/**
	 * Exit a parse tree produced by {@link Rule#replace}.
	 * @param ctx the parse tree
	 */
	void exitReplace(Rule.ReplaceContext ctx);
	/**
	 * Enter a parse tree produced by {@link Rule#show}.
	 * @param ctx the parse tree
	 */
	void enterShow(Rule.ShowContext ctx);
	/**
	 * Exit a parse tree produced by {@link Rule#show}.
	 * @param ctx the parse tree
	 */
	void exitShow(Rule.ShowContext ctx);
	/**
	 * Enter a parse tree produced by {@link Rule#hide}.
	 * @param ctx the parse tree
	 */
	void enterHide(Rule.HideContext ctx);
	/**
	 * Exit a parse tree produced by {@link Rule#hide}.
	 * @param ctx the parse tree
	 */
	void exitHide(Rule.HideContext ctx);
	/**
	 * Enter a parse tree produced by {@link Rule#set_title}.
	 * @param ctx the parse tree
	 */
	void enterSet_title(Rule.Set_titleContext ctx);
	/**
	 * Exit a parse tree produced by {@link Rule#set_title}.
	 * @param ctx the parse tree
	 */
	void exitSet_title(Rule.Set_titleContext ctx);
	/**
	 * Enter a parse tree produced by {@link Rule#set_cover}.
	 * @param ctx the parse tree
	 */
	void enterSet_cover(Rule.Set_coverContext ctx);
	/**
	 * Exit a parse tree produced by {@link Rule#set_cover}.
	 * @param ctx the parse tree
	 */
	void exitSet_cover(Rule.Set_coverContext ctx);
	/**
	 * Enter a parse tree produced by {@link Rule#add_attr}.
	 * @param ctx the parse tree
	 */
	void enterAdd_attr(Rule.Add_attrContext ctx);
	/**
	 * Exit a parse tree produced by {@link Rule#add_attr}.
	 * @param ctx the parse tree
	 */
	void exitAdd_attr(Rule.Add_attrContext ctx);
	/**
	 * Enter a parse tree produced by {@link Rule#delete_attr}.
	 * @param ctx the parse tree
	 */
	void enterDelete_attr(Rule.Delete_attrContext ctx);
	/**
	 * Exit a parse tree produced by {@link Rule#delete_attr}.
	 * @param ctx the parse tree
	 */
	void exitDelete_attr(Rule.Delete_attrContext ctx);
	/**
	 * Enter a parse tree produced by {@link Rule#scope}.
	 * @param ctx the parse tree
	 */
	void enterScope(Rule.ScopeContext ctx);
	/**
	 * Exit a parse tree produced by {@link Rule#scope}.
	 * @param ctx the parse tree
	 */
	void exitScope(Rule.ScopeContext ctx);
}