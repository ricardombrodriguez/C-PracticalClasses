grammar SuffixCalculator;
program:
    stat* EOF                       //zero or more repetitions of stat
    ;
stat:
    expr? NEWLINE                   //optative expr followed by end of line
    ;
expr:   
    expr expr op=('*'|'/'|'+'|'-')  #ExprSuffix
    | Number                        #ExprNumber
    ;
Number: [0-9]+('.'[0-9]+)?;         //fixed point real number
NEWLINE: '\r'? '\n';
WS: [ \t]+ -> skip;