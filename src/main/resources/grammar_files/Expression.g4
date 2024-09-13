grammar Expression;

import CommonLibrary, EnvironmentVariable;

options { tokenVocab=LexToken; }

expression_assignment : expression_handle LPAREN (ID (COMMA ID)*)? RPAREN '=' expression ;

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
   | function_call
   | echo_call
   | query_invocation
   | atom
   ;

built_in_function
  : funcname LPAREN expression (COMMA expression)* RPAREN
  ;

funcname
  : ID
  ;

function_call : ID DOT built_in_function ;

query_invocation
  : QUERY (DOT ID)+ param_list
  ;

param_list
  : LPAREN param_assignment (COMMA param_assignment)* RPAREN
  ;

param_assignment
  : contract_invocation
  | ID EQ expression
  ;

contract_invocation
  : contract_caller DOT built_in_function
  ;

contract_caller :
  | environment_variable
  ;

atom
  : scientific
  | constant
  | LPAREN expression RPAREN
  | INT
  | STRING
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