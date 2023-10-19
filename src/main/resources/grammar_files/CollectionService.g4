grammar CollectionService;

options { tokenVocab=LexToken; }

service_state
    : NONE
    | PARTIAL
    | FULL
    ;