lexer grammar EntityToken;

import LexToken;

ACCOUNT_NUMBER : '#' (ALPHABET|DIGIT)+ ;

SUBJECT_SERVICE_NAME : '^' ID ;
UOID : '@' ID ;
SUBJECT_ID : '%' HEX_DIGIT+ ;