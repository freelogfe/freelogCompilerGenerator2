grammar A;
import AToken;

abc : A | AB ;
A : 'a' {System.out.println(1);} ;
AB : 'ab' {System.out.println(2);} ;

WS : [ \t\r\n]+ -> skip ;