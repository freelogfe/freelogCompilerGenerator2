parser grammar Rule;

options { tokenVocab=RuleToken; }

mapping_rule_section
    : mapping_rule*
    ;

mapping_rule
    : rule_add
    | rule_alter
    | rule_activate_theme
    ;

rule_add : ADD candidate AS ID action ;
rule_alter : ALTER ID action ;
rule_activate_theme : ACTIVATE_THEME ID ;

candidate
    : resource_name
    | object_name
    ;
resource_name : '$' userName=ID '/' resourceName=ID ('@' SEMVER)? ;
object_name : '#' bucketName=ID '/' objectName=ID ;

action
    : DO line_code* END
    | line_code
    ;
line_code
    : set_labels
    | replace
    | show
    | hide
    | set_title
    | set_cover
    | add_attr
    | delete_attr
    ;
set_labels
    : SET_LABELS
    | SET_LABELS ID (',' ID)*
    ;
replace : REPLACE target=candidate WITH source=candidate (UNDER scope (',' scope)*)? ;
show : SHOW ;
hide : HIDE ;
set_title : SET_TITLE ID ;
set_cover : SET_COVER ID ;
add_attr : ADD_ATTR key=ID value=ID description=ID? ;
delete_attr : DELETE_ATTR ID ;

scope : candidate ('>' candidate)* ;
