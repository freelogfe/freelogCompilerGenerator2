grammar EnvironmentVariable;

options { tokenVocab=LexToken; }

environment_context
    : (POLICY | CONTRACT)
    ;

environment_event
  : EVNET_VARIABLE
  ;