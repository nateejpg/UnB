#include <stdio.h>
#include <stdlib.h>

typedef struct celula {
   int dado;
   struct celula *prox;
} celula;

celula *busca(celula *le, int x) {
    celula *p;
    for (p = le->prox; p != NULL; p = p->prox) {
        if (p->dado == x) {
            return p; // Retorna ponteiro para a célula que contém x
        }
    }
    return NULL; // Se não encontrou x, retorna NULL
}

celula *busca_rec(celula *le, int x) {
    if (le == NULL) {
        return NULL; // Lista vazia, retorna NULL
    }
    if (le->dado == x) {
        return le; // Encontrou x, retorna ponteiro para a célula atual
    } else {
        return busca_rec(le->prox, x); // Chama a busca recursivamente na próxima célula
    }
}