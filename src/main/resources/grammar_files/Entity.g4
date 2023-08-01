parser grammar Entity;

options { tokenVocab=LexToken; }

subject_icon
  : ID
  ;

subject_icon_lv
  : ID
  ;

//entity_bracket :
//    ( account
//    | subject
//    | subject_service
//    | user_organization_name
//    )*
//    ;

//account : ACCOUNT_NUMBER ;

//subject : subject_service POINT user_organization_name POINT SUBJECT_ID ;

//subject_service : SUBJECT_SERVICE_NAME ;

//user_organization_name : UOID ;