grammar VarCalculator;

program:
    stat* EOF
    ;

stat:
    assignment? NEWLINE                     
    | expr? NEWLINE
    ;

assignment:
    ID '=' expr                             #Assign
    ;

expr:
    '(' expr ')'                            #ExprParent  
    | expr op=('*'|'/') expr                #ExprMulDiv
    | expr op=('+'|'-') expr                #ExprAddSub
    | Number                                #ExprDouble
    | ID                                    #ExprID
    ;

Number: [0-9]+('.'[0-9]+)?;
ID: [a-zA-Z_]+;
NEWLINE: '\r'? '\n';
WS: [ \t]+ -> skip;
COMMENT: '#' .*? '\n' -> skip;