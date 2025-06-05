grammar CommonLibrary;

options { tokenVocab=LexToken; }

entity_variable : entity_type DOT ENTITY_NAME ;

entity_type : ID ;