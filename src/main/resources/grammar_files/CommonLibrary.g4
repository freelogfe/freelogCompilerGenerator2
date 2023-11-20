grammar CommonLibrary;

options { tokenVocab=LexToken; }

echo_call : ECHO DOT context_variable ;

context_variable
    : '<' ID '>'
    | '<' ID '>' DOT ID
    ;
