grammar Expression;

import ExpressionToken, EnvironmentVariable;

expression_test : expression + EOF ;

expression_assignment: expression_handle '(' (ID (',' ID)*)? ')' '=' expression ;

expression_handle : ID ;

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
   | atom
   ;

built_in_function
  : funcname '(' expression (',' expression)* ')'
  ;

funcname
  : 'sum'
  ;

atom
  : scientific
  | constant
  | '(' expression ')'
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

expression_call_or_literal
  : expression_call
  | expression
  ;

expression_call : expression_handle '(' (expression_call_argument (',' expression_call_argument)*)* ')' ;

expression_call_argument
  : INT
  | environment_variable
  ;