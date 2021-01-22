lexer grammar AToken;

ID
  : ALPHABET (ALPHABET | INT | '_')*
  ;

INT : DIGIT+ ;
fragment DIGIT : [0-9] ;
fragment ALPHABET : [a-zA-Z] ;

WS : [ \t\n\r]+ -> skip ;