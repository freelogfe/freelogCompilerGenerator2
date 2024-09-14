grammar Event;

import Expression;

options { tokenVocab=LexToken; }

event : EVENT DOT event_path DOT built_in_function ;

event_path : ID (DOT ID)* ;