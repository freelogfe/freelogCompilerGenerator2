lexer grammar LexToken;

// 关键词组
FOR : 'for' ;
PUBLIC : 'public' ;
NODES : 'nodes' ;
USER_GROUP : 'userGroup' ;
REGISTERED_USERS : 'registeredUsers' ;
REQUIRE : 'require' ;
CONTRACT_WITH : 'contract with' ;
SERVICE_STATE_SCOPE
    : 'always'
    ;
TERMINATE : 'terminate' ;
SUM : 'sum' ;
PI : 'pi' ;
EULER : 'e' ;

// 关键符号
COMMA : ',' ;
POINT : '.' ;
COLON : ':' ;
LT : '<' ;
GT : '>' ;
LPAREN : '(' ;
RPAREN : ')' ;
LBRACKET : '[' ;
RBRACKET : ']' ;
PLUS : '+' ;
MINUS : '-' ;
TIMES : '*' ;
DIV : '/' ;
POW : '^' ;
EQ : '=' ;
TILDE : '~' -> pushMode(EVENT_MODE) ;
EQUANDGT : '=>' ;

USER_ID : PHONE_NUMBER_CN_MOBILE | EMAIL ;
PHONE_NUMBER_CN_MOBILE : ELEVEN_DIGITS ;
EMAIL : LOCAL_SUBPART+ '@' DOMAIN_SUBPART ('.' DOMAIN_SUBPART)* ;

// EntityToken
ACCOUNT_NUMBER : '#' (ALPHABET|DIGIT)+ ;
SUBJECT_SERVICE_NAME : '^' ID ;
UOID : '@' ID ;
SUBJECT_ID : '%' HEX_DIGIT+ ;

// ExpressionToken
SCIENTIFIC_NUMBER
   : NUMBER (('E' | 'e') SIGN? NUMBER)?
   ;

// EnvironmentVariableToken
VARIABLE_CONTRACT : 'self' '.' VARIABLE_CONTRACT_ATTRIBUTE ;
VARIABLE_CONTRACT_ATTRIBUTE
  : 'exhibited' // 展品计数
  ;

// LexToken
INT : DIGIT+ ;
ID : ALPHABET (ALPHABET | DIGIT | '_')* ;

PERIOD : ('cycle'|'cycles') | ('week'|'weeks') | ('month'|'months') | ('year'|'years') ;
DATE : FOUR_DIGITS '-' TWO_DIGITS '-' TWO_DIGITS ;
TIME : TWO_DIGITS ':' TWO_DIGITS (':' TWO_DIGITS)? ;
MONEY_AMOUNT : '$' DIGIT+ ('.' DIGIT DIGIT?)? ;

WS : [ \t\r\n]+ -> skip ;

mode EVENT_MODE;

EVENT_SERVICE_PATH_NAME : ALPHABET (ALPHABET | DIGIT | '_')* ;
EVENT_ARG : STRING ;

EVENT_COMMA : ',' ;
EVENT_POINT : '.' ;
EVENT_LPAREN : '(' ;
EVENT_RPAREN : ')' -> popMode ;

EVENT_WS : [ \t\r\n]+ -> skip ;

/*
 * fragments
 */
fragment LOCAL_SUBPART : [a-zA-Z0-9\-_]+ ;
fragment DOMAIN_SUBPART : [a-zA-Z0-9\-_]+ ;

fragment TWO_DIGITS : DIGIT DIGIT ;
fragment THREE_DIGITS : TWO_DIGITS DIGIT ;
fragment FOUR_DIGITS : TWO_DIGITS TWO_DIGITS ;
fragment NIGHT_DIGITS : FOUR_DIGITS FOUR_DIGITS DIGIT ;
fragment ELEVEN_DIGITS : FOUR_DIGITS FOUR_DIGITS THREE_DIGITS ;

fragment STRING : '"' (ESC | ~["\\])* '"' ;
fragment ESC : '\\' (["\\/bfnrt] | UNICODE) ;
fragment UNICODE : 'u' HEX_DIGIT HEX_DIGIT HEX_DIGIT HEX_DIGIT ;
fragment SIGN : '+' | '-' ;
fragment NUMBER : DIGIT+ ('.' DIGIT+)? ;
fragment DIGIT : [0-9] ;
fragment HEX_DIGIT : [0-9a-fA-F] ;
fragment ALPHABET : [a-zA-Z] ;
fragment CHINESE_WORD : '\u4e00'..'\u9fef' ;

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