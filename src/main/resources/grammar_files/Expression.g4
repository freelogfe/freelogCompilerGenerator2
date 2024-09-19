grammar Expression;

import CommonLibrary, EnvironmentVariable;

options { tokenVocab=LexToken; }

// 变量赋值
variable_assignment : variable_chain EQ assignment_clause ;

assignment_clause
    : expression
    | boolean_expression
    | condition_expression
    | args_group_expression
    ;

// 表达式的参数列表
expression_param_list : expression_param (COMMA expression_param)* ;

expression_param
    : (expression|boolean_expression|condition_expression|args_group_expression)
    | ID EQ (expression|boolean_expression|condition_expression)
    ;

// 参数组
args_group_expression : LBRACE args_group_param_list? RBRACE ;

args_group_param_list : args_group_param (COMMA args_group_param)* ;

args_group_param : STRING COLON (expression|boolean_expression|condition_expression) ;

// 条件表达式
condition_expression : LBRACKET condition_expression_param_list? RBRACKET;

condition_expression_param_list : condition_expression_param (COMMA condition_expression_param)* ;

condition_expression_param : (boolean_expression COLON)? expression ;

// 布尔表达式
boolean_expression
  : expression (('>' | '<' | '==' | '>=' | '<=') expression)
  | boolean_value
  ;

boolean_value : (TRUE|FALSE) ;

expression
   : multiplying_expression (('+' | '-') multiplying_expression)*
   ;

multiplying_expression
   : pow_expression (('*' | '/') pow_expression)*
   ;

pow_expression
   : signed_atom ('^' signed_atom)*
   ;

signed_atom
   : '+' signed_atom
   | '-' signed_atom
   | built_in_function
   | function_call
   | atom
   ;

built_in_function : funcname LPAREN expression_param_list? RPAREN ;

funcname : ID ;

function_call : variable_chain DOT built_in_function ;

atom
  : constant
  | scientific
  | LPAREN expression RPAREN
  | INT
  | STRING
  | entity_variable
  | variable_chain
  ;

constant
  : PI
  | EULER
  ;

scientific
  : SCIENTIFIC_NUMBER
  ;

variable_chain
    : variable
    | variable DOT ID (DOT ID)*
    ;

variable
  : environment_variable # VariableEnv
  | ID                   # VariableDef
  ;