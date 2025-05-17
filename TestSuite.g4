grammar TestSuite;

// Reglas principales

suite   : prueba+ ;

prueba  : PRUEBA texto NEWLINE* LBRACE NEWLINE* paso* RBRACE ; // #prueba

paso : pasoTipo objeto (estado+ valor?)? (Y valor)* NEWLINE ; // #paso

pasoTipo: DADO    #dadoPaso
        | CUANDO  #cuandoPaso
        | ENTONCES #entoncesPaso
        ;

objeto  : identificador (PUNTO identificador)* ;

estado  : ES 
        | NO_ES 
        | CONTIENE 
        | EXISTE 
        | DEBE
        | DEBE_CONTENER ;

valor   : texto          #textoValor
        | numero         #numeroValor
        | booleano       #booleanoValor
        | variable       #variableValor
        | lista          #listaValor ;

texto   : TEXTO_DOBLE    #textoDoble
        | TEXTO_SIMPLE   #textoSimple ;

lista   : LBRACK valor (COMA valor)* RBRACK ;

variable: DOLAR identificador ;

numero   : NUMERO ;
booleano : BOOLEANO ;

identificador : IDENTIFICADOR ;

// Tokens

PRUEBA      : 'prueba' ;
DADO        : 'dado' ;
CUANDO      : 'cuando' ;
ENTONCES    : 'entonces' ;
ES          : 'es' ;
NO_ES       : 'no es' ;
DEBE_CONTENER : 'debe contener' ;
DEBE        : 'debe' ;
CONTIENE    : 'contiene' ;
EXISTE      : 'existe' ;
Y           : 'y' ;

TEXTO_DOBLE : '"' (~["\r\n])* '"' ;
TEXTO_SIMPLE: '\'' (~['\r\n])* '\'' ;

DOLAR       : '$' ;
LBRACK      : '[' ;
RBRACK      : ']' ;
LBRACE      : '{' ;
RBRACE      : '}' ;
COMA        : ',' ;
PUNTO       : '.' ;

IDENTIFICADOR : [a-zA-Z_] [a-zA-Z0-9_]* ;
NUMERO        : [0-9]+ ;
BOOLEANO      : 'verdadero' | 'falso' ;

NEWLINE       : '\r'? '\n' ;
WS : [ \t]+ -> skip ;