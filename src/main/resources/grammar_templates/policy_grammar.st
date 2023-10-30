policy_grammar(serviceName) ::= <<
grammar <serviceName>Policy;

import Entity, <serviceName>Service, Expression, Event, LexToken;

options { tokenVocab=LexToken; }

policy : state_definition+ ;

state_definition
  : service_state state_name COLON assignments? state_transition+
  ;

state_name
  : ID
  ;

assignments : assigment+ ;

assigment : LET ID EQ expression;

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