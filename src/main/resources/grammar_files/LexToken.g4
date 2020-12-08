lexer grammar LexToken;

ID
  : ALPHABET (ALPHABET | INT | '_')*
  ;

INT : DIGIT+ ;

USER_ID : PHONE_NUMBER_CN_MOBILE | EMAIL ;

PHONE_NUMBER_CN_MOBILE : ELEVEN_DIGITS ;
EMAIL : LOCAL_SUBPART ('.' LOCAL_SUBPART)* '@' DOMAIN_SUBPART ('.' DOMAIN_SUBPART)* ;

PERIOD : ('cycle'|'cycles') | ('week'|'weeks') | ('month'|'months') | ('year'|'years') ;

TIME : TWO_DIGITS ':' TWO_DIGITS (':' TWO_DIGITS)? ;
DATE : FOUR_DIGITS '-' TWO_DIGITS '-' TWO_DIGITS ;

MONEY_AMOUNT : '$' DIGIT+ ('.' DIGIT DIGIT?)? ;


/*
 * fragments
 */
fragment LOCAL_SUBPART : [a-zA-Z0-9\-_~!$&()*+,;=:]+ ;
fragment DOMAIN_SUBPART : [a-zA-Z0-9\-]+ ;

fragment TWO_DIGITS : DIGIT DIGIT ;
fragment THREE_DIGITS : TWO_DIGITS DIGIT ;
fragment FOUR_DIGITS : TWO_DIGITS TWO_DIGITS ;
fragment NIGHT_DIGITS : FOUR_DIGITS FOUR_DIGITS DIGIT ;
fragment ELEVEN_DIGITS : FOUR_DIGITS FOUR_DIGITS THREE_DIGITS ;

fragment DIGIT : [0-9] ;
fragment ALPHABET : [a-zA-Z] ;
fragment HEX_DIGIT : [0-9a-fA-F] ;

fragment A : ('A'|'a') ;
fragment B : ('B'|'b') ;
fragment C : ('C'|'c') ;
fragment D : ('D'|'d') ;
fragment E : ('E'|'e') ;
fragment F : ('F'|'f') ;
fragment G : ('G'|'g') ;
fragment H : ('H'|'h') ;
fragment I : ('I'|'i') ;
fragment J : ('J'|'j') ;
fragment K : ('K'|'k') ;
fragment L : ('L'|'l') ;
fragment M : ('M'|'m') ;
fragment N : ('N'|'n') ;
fragment O : ('O'|'o') ;
fragment P : ('P'|'p') ;
fragment Q : ('Q'|'q') ;
fragment R : ('R'|'r') ;
fragment S : ('S'|'s') ;
fragment T : ('T'|'t') ;
fragment U : ('U'|'u') ;
fragment V : ('V'|'v') ;
fragment W : ('W'|'w') ;
fragment X : ('X'|'x') ;
fragment Y : ('Y'|'y') ;
fragment Z : ('Z'|'z') ;

fragment LPAREN : '(' ;
fragment RPAREN : ')' ;
fragment PLUS : '+' ;
fragment MINUS : '-' ;
fragment TIMES : '*' ;
fragment DIV : '/' ;
fragment GT : '>' ;
fragment LT : '<' ;
fragment EQ : '=' ;
fragment COMMA : ',' ;
fragment POINT : '.' ;
fragment POW : '^' ;

fragment NUMBER
   : ('0' .. '9') + ('.' ('0' .. '9') +)?
   ;

fragment SIGN
   : ('+' | '-')
   ;

WS : [ \t\r\n]+ -> skip ;