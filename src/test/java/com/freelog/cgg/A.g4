grammar A;
import AToken;

@lexer::members{
    public static final int COMMENT = 1;
}

file : line* EOF ;
line : ID+ '\r'? '\n' ;

ID : [a-z];

WS : [ \t]+ -> skip ;
SL_COMMENT : '//' ~[\r\n]* -> channel(1) ;