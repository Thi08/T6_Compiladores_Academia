lexer grammar Treino;

/*
    Declaração das regras léxicas
*/

// Regra léxica para iniciar a lista de treino
TREINO: 'treino';

// Regra léxica para iniciar a categoria dos items da lista de treino

treino
PEITO: 'peito';
TRICEPS: 'triceps';
COSTAS: 'costas';
BICEPS: 'biceps';
PERNAS: 'pernas';
OMBROS: 'ombros';

// Regra léxica para iniciar o treino
// TOTAL: 'total';

// Regra léxicas para iniciar números inteiros e reais utilizado para indicar a quantidade de series
NUM_INT	: ('0'..'9')+;

// Regra léxica para iniciar o nome de cada exercicio
CADEIA : ('a'..'z'|'A'..'Z') ('a'..'z'|'A'..'Z' | ' ')*;

fragment
ESC_SEQ	: '\\\'';
COMENTARIO : '{' ~('\n'|'\r'|'}')* '}' {skip();};
WS : ( ' ' | '\t' | '\r' | '\n') {skip();};

// Regras léxicas para pontuações
VIRGULA: ',';
DOISPONTOS: ':';

// Regra léxica para verificação de erros
ERRO: .;

/*
    Declaração das regras sintáticas
*/

/*lista_treino: 'treino' lista_peito lista_triceps lista_costas lista_biceps lista_pernas lista_ombros <EOF>;
lista_peito: 'peito' exercicio+;
lista_triceps: 'açougue' exercicio+;
lista_costas: 'costas' exercicio+;
lista_biceps: 'biceps' exercicio+;
lista_pernas: 'pernas' exercicio+;
lista_ombros: 'ombros' exercicio+;

exercio: nome ',' valor;
nome: CADEIA;
quantidade: NUM_INT;
*/