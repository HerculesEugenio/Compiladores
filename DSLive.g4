grammar DSLive;

pilha:'Create' nome_pilha NEWLINE funcao+ EOF;
funcao: (push| pop | get_Top | apagarPilha) NEWLINE?;
apagarPilha:'Delete'  nome_pilha;
nome_pilha: TOKEN ;
push :'Push' token;
pop :'Pop';
get_Top :'Get_Top';
token : TOKEN;

TOKEN   : [a-zA-Z0-9]+;
NEWLINE : '\r'? '\n' ;  
WS      : [ \t]+ -> skip ;
