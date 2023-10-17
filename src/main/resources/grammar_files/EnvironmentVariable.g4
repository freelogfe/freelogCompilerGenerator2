grammar EnvironmentVariable;

options { tokenVocab=LexToken; }

environment_variable
  : VARIABLE_CONTRACT
  | query_invocation
  ;

query_invocation
  : QUERY (DOT ID)+ param_list
  ;

param_list
  : LBRACKET param_assignment (COMMA param_assignment)* RBRACKET
  ;

param_assignment
  : ID EQ immediate_variable
  ;

immediate_variable : THIS DOT ID;