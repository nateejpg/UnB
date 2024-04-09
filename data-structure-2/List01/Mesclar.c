#include <stdio.h>
#include <stdlib.h>

typedef struct celula {
    int dado;
    struct celula *prox;
} celula;

void mescla_listas(celula *l1, celula *l2, celula *l3) {
    celula *atual = l3;

    while (l1 != NULL && l2 != NULL) {
        if (l1->dado <= l2->dado) {
            atual->prox = l1;
            l1 = l1->prox;
        } else {
            atual->prox = l2;
            l2 = l2->prox;
        }
        atual = atual->prox;
    }

    if (l1 != NULL)
        atual->prox = l1;
    else
        atual->prox = l2;
}