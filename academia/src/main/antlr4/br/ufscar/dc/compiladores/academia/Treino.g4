grammar Treino;

// Regra léxica para iniciar a lista de treino
TREINO: 'treino';

//Regra léxica para separar series de repetiçoes
DE: '-';

// Regra léxica para iniciar a categoria dos items da lista de treino
PEITO: 'peito';
TRICEPS: 'triceps';
COSTAS: 'costas';
BICEPS: 'biceps';
PERNAS: 'pernas';
OMBROS: 'ombros';

// TOTAL: 'total';


// Regra léxicas para iniciar números inteiros e reais utilizado para indicar a quantidade de series e repetiçoes
NUM_INT	: ('0'..'9')+;

// Regra léxica para iniciar o nome de cada exercicio
CADEIA : ('a'..'z'|'A'..'Z') ('a'..'z'|'A'..'Z' | ' ')*;

ESC_SEQ	: '\\\'';
COMENTARIO : '{' ~('\n'|'\r'|'}')* '}' {skip();};
COMENTARIO_NAO_FECHADO: '{' ~('\n'|'}')*? '\n';
WS : ( ' ' | '\t' | '\r' | '\n') {skip();};

// Regras léxicas para pontuações
VIRGULA: ',';
// DOISPONTOS: ':';

// Regra léxica para verificação de erros
ERRO: .;


/*
    Declaração das regras sintáticas
*/

lista_treino: 'treino' lista_peito lista_triceps lista_costas lista_biceps lista_pernas lista_ombros <EOF>;
lista_peito: 'peito' exercicio+;
lista_triceps: 'triceps' exercicio+;
lista_costas: 'costas' exercicio+;
lista_biceps: 'biceps' exercicio+;
lista_pernas: 'pernas' exercicio+;
lista_ombros: 'ombros' exercicio+;

exercicio: nome ',' series '-' repeticoes;
nome: CADEIA;
series: NUM_INT;
repeticoes: NUM_INT;