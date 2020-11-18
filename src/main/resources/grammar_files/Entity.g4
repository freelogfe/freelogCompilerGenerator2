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
    : {System.out.println("subject sta");}
      subject_service '.' user_organization_name '.' SUBJECT_ID
      {System.out.println("subject end");}
    ;
    finally {
        System.out.println("subject finally");
    }

event : event_service '.' (event_path '.')? event_name;
event_path : (ID '.')+ ID;
event_name : ID;

policy : subject_service '.' user_organization_name '.' ID;

account: ACCOUNT_NUMBER;

user_organization_name: UOID;

