grammar Event;

options { tokenVocab=LexToken; }

//event : '~' EVENT_DEFINITION ;

event : EVENT DOT event_path param_list? ;

event_path : ID (DOT ID)* ;

param_list : LBRACKET param (COMMA param )* RBRACKET ;

param: ID EQ value ;

value : STRING|NUMERIC_LITERAL|MONEY_AMOUNT|PI|EULER ;