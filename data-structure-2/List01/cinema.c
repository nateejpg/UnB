#include <stdio.h>
#include <stdlib.h>

#define MAX_FILEIRAS 20
#define MAX_LUGARES 25

void criarSala(char sala[MAX_FILEIRAS][MAX_LUGARES]) {
    for (int i = 0; i < MAX_FILEIRAS; i++) {
        for (int j = 0; j < MAX_LUGARES; j++) {
            sala[i][j] = '-';
        }
    }
}

void marcarLugarOcupado(char sala[MAX_FILEIRAS][MAX_LUGARES], char *bilhete) {
    char letra = bilhete[0];
    int numero = atoi(bilhete + 1) - 1;
    int fila = letra - 'A';
    sala[fila][numero] = 'X';
}

void exibirMapaSala(char sala[MAX_FILEIRAS][MAX_LUGARES], int fileiras, int lugares) {
    printf("  ");
    for (int i = 0; i < lugares; i++) {
        printf("%02d ", i + 1);
    }
    printf("\n");

    for (int i = fileiras - 1; i >= 0; i--) {
        printf("%c ", 'A' + i);
        for (int j = 0; j < lugares; j++) {
            printf("%c%c ", sala[i][j], sala[i][j]);
        }
        printf("\n");
    }
}

int main() {
    int fileiras, lugares;
    scanf("%d %d", &fileiras, &lugares);

    char sala[MAX_FILEIRAS][MAX_LUGARES];
    criarSala(sala);

    char bilhete[4];
    while (scanf("%s", bilhete) != EOF) {
        marcarLugarOcupado(sala, bilhete);
    }

    exibirMapaSala(sala, fileiras, lugares);

    return 0;
}
