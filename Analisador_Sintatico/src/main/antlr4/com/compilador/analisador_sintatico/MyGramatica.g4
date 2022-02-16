grammar MyGramatica;

TIPO_VAR
        : 'Inter' | 'Dec';

NUM_INTER
        : ('0'..'9')+
        ;

NUM_DEC
        : ('0'..'9') + (. ('0'..'9')+)?
        ;

VAR
        : ('a'..'z'|'A'..'Z') ('a'..'z'|'A'..'Z'|'0'..'9')*
        ;

OpLog
        : '<' | '>' | '<=' | '>=' | '='
        ;

OpArit1
        : '+' | '-'
        ;

OpArit2
        : '*' | '/'
        ;
OpCond
        : 'ese' | 'sen' | 'enq'
        ;


listaDeclaracoes
        : declaracao listaDeclaracoes | declaracao
        ;
declaracao
        : VAR ':' TIPO_VAR
        ;

listaInstrucoes
        : instrucao listaInstrucoes | instrucao
        ;
instrucao
        : instrucaoAtribuicao | instrucaoEntrada | instrucaoSaida
        ;
program
        : '^' 'DECLARACOES' listaDeclaracoes '^' 'ALGORITMOS' listaInstrucoes
        ;
expressaoAritmetica
        : expressaoAritmetica OpArit2 termo | termo
        ;
termo
    : termo OpArit2 fator | fator
    ;
fator
    : NUM_INTER | NUM_DEC | VAR
    ;
instrucaoAtribuicao
        : 'SET' expressaoAritmetica '=' VAR
        ;

instrucaoEntrada
        : 'rec' VAR
        ;

instrucaoSaida
        : 'print' VAR
        ;

