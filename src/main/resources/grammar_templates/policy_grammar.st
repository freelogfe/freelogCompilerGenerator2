policy_grammar(serviceName, keep_id) ::= <<
grammar <serviceName>Policy;

import LexToken, <serviceName>Service, Event, Expression, Entity;

@header {
    package com.freelog.cg.antlr;
    import java.util.*;
}
@parser::members {
    public static Stack\<String> stack = new Stack\<>();

    public static void putCycle(String cycle){
        stack.push(cycle);
    }

    public static void popCycle(){
        if(!stack.isEmpty()){
            stack.pop();
        }
    }

    public static String getCycle(){
        if(!stack.isEmpty()){
            return stack.peek();
        }else{
            return null;
        }
    }
}
@lexer::members {
    public static String getCycle(){
        return <serviceName>PolicyParser.getCycle();
    }
}

policy : requirement declaration_section? state_definition_section EOF;

requirement : REQUIRE (contract_with_subject);

contract_with_subject : 'contract' 'with' subject;

declaration_section: declaration_statements+ ;

declaration_statements
  : expression_assignment
  ;

state_definition_section
  :  state_definition+
  ;

state_definition
  : service_state? state_name ':' state_transition+
  ;

state_transition
  : 'proceed' 'to' state_name 'on' event
  | TERMINATE
  ;

state_name : ID ;

service_state
  : 'authorized'
  | 'unauthorized'
  ;

subject_id : subject { <keep_id> };

>>