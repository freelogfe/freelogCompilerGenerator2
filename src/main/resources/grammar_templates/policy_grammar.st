policy_grammar(serviceName) ::= <<
grammar <serviceName>Policy;

import Entity, CommonLibrary, <serviceName>Service, Expression, Event, LexToken;

options { tokenVocab=LexToken; }

policy : audience_strict variable_declaration_section state_definition_section ;

audience_strict : FOR audience_clause ;

audience_clause
  : audience
  | audience_clause COMMA  audience_clause
  ;

audience
    : PUBLIC
    | NODE
    | USER
    ;

variable_declaration_section : variable_definition* ;

variable_definition
    : global_variable_definition
    | macro_variable_definition
    | expression_definition
    ;

global_variable_definition : ID EQ expression ;

macro_variable_definition : ID ASSIGMENT_SYMBOL expression ;

expression_definition : DEF_EXPR ID LPAREN (ID (COMMA ID)*)? RPAREN EQ condition_expression_definition ;

condition_expression_definition : LBRACKET (condition_expression (COMMA condition_expression)*)? RBRACKET;

condition_expression : (boolean_expression COLON)? expression ;

state_definition_section : state_definition+ ;

state_definition
  : state_name service_state_section? COLON assignments? state_transition+
  ;

state_name
  : ID
  ;

service_state_section
  : service_state
  | service_state service_state_collection
  | service_state_collection
  ;

service_state_collection
  : LBRACE ID (COMMA ID)* RBRACE
  ;

assignments : assigment+ ;

assigment : LET ID ASSIGMENT_SYMBOL query_invocation ;

state_transition
  : single_transition
  | TERMINATE
  ;

single_transition
  : event XFER state_name
  ;
>>