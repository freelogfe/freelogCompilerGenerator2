policy_grammar(serviceName) ::= <<
grammar <serviceName>Policy;

import Entity, CommonService, <serviceName>Service, Expression, Event, LexToken;

options { tokenVocab=LexToken; }

policy : config_section? service_state_collection_section? context_variable_section? state_definition+ ;

config_section: config_definition+ ;

config_definition : ID COLON ID ;

service_state_collection_section : service_state_collection_definition+ ;

service_state_collection_definition : ID ASSIGMENT_SYMBOL LBRACE collection_definition RBRACE ;

collection_definition
  :  (LPAREN | LBRACKET) expression COMMA expression (RPAREN | RBRACKET)
  ;

context_variable_section : context_variable_definition+ ;

context_variable_definition : ID ASSIGMENT_SYMBOL echo_call ;

state_definition
  : state_name service_state_section with_condition_section? COLON assignments? state_transition+
  ;

state_name
  : ID
  ;

service_state_section
  : service_state service_state_collection?
  ;

service_state_collection
  : LBRACE ID (COMMA ID)* RBRACE
  ;

with_condition_section
  : WITH_CONDITION LBRACKET expression RBRACKET
  ;

assignments : assigment+ ;

assigment : LET ID EQ expression ;

state_transition
  : cased_transition+
  | single_transision
  | TERMINATE
  ;

single_transision
  : event XFER state_name
  ;

cased_transition
  : CASE cased_expression COLON single_transision
  ;

cased_expression
  : boolean_expression
  | OTHER
  ;
>>