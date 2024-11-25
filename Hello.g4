grammar Hello;
prog : hi* EOF ; // match uma ou mais instâncias de hi
hi : 'hello' ID ; // match o token hello seguido de ID
ID : [a-z]+ ; // match identificadores com letras minúsculas
WS : [ \t\r\n]+ -> skip ; // desconsidera espaços, tabs, quebras-de-linha