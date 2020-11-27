policy_grammar(serviceName, keep_id) ::= <<
grammar <serviceName>Policy;

import <serviceName>Service, Entity, Expression, Event;

policy : requirement declaration_section? state_definition_section EOF ;

requirement : 'require' (contract_with_subject) ;

contract_with_subject : 'contract' 'with' subject ;

declaration_section: declaration_statements+ ;

declaration_statements
  : expression_assignment
  ;

state_definition_section
  : state_definition+
  ;

state_definition
  : state_name service_state_definition? ':' state_transition+
  ;

state_name : ID ;

service_state_definition : '[' service_state (',' service_state)* ']' ;

service_state : ID ;

state_transition
  : 'proceed' 'to' state_name 'on' event
  | 'terminate'
  ;

subject_id : subject { <keep_id> } ;

>>