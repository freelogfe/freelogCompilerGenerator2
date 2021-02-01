parser grammar Entity;

options { tokenVocab=LexToken; }

entity_bracket :
    ( account
    | subject
    | subject_service
    | user_organization_name
    )*
    ;

account : ACCOUNT_NUMBER ;

subject : subject_service '.' user_organization_name '.' SUBJECT_ID ;

subject_service : SUBJECT_SERVICE_NAME ;

user_organization_name : UOID ;