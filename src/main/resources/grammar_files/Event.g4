parser grammar Event;

options { tokenVocab=LexToken; }

//event : '~' EVENT_DEFINITION ;

event : '~'event_organization EVENT_POINT eventName=EVENT_SERVICE_PATH_NAME EVENT_LPAREN event_args? EVENT_RPAREN ;

event_organization : eventService=EVENT_SERVICE_PATH_NAME (EVENT_POINT event_path)? ;

event_path : EVENT_SERVICE_PATH_NAME (EVENT_POINT EVENT_SERVICE_PATH_NAME)* ;

event_args : EVENT_ARG (EVENT_COMMA EVENT_ARG)* ;