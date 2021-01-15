grammar A;
import AToken;

json
    : object
    | array
    ;

object
    : '{' pair (',' pair)* '}'  # AnObject
    | '{' '}'                   # EmptyObject
    ;
pair : STRING ':' value ;

array
    : '[' value (',' value)* ']'    # AnArray
    | '[' ']'                       # EmptyArray
    ;

value
    : STRING    # String
    | NUMBER    # Atom
    | object    # ObjectValue
    | array     # ArrayValue
    | 'true'    # Atom
    | 'false'   # Atom
    | 'null'    # Atom
    ;