// Generated from generated_grammars/UserPolicy.g4 by ANTLR 4.8

    package com.freelog.cg.antlr;
    import java.util.*;

import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link UserPolicyParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface UserPolicyVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link UserPolicyParser#policy}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPolicy(UserPolicyParser.PolicyContext ctx);
	/**
	 * Visit a parse tree produced by {@link UserPolicyParser#requirement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRequirement(UserPolicyParser.RequirementContext ctx);
	/**
	 * Visit a parse tree produced by {@link UserPolicyParser#contract_with_subject}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitContract_with_subject(UserPolicyParser.Contract_with_subjectContext ctx);
	/**
	 * Visit a parse tree produced by {@link UserPolicyParser#declaration_section}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclaration_section(UserPolicyParser.Declaration_sectionContext ctx);
	/**
	 * Visit a parse tree produced by {@link UserPolicyParser#declaration_statements}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclaration_statements(UserPolicyParser.Declaration_statementsContext ctx);
	/**
	 * Visit a parse tree produced by {@link UserPolicyParser#state_definition_section}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitState_definition_section(UserPolicyParser.State_definition_sectionContext ctx);
	/**
	 * Visit a parse tree produced by {@link UserPolicyParser#state_definition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitState_definition(UserPolicyParser.State_definitionContext ctx);
	/**
	 * Visit a parse tree produced by {@link UserPolicyParser#state_transition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitState_transition(UserPolicyParser.State_transitionContext ctx);
	/**
	 * Visit a parse tree produced by {@link UserPolicyParser#state_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitState_name(UserPolicyParser.State_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link UserPolicyParser#service_state}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitService_state(UserPolicyParser.Service_stateContext ctx);
	/**
	 * Visit a parse tree produced by {@link UserPolicyParser#subject_id}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSubject_id(UserPolicyParser.Subject_idContext ctx);
	/**
	 * Visit a parse tree produced by {@link UserPolicyParser#event}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEvent(UserPolicyParser.EventContext ctx);
	/**
	 * Visit a parse tree produced by {@link UserPolicyParser#event_path}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEvent_path(UserPolicyParser.Event_pathContext ctx);
	/**
	 * Visit a parse tree produced by {@link UserPolicyParser#event_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEvent_name(UserPolicyParser.Event_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link UserPolicyParser#expression_test}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression_test(UserPolicyParser.Expression_testContext ctx);
	/**
	 * Visit a parse tree produced by {@link UserPolicyParser#expression_call_or_literal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression_call_or_literal(UserPolicyParser.Expression_call_or_literalContext ctx);
	/**
	 * Visit a parse tree produced by {@link UserPolicyParser#expression_assignment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression_assignment(UserPolicyParser.Expression_assignmentContext ctx);
	/**
	 * Visit a parse tree produced by {@link UserPolicyParser#expression_call}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression_call(UserPolicyParser.Expression_callContext ctx);
	/**
	 * Visit a parse tree produced by {@link UserPolicyParser#expression_call_argument}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression_call_argument(UserPolicyParser.Expression_call_argumentContext ctx);
	/**
	 * Visit a parse tree produced by {@link UserPolicyParser#expression_handle}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression_handle(UserPolicyParser.Expression_handleContext ctx);
	/**
	 * Visit a parse tree produced by {@link UserPolicyParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression(UserPolicyParser.ExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link UserPolicyParser#multiplyingExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMultiplyingExpression(UserPolicyParser.MultiplyingExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link UserPolicyParser#powExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPowExpression(UserPolicyParser.PowExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link UserPolicyParser#signedAtom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSignedAtom(UserPolicyParser.SignedAtomContext ctx);
	/**
	 * Visit a parse tree produced by {@link UserPolicyParser#built_in_function}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBuilt_in_function(UserPolicyParser.Built_in_functionContext ctx);
	/**
	 * Visit a parse tree produced by {@link UserPolicyParser#funcname}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFuncname(UserPolicyParser.FuncnameContext ctx);
	/**
	 * Visit a parse tree produced by {@link UserPolicyParser#atom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAtom(UserPolicyParser.AtomContext ctx);
	/**
	 * Visit a parse tree produced by {@link UserPolicyParser#scientific}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitScientific(UserPolicyParser.ScientificContext ctx);
	/**
	 * Visit a parse tree produced by {@link UserPolicyParser#constant}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstant(UserPolicyParser.ConstantContext ctx);
	/**
	 * Visit a parse tree produced by {@link UserPolicyParser#variable}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariable(UserPolicyParser.VariableContext ctx);
	/**
	 * Visit a parse tree produced by {@link UserPolicyParser#environment_variable}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEnvironment_variable(UserPolicyParser.Environment_variableContext ctx);
	/**
	 * Visit a parse tree produced by {@link UserPolicyParser#entity_bracket}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEntity_bracket(UserPolicyParser.Entity_bracketContext ctx);
	/**
	 * Visit a parse tree produced by {@link UserPolicyParser#subject_service}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSubject_service(UserPolicyParser.Subject_serviceContext ctx);
	/**
	 * Visit a parse tree produced by {@link UserPolicyParser#event_service}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEvent_service(UserPolicyParser.Event_serviceContext ctx);
	/**
	 * Visit a parse tree produced by {@link UserPolicyParser#subject}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSubject(UserPolicyParser.SubjectContext ctx);
	/**
	 * Visit a parse tree produced by {@link UserPolicyParser#account}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAccount(UserPolicyParser.AccountContext ctx);
	/**
	 * Visit a parse tree produced by {@link UserPolicyParser#user_organization_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUser_organization_name(UserPolicyParser.User_organization_nameContext ctx);
}