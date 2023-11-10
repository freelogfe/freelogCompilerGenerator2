grammar EnvironmentVariable;

options { tokenVocab=LexToken; }

environment_variable
  : immediate_variable
  ;

immediate_variable
    : CONTRACT
    | CONTRACT DOT ID
    ;