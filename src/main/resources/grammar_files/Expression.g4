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
    | collection_expression
    ;

// 表达式的参数列表
expression_param_list : expression_param (COMMA expression_param)* ;

expression_param
    : assignment_clause
    | expression_param_name EQ assignment_clause
    ;

expression_param_name : ID ;

// 集合表达式
collection_expression : LBRACE collection_expression_content RBRACE ;

collection_expression_content : lSymbol=(LPAREN|LBRACKET) expression COMMA expression rSymbol=(RPAREN|RBRACKET) ;

// 参数组
args_group_expression : LBRACE args_group_param_list? RBRACE ;

args_group_param_list : args_group_param (COMMA args_group_param)* ;

args_group_param : args_group_param_name COLON args_group_param_value ;

args_group_param_name : STRING ;

args_group_param_value : (expression|boolean_expression|condition_expression|collection_expression) ;

// 条件表达式
condition_expression : LBRACKET condition_expression_param_list? RBRACKET;

condition_expression_param_list : condition_expression_param (COMMA condition_expression_param)* ;

condition_expression_param : (condition_expression_param_conditon COLON)? condition_expression_param_value ;

condition_expression_param_conditon : boolean_expression ;

condition_expression_param_value : (expression|boolean_expression|args_group_expression|collection_expression) ;

// 布尔表达式
boolean_expression
  : boolean_atom
  | expression
  | LPAREN boolean_expression RPAREN
  | boolean_expression (boolean_op boolean_expression)
  | boolean_expression (IN (expression|condition_expression|collection_expression))
  ;

boolean_op
    : (AND | OR)
    | (LESS|BEFORE|LESS_OR_EQUAL|GREATER|AFTER|GREATER_OR_EQUAL|EQUAL|NOT_EQUAL)
    ;

boolean_atom : (TRUE|FALSE) ;

expression
   : multiplying_expression ((PLUS | MINUS) multiplying_expression)*
   ;

multiplying_expression
   : pow_expression ((TIMES | DIV) pow_expression)*
   ;

pow_expression
   : signed_atom (POW signed_atom)*
   ;

signed_atom
   : (PLUS | MINUS) signed_atom
   | function_call
   | atom
   ;

built_in_function : funcname LPAREN expression_param_list? RPAREN ;

funcname : ID ;

function_call : (variable_chain DOT)? built_in_function ;

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
  : environment_variable
  | ID
  ;