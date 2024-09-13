grammar Event;

import Expression;

options { tokenVocab=LexToken; }

event : EVENT DOT event_path event_param_list ;

event_path : ID (DOT ID)* ;

event_param_list : LPAREN (event_param (COMMA event_param )*)? RPAREN ;

event_param
    : event_value
    | ID EQ event_value
    ;

event_value : expression ;