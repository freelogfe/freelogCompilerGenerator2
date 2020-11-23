grammar Entity;
import LexToken;

//this rule serve as starting rule for testing Entities only
entity_bracket : 
    ( subject_service
    | event_service
    | subject
    | event
    | policy
    | account
    | user_organization_name
    )* EOF
    ;

subject_service :SUBJECT_SERVICE_NAME;
event_service : EVENT_SERVICE_NAME;

subject
@init {
    putCycle("subject");
}
@after {
    popCycle();
}
    : {logger.info("subject sta");}
      subject_service '.' user_organization_name '.' SUBJECT_ID
      {logger.info("subject end");}
    ;
    finally {
       logger.info("subject finally");
    }

event : event_service '.' (event_path '.')? event_name;
event_path : (ID '.')+ ID;
event_name : ID;

policy : subject_service '.' user_organization_name '.' ID;

account: ACCOUNT_NUMBER;

user_organization_name: UOID;

