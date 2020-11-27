lexer grammar ExpressionToken;

import LexToken;

SCIENTIFIC_NUMBER
   : NUMBER (('E' | 'e') SIGN? NUMBER)?
   ;

PI : 'pi' ;
EULER : 'e' ;