// Generated from src\test\java\com\freelog\ccg\Rule.g4 by ANTLR 4.8
package com.freelog.ccg;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link Rule}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface RuleVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link Rule#mapping_rule_section}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMapping_rule_section(Rule.Mapping_rule_sectionContext ctx);
	/**
	 * Visit a parse tree produced by {@link Rule#mapping_rule}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMapping_rule(Rule.Mapping_ruleContext ctx);
	/**
	 * Visit a parse tree produced by {@link Rule#rule_add}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRule_add(Rule.Rule_addContext ctx);
	/**
	 * Visit a parse tree produced by {@link Rule#rule_alter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRule_alter(Rule.Rule_alterContext ctx);
	/**
	 * Visit a parse tree produced by {@link Rule#rule_activate_theme}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRule_activate_theme(Rule.Rule_activate_themeContext ctx);
	/**
	 * Visit a parse tree produced by {@link Rule#candidate}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCandidate(Rule.CandidateContext ctx);
	/**
	 * Visit a parse tree produced by {@link Rule#resource_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitResource_name(Rule.Resource_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link Rule#object_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitObject_name(Rule.Object_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link Rule#action}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAction(Rule.ActionContext ctx);
	/**
	 * Visit a parse tree produced by {@link Rule#line_code}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLine_code(Rule.Line_codeContext ctx);
	/**
	 * Visit a parse tree produced by {@link Rule#set_labels}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSet_labels(Rule.Set_labelsContext ctx);
	/**
	 * Visit a parse tree produced by {@link Rule#replace}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReplace(Rule.ReplaceContext ctx);
	/**
	 * Visit a parse tree produced by {@link Rule#show}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitShow(Rule.ShowContext ctx);
	/**
	 * Visit a parse tree produced by {@link Rule#hide}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHide(Rule.HideContext ctx);
	/**
	 * Visit a parse tree produced by {@link Rule#set_title}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSet_title(Rule.Set_titleContext ctx);
	/**
	 * Visit a parse tree produced by {@link Rule#set_cover}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSet_cover(Rule.Set_coverContext ctx);
	/**
	 * Visit a parse tree produced by {@link Rule#add_attr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAdd_attr(Rule.Add_attrContext ctx);
	/**
	 * Visit a parse tree produced by {@link Rule#delete_attr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDelete_attr(Rule.Delete_attrContext ctx);
	/**
	 * Visit a parse tree produced by {@link Rule#scope}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitScope(Rule.ScopeContext ctx);
}