parser grammar MappingRule;

options { tokenVocab=MappingRuleToken; }

mapping_rule_section : mapping_rule* EOF? ;

mapping_rule
    : rule_add
    | rule_alter
    | rule_activate_theme
    | rule_comment_section
    ;

comment_section : COMMENT | COMMENT_LINE ;

rule_add : ADD candidate AS ID action ;
rule_alter : ALTER ID action ;
rule_activate_theme : ACTIVATE_THEME ID ;
rule_comment_section : comment_section ;

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
    | add_rely
    | delete_rely
    | line_code_comment_section
    ;
set_labels
    : SET_LABELS
    | SET_LABELS ID (SEPARATOR ID)*
    ;
replace : REPLACE target=candidate WITH source=candidate (UNDER scope (SEPARATOR scope)*)? ;
show : SHOW ;
hide : HIDE ;
set_title : SET_TITLE title=STRING ;
set_cover : SET_COVER cover=STRING ;
add_attr : ADD_ATTR key=ID value=ID description=ID? ;
delete_attr : DELETE_ATTR key=ID ;
add_rely : ADD_RELY candidate(SEPARATOR candidate)* (TO rely_target)? ;
delete_rely : DELETE_RELY candidate(SEPARATOR candidate)* (FROM rely_target)? ;
line_code_comment_section : comment_section ;

scope : candidate ('>' candidate)* ;
rely_target : candidate ('>' candidate)* ;
