grammar Expression;

import EnvironmentVariable;

options { tokenVocab=LexToken; }

expression_assignment: expression_handle LPAREN (ID (COMMA ID)*)? RPAREN '=' expression ;

expression_handle : ID ;

boolean_expression
  : expression (('>' | '<' | '==' | '>=' | '<=') expression)
  | boolean_value
  ;

expression
   : multiplyingExpression (('+' | '-') multiplyingExpression)*
   ;

multiplyingExpression
   : powExpression (('*' | '/') powExpression)*
   ;

powExpression
   : signedAtom ('^' signedAtom)*
   ;

signedAtom
   : '+' signedAtom
   | '-' signedAtom
   | built_in_function
   | query_invocation
   | atom
   ;

built_in_function
  : funcname LPAREN expression (COMMA expression)* RPAREN
  ;

funcname
  : ID
  ;

query_invocation
  : QUERY (DOT ID)+ param_list
  ;

param_list
  : LBRACKET param_assignment (COMMA param_assignment)* RBRACKET
  ;

param_assignment
  : contract_invocation
  | ID EQ expression
  ;

contract_invocation
  : contract_caller built_in_function
  ;

contract_caller:
  | CONTRACT DOT
  ;

atom
  : scientific
  | constant
  | LPAREN expression RPAREN
  | INT
  | variable
  ;

scientific
  : SCIENTIFIC_NUMBER
  ;

constant
  : PI
  | EULER
  ;

variable
  : environment_variable # VariableEnvironment
  | ID                   # VariableArg
  ;

boolean_value
  : TRUE
  | FALSE
  ;

//expression_call_or_literal
//     : expression_call
//     | expression
//     ;
//
//   expression_call : expression_handle LPAREN (expression_call_argument (COMMA expression_call_argument)*)* RPAREN ;
//
//   expression_call_argument
//     : INT
//     | environment_variable
//     ;