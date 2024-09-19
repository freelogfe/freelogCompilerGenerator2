grammar CommonLibrary;

options { tokenVocab=LexToken; }

entity_variable : ENTITY DOT ID DOT LT entity_name GT ;

entity_name : .*? ;