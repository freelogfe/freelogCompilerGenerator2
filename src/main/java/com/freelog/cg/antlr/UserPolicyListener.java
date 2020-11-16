// Generated from generated_grammars/UserPolicy.g4 by ANTLR 4.8

    package com.freelog.cg.antlr;
    import java.util.*;

import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link UserPolicyParser}.
 */
public interface UserPolicyListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link UserPolicyParser#policy}.
	 * @param ctx the parse tree
	 */
	void enterPolicy(UserPolicyParser.PolicyContext ctx);
	/**
	 * Exit a parse tree produced by {@link UserPolicyParser#policy}.
	 * @param ctx the parse tree
	 */
	void exitPolicy(UserPolicyParser.PolicyContext ctx);
	/**
	 * Enter a parse tree produced by {@link UserPolicyParser#requirement}.
	 * @param ctx the parse tree
	 */
	void enterRequirement(UserPolicyParser.RequirementContext ctx);
	/**
	 * Exit a parse tree produced by {@link UserPolicyParser#requirement}.
	 * @param ctx the parse tree
	 */
	void exitRequirement(UserPolicyParser.RequirementContext ctx);
	/**
	 * Enter a parse tree produced by {@link UserPolicyParser#contract_with_subject}.
	 * @param ctx the parse tree
	 */
	void enterContract_with_subject(UserPolicyParser.Contract_with_subjectContext ctx);
	/**
	 * Exit a parse tree produced by {@link UserPolicyParser#contract_with_subject}.
	 * @param ctx the parse tree
	 */
	void exitContract_with_subject(UserPolicyParser.Contract_with_subjectContext ctx);
	/**
	 * Enter a parse tree produced by {@link UserPolicyParser#declaration_section}.
	 * @param ctx the parse tree
	 */
	void enterDeclaration_section(UserPolicyParser.Declaration_sectionContext ctx);
	/**
	 * Exit a parse tree produced by {@link UserPolicyParser#declaration_section}.
	 * @param ctx the parse tree
	 */
	void exitDeclaration_section(UserPolicyParser.Declaration_sectionContext ctx);
	/**
	 * Enter a parse tree produced by {@link UserPolicyParser#declaration_statements}.
	 * @param ctx the parse tree
	 */
	void enterDeclaration_statements(UserPolicyParser.Declaration_statementsContext ctx);
	/**
	 * Exit a parse tree produced by {@link UserPolicyParser#declaration_statements}.
	 * @param ctx the parse tree
	 */
	void exitDeclaration_statements(UserPolicyParser.Declaration_statementsContext ctx);
	/**
	 * Enter a parse tree produced by {@link UserPolicyParser#state_definition_section}.
	 * @param ctx the parse tree
	 */
	void enterState_definition_section(UserPolicyParser.State_definition_sectionContext ctx);
	/**
	 * Exit a parse tree produced by {@link UserPolicyParser#state_definition_section}.
	 * @param ctx the parse tree
	 */
	void exitState_definition_section(UserPolicyParser.State_definition_sectionContext ctx);
	/**
	 * Enter a parse tree produced by {@link UserPolicyParser#state_definition}.
	 * @param ctx the parse tree
	 */
	void enterState_definition(UserPolicyParser.State_definitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link UserPolicyParser#state_definition}.
	 * @param ctx the parse tree
	 */
	void exitState_definition(UserPolicyParser.State_definitionContext ctx);
	/**
	 * Enter a parse tree produced by {@link UserPolicyParser#state_transition}.
	 * @param ctx the parse tree
	 */
	void enterState_transition(UserPolicyParser.State_transitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link UserPolicyParser#state_transition}.
	 * @param ctx the parse tree
	 */
	void exitState_transition(UserPolicyParser.State_transitionContext ctx);
	/**
	 * Enter a parse tree produced by {@link UserPolicyParser#state_name}.
	 * @param ctx the parse tree
	 */
	void enterState_name(UserPolicyParser.State_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link UserPolicyParser#state_name}.
	 * @param ctx the parse tree
	 */
	void exitState_name(UserPolicyParser.State_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link UserPolicyParser#service_state}.
	 * @param ctx the parse tree
	 */
	void enterService_state(UserPolicyParser.Service_stateContext ctx);
	/**
	 * Exit a parse tree produced by {@link UserPolicyParser#service_state}.
	 * @param ctx the parse tree
	 */
	void exitService_state(UserPolicyParser.Service_stateContext ctx);
	/**
	 * Enter a parse tree produced by {@link UserPolicyParser#subject_id}.
	 * @param ctx the parse tree
	 */
	void enterSubject_id(UserPolicyParser.Subject_idContext ctx);
	/**
	 * Exit a parse tree produced by {@link UserPolicyParser#subject_id}.
	 * @param ctx the parse tree
	 */
	void exitSubject_id(UserPolicyParser.Subject_idContext ctx);
	/**
	 * Enter a parse tree produced by {@link UserPolicyParser#event}.
	 * @param ctx the parse tree
	 */
	void enterEvent(UserPolicyParser.EventContext ctx);
	/**
	 * Exit a parse tree produced by {@link UserPolicyParser#event}.
	 * @param ctx the parse tree
	 */
	void exitEvent(UserPolicyParser.EventContext ctx);
	/**
	 * Enter a parse tree produced by {@link UserPolicyParser#event_path}.
	 * @param ctx the parse tree
	 */
	void enterEvent_path(UserPolicyParser.Event_pathContext ctx);
	/**
	 * Exit a parse tree produced by {@link UserPolicyParser#event_path}.
	 * @param ctx the parse tree
	 */
	void exitEvent_path(UserPolicyParser.Event_pathContext ctx);
	/**
	 * Enter a parse tree produced by {@link UserPolicyParser#event_name}.
	 * @param ctx the parse tree
	 */
	void enterEvent_name(UserPolicyParser.Event_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link UserPolicyParser#event_name}.
	 * @param ctx the parse tree
	 */
	void exitEvent_name(UserPolicyParser.Event_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link UserPolicyParser#expression_test}.
	 * @param ctx the parse tree
	 */
	void enterExpression_test(UserPolicyParser.Expression_testContext ctx);
	/**
	 * Exit a parse tree produced by {@link UserPolicyParser#expression_test}.
	 * @param ctx the parse tree
	 */
	void exitExpression_test(UserPolicyParser.Expression_testContext ctx);
	/**
	 * Enter a parse tree produced by {@link UserPolicyParser#expression_call_or_literal}.
	 * @param ctx the parse tree
	 */
	void enterExpression_call_or_literal(UserPolicyParser.Expression_call_or_literalContext ctx);
	/**
	 * Exit a parse tree produced by {@link UserPolicyParser#expression_call_or_literal}.
	 * @param ctx the parse tree
	 */
	void exitExpression_call_or_literal(UserPolicyParser.Expression_call_or_literalContext ctx);
	/**
	 * Enter a parse tree produced by {@link UserPolicyParser#expression_assignment}.
	 * @param ctx the parse tree
	 */
	void enterExpression_assignment(UserPolicyParser.Expression_assignmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link UserPolicyParser#expression_assignment}.
	 * @param ctx the parse tree
	 */
	void exitExpression_assignment(UserPolicyParser.Expression_assignmentContext ctx);
	/**
	 * Enter a parse tree produced by {@link UserPolicyParser#expression_call}.
	 * @param ctx the parse tree
	 */
	void enterExpression_call(UserPolicyParser.Expression_callContext ctx);
	/**
	 * Exit a parse tree produced by {@link UserPolicyParser#expression_call}.
	 * @param ctx the parse tree
	 */
	void exitExpression_call(UserPolicyParser.Expression_callContext ctx);
	/**
	 * Enter a parse tree produced by {@link UserPolicyParser#expression_call_argument}.
	 * @param ctx the parse tree
	 */
	void enterExpression_call_argument(UserPolicyParser.Expression_call_argumentContext ctx);
	/**
	 * Exit a parse tree produced by {@link UserPolicyParser#expression_call_argument}.
	 * @param ctx the parse tree
	 */
	void exitExpression_call_argument(UserPolicyParser.Expression_call_argumentContext ctx);
	/**
	 * Enter a parse tree produced by {@link UserPolicyParser#expression_handle}.
	 * @param ctx the parse tree
	 */
	void enterExpression_handle(UserPolicyParser.Expression_handleContext ctx);
	/**
	 * Exit a parse tree produced by {@link UserPolicyParser#expression_handle}.
	 * @param ctx the parse tree
	 */
	void exitExpression_handle(UserPolicyParser.Expression_handleContext ctx);
	/**
	 * Enter a parse tree produced by {@link UserPolicyParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(UserPolicyParser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link UserPolicyParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(UserPolicyParser.ExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link UserPolicyParser#multiplyingExpression}.
	 * @param ctx the parse tree
	 */
	void enterMultiplyingExpression(UserPolicyParser.MultiplyingExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link UserPolicyParser#multiplyingExpression}.
	 * @param ctx the parse tree
	 */
	void exitMultiplyingExpression(UserPolicyParser.MultiplyingExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link UserPolicyParser#powExpression}.
	 * @param ctx the parse tree
	 */
	void enterPowExpression(UserPolicyParser.PowExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link UserPolicyParser#powExpression}.
	 * @param ctx the parse tree
	 */
	void exitPowExpression(UserPolicyParser.PowExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link UserPolicyParser#signedAtom}.
	 * @param ctx the parse tree
	 */
	void enterSignedAtom(UserPolicyParser.SignedAtomContext ctx);
	/**
	 * Exit a parse tree produced by {@link UserPolicyParser#signedAtom}.
	 * @param ctx the parse tree
	 */
	void exitSignedAtom(UserPolicyParser.SignedAtomContext ctx);
	/**
	 * Enter a parse tree produced by {@link UserPolicyParser#built_in_function}.
	 * @param ctx the parse tree
	 */
	void enterBuilt_in_function(UserPolicyParser.Built_in_functionContext ctx);
	/**
	 * Exit a parse tree produced by {@link UserPolicyParser#built_in_function}.
	 * @param ctx the parse tree
	 */
	void exitBuilt_in_function(UserPolicyParser.Built_in_functionContext ctx);
	/**
	 * Enter a parse tree produced by {@link UserPolicyParser#funcname}.
	 * @param ctx the parse tree
	 */
	void enterFuncname(UserPolicyParser.FuncnameContext ctx);
	/**
	 * Exit a parse tree produced by {@link UserPolicyParser#funcname}.
	 * @param ctx the parse tree
	 */
	void exitFuncname(UserPolicyParser.FuncnameContext ctx);
	/**
	 * Enter a parse tree produced by {@link UserPolicyParser#atom}.
	 * @param ctx the parse tree
	 */
	void enterAtom(UserPolicyParser.AtomContext ctx);
	/**
	 * Exit a parse tree produced by {@link UserPolicyParser#atom}.
	 * @param ctx the parse tree
	 */
	void exitAtom(UserPolicyParser.AtomContext ctx);
	/**
	 * Enter a parse tree produced by {@link UserPolicyParser#scientific}.
	 * @param ctx the parse tree
	 */
	void enterScientific(UserPolicyParser.ScientificContext ctx);
	/**
	 * Exit a parse tree produced by {@link UserPolicyParser#scientific}.
	 * @param ctx the parse tree
	 */
	void exitScientific(UserPolicyParser.ScientificContext ctx);
	/**
	 * Enter a parse tree produced by {@link UserPolicyParser#constant}.
	 * @param ctx the parse tree
	 */
	void enterConstant(UserPolicyParser.ConstantContext ctx);
	/**
	 * Exit a parse tree produced by {@link UserPolicyParser#constant}.
	 * @param ctx the parse tree
	 */
	void exitConstant(UserPolicyParser.ConstantContext ctx);
	/**
	 * Enter a parse tree produced by {@link UserPolicyParser#variable}.
	 * @param ctx the parse tree
	 */
	void enterVariable(UserPolicyParser.VariableContext ctx);
	/**
	 * Exit a parse tree produced by {@link UserPolicyParser#variable}.
	 * @param ctx the parse tree
	 */
	void exitVariable(UserPolicyParser.VariableContext ctx);
	/**
	 * Enter a parse tree produced by {@link UserPolicyParser#environment_variable}.
	 * @param ctx the parse tree
	 */
	void enterEnvironment_variable(UserPolicyParser.Environment_variableContext ctx);
	/**
	 * Exit a parse tree produced by {@link UserPolicyParser#environment_variable}.
	 * @param ctx the parse tree
	 */
	void exitEnvironment_variable(UserPolicyParser.Environment_variableContext ctx);
	/**
	 * Enter a parse tree produced by {@link UserPolicyParser#entity_bracket}.
	 * @param ctx the parse tree
	 */
	void enterEntity_bracket(UserPolicyParser.Entity_bracketContext ctx);
	/**
	 * Exit a parse tree produced by {@link UserPolicyParser#entity_bracket}.
	 * @param ctx the parse tree
	 */
	void exitEntity_bracket(UserPolicyParser.Entity_bracketContext ctx);
	/**
	 * Enter a parse tree produced by {@link UserPolicyParser#subject_service}.
	 * @param ctx the parse tree
	 */
	void enterSubject_service(UserPolicyParser.Subject_serviceContext ctx);
	/**
	 * Exit a parse tree produced by {@link UserPolicyParser#subject_service}.
	 * @param ctx the parse tree
	 */
	void exitSubject_service(UserPolicyParser.Subject_serviceContext ctx);
	/**
	 * Enter a parse tree produced by {@link UserPolicyParser#event_service}.
	 * @param ctx the parse tree
	 */
	void enterEvent_service(UserPolicyParser.Event_serviceContext ctx);
	/**
	 * Exit a parse tree produced by {@link UserPolicyParser#event_service}.
	 * @param ctx the parse tree
	 */
	void exitEvent_service(UserPolicyParser.Event_serviceContext ctx);
	/**
	 * Enter a parse tree produced by {@link UserPolicyParser#subject}.
	 * @param ctx the parse tree
	 */
	void enterSubject(UserPolicyParser.SubjectContext ctx);
	/**
	 * Exit a parse tree produced by {@link UserPolicyParser#subject}.
	 * @param ctx the parse tree
	 */
	void exitSubject(UserPolicyParser.SubjectContext ctx);
	/**
	 * Enter a parse tree produced by {@link UserPolicyParser#account}.
	 * @param ctx the parse tree
	 */
	void enterAccount(UserPolicyParser.AccountContext ctx);
	/**
	 * Exit a parse tree produced by {@link UserPolicyParser#account}.
	 * @param ctx the parse tree
	 */
	void exitAccount(UserPolicyParser.AccountContext ctx);
	/**
	 * Enter a parse tree produced by {@link UserPolicyParser#user_organization_name}.
	 * @param ctx the parse tree
	 */
	void enterUser_organization_name(UserPolicyParser.User_organization_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link UserPolicyParser#user_organization_name}.
	 * @param ctx the parse tree
	 */
	void exitUser_organization_name(UserPolicyParser.User_organization_nameContext ctx);
}