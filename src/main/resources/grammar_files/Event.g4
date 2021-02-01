parser grammar Event;

options { tokenVocab=LexToken; }

event : event_service '.' (event_path '.')? event_name (event_args)? ;

event_service : EVENT_SERVICE_NAME ;

event_path : (ID '.')+ ID ;

event_name : ID ;

event_args : '(' ID (',' ID)* ')' ;