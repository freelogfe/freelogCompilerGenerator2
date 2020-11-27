grammar Entity;

import EntityToken;

// this rule serve as starting rule for testing Entities only
entity_bracket : 
    ( account
    | subject
    | subject_service
    | user_organization_name
    )* EOF
    ;

account : ACCOUNT_NUMBER ;

subject : subject_service '.' user_organization_name '.' SUBJECT_ID ;

subject_service : SUBJECT_SERVICE_NAME ;

user_organization_name : UOID ;