policy_grammar(serviceName) ::= <<
grammar <serviceName>Policy;

import CommonLibrary, <serviceName>Service, Expression, Event, LexToken;

options { tokenVocab=LexToken; }

policy : audience_strict variable_declaration_section? state_definition_section ;

// FOR
audience_strict : FOR audience_clause audience_condition? ;

audience_clause
  : audience (COMMA audience)*
  ;

audience
    : PUBLIC
    | NODE
    | USER
    | SELF
    ;

audience_condition
    : LPAREN expression_param_list? RPAREN
    ;

// 变量声明区
variable_declaration_section : variable_definition+ ;

variable_definition
    : global_variable_definition
    | macro_variable_definition
    | expression_definition
    ;

global_variable_definition : global_variable_name EQ assignment_clause ;

global_variable_name
    : ID
    ;

macro_variable_definition : macro_variable_name ASSIGMENT_SYMBOL assignment_clause ;

macro_variable_name
    : ID
    ;

expression_definition : DEF_EXPR expression_def_declaration EQ condition_expression ;

expression_def_declaration : built_in_function ;

// 状态机状态
state_definition_section : state_definition+ ;

state_definition : state_name service_state_section? COLON state_context_args_section? fsm_assignment_section? state_transition+ ;

state_name : ID ;

service_state_section
  : service_state
  | service_state service_state_collection
  | service_state_collection
  ;

service_state : ID ;

service_state_collection : LBRACE ID (COMMA ID)* RBRACE ;

state_context_args_section : LBRACKET ID+ RBRACKET ;

// 赋值区
fsm_assignment_section : fsm_assigment+ ;

fsm_assigment
    : variable_assignment                               #FsmVarAssignment
    | LET local_variable_name EQ assignment_clause      #FsmVarInitial
    ;

local_variable_name : ID ;

state_transition
  : event XFER state_name state_context_args_section? action_section?   #EventNormal
  | TERMINATE                                                               #EventTerminate
  ;

action_section : LBRACE action (SEMICOLON action)* RBRACE ;

action
    : function_call         #FsmActionFunctionCall
    | variable_assignment   #FsmActionVarAssignment
    ;
>>