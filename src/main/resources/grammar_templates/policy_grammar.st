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
  : event XFER state_name
  | TERMINATE
  ;

>>