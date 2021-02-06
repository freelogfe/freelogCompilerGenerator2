policy_grammar(serviceName, keep_id) ::= <<
parser grammar <serviceName>Policy;

import Entity, Expression, Event;

options { tokenVocab=LexToken; }

policy : audience_strict declaration_section? state_definition_section EOF ;

audience_strict : 'for' audience_clause ;

audience_clause
  : audience
  | audience_clause COMMA  audience_clause
  ;
audience
    : 'public'
    | 'nodes'
    | 'userGroup'
    | 'registeredUsers'
    | USER_ID
    ;

requirement : 'require' (contract_with_subject) ;

contract_with_subject : 'contract with' subject ;

declaration_section: declaration_statement+ ;

declaration_statement
  : service_state_constant
  | expression_assignment
  ;

service_state_constant : service_state_scope service_state ;

service_state_scope
  : 'always'
  ;

state_definition_section
  : state_definition+
  ;

state_definition
  : state_name service_state_definition? ':' state_transition+
  ;

state_name
  : ID
  ;

service_state_definition : '[' service_state (COMMA service_state)* ']' ;

service_state : ID ;

state_transition
  : event '=>' state_name
  | terminate='terminate'
  ;

subject_id : subject { <keep_id> } ;

>>