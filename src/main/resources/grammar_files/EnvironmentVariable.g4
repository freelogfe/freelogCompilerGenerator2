grammar EnvironmentVariable;

options { tokenVocab=LexToken; }

environment_variable
  : immediate_variable
  | context_variable
  ;

immediate_variable
    : CONTRACT
    | CONTRACT DOT ID
    ;

context_variable
    : PAST_MONTH
    ;