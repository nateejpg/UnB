#include <stdio.h>
#include <stdlib.h>
#include <string.h>

// Estrutura para representar uma instrução
typedef struct {
    int codigo;
    char palavra_chave[16];
} Instrucao;

// Função para carregar as instruções na memória
void carregar_instrucoes(int num_instrucoes, Instrucao instrucoes[]) {
    for (int i = 0; i < num_instrucoes; i++) {
        scanf("%d %s", &instrucoes[i].codigo, instrucoes[i].palavra_chave);
    }
}

// Função para consultar as instruções e imprimir as palavras-chave correspondentes
void consultar_instrucoes(int num_consultas, int consultas[], int num_instrucoes, Instrucao instrucoes[]) {
    for (int i = 0; i < num_consultas; i++) {
        int codigo = consultas[i];
        int encontrado = 0;
        for (int j = 0; j < num_instrucoes; j++) {
            if (instrucoes[j].codigo == codigo) {
                printf("%s\n", instrucoes[j].palavra_chave);
                encontrado = 1;
                break;
            }
        }
        if (!encontrado) {
            printf("undefined\n");
        }
    }
}

int main() {
    int num_instrucoes;
    scanf("%d", &num_instrucoes);

    Instrucao instrucoes[num_instrucoes];

    // Carrega as instruções na memória
    carregar_instrucoes(num_instrucoes, instrucoes);

    int consultas[1000]; // Assumindo um máximo de 1000 consultas
    int num_consultas = 0;
    int codigo;
    while (scanf("%d", &codigo) != EOF) {
        consultas[num_consultas++] = codigo;
    }

    // Consulta e imprime as palavras-chave correspondentes
    consultar_instrucoes(num_consultas, consultas, num_instrucoes, instrucoes);

    return 0;
}
