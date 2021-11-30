// Generated from src\test\java\com\freelog\ccg\MappingRule.g4 by ANTLR 4.8
package com.freelog.ccg;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link MappingRule}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface MappingRuleVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link MappingRule#mapping_rule_section}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMapping_rule_section(MappingRule.Mapping_rule_sectionContext ctx);
	/**
	 * Visit a parse tree produced by {@link MappingRule#mapping_rule}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMapping_rule(MappingRule.Mapping_ruleContext ctx);
	/**
	 * Visit a parse tree produced by {@link MappingRule#comment_section}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComment_section(MappingRule.Comment_sectionContext ctx);
	/**
	 * Visit a parse tree produced by {@link MappingRule#rule_add}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRule_add(MappingRule.Rule_addContext ctx);
	/**
	 * Visit a parse tree produced by {@link MappingRule#rule_alter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRule_alter(MappingRule.Rule_alterContext ctx);
	/**
	 * Visit a parse tree produced by {@link MappingRule#rule_activate_theme}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRule_activate_theme(MappingRule.Rule_activate_themeContext ctx);
	/**
	 * Visit a parse tree produced by {@link MappingRule#rule_comment_section}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRule_comment_section(MappingRule.Rule_comment_sectionContext ctx);
	/**
	 * Visit a parse tree produced by {@link MappingRule#candidate}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCandidate(MappingRule.CandidateContext ctx);
	/**
	 * Visit a parse tree produced by {@link MappingRule#resource_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitResource_name(MappingRule.Resource_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link MappingRule#object_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitObject_name(MappingRule.Object_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link MappingRule#action}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAction(MappingRule.ActionContext ctx);
	/**
	 * Visit a parse tree produced by {@link MappingRule#line_code}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLine_code(MappingRule.Line_codeContext ctx);
	/**
	 * Visit a parse tree produced by {@link MappingRule#set_labels}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSet_labels(MappingRule.Set_labelsContext ctx);
	/**
	 * Visit a parse tree produced by {@link MappingRule#replace}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReplace(MappingRule.ReplaceContext ctx);
	/**
	 * Visit a parse tree produced by {@link MappingRule#show}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitShow(MappingRule.ShowContext ctx);
	/**
	 * Visit a parse tree produced by {@link MappingRule#hide}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHide(MappingRule.HideContext ctx);
	/**
	 * Visit a parse tree produced by {@link MappingRule#set_title}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSet_title(MappingRule.Set_titleContext ctx);
	/**
	 * Visit a parse tree produced by {@link MappingRule#set_cover}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSet_cover(MappingRule.Set_coverContext ctx);
	/**
	 * Visit a parse tree produced by {@link MappingRule#add_attr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAdd_attr(MappingRule.Add_attrContext ctx);
	/**
	 * Visit a parse tree produced by {@link MappingRule#delete_attr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDelete_attr(MappingRule.Delete_attrContext ctx);
	/**
	 * Visit a parse tree produced by {@link MappingRule#line_code_comment_section}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLine_code_comment_section(MappingRule.Line_code_comment_sectionContext ctx);
	/**
	 * Visit a parse tree produced by {@link MappingRule#scope}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitScope(MappingRule.ScopeContext ctx);
}