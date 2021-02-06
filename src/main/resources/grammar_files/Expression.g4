parser grammar Expression;

import EnvironmentVariable;

options { tokenVocab=LexToken; }

expression_assignment: expression_handle LPAREN (ID (COMMA ID)*)? RPAREN '=' expression ;

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
  : funcname LPAREN expression (COMMA expression)* RPAREN
  ;

funcname
  : 'sum'
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

expression_call_or_literal
  : expression_call
  | expression
  ;

expression_call : expression_handle LPAREN (expression_call_argument (COMMA expression_call_argument)*)* RPAREN ;

expression_call_argument
  : INT
  | environment_variable
  ;