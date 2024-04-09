#include <stdio.h>

typedef struct {
    int x;
    int y;
} Coordenada;

// Função para verificar se dois professores se encontraram, saíram do CP ou não se encontraram
void verificar_encontro(int cols, int rows, int p, int movimentos[][2]) {
    Coordenada pos_pa = {1, 1};
    Coordenada pos_pb = {cols, rows};
    
    for (int i = 0; i < p; i++) {
        int mov_pa = movimentos[i][0];
        int mov_pb = movimentos[i][1];
        
        // Movimento do professor PA
        if (mov_pa == 1) pos_pa.y++;
        else if (mov_pa == 2) pos_pa.y--;
        else if (mov_pa == 3) pos_pa.x++;
        else pos_pa.x--;
        
        // Movimento do professor PB
        if (mov_pb == 1) pos_pb.y++;
        else if (mov_pb == 2) pos_pb.y--;
        else if (mov_pb == 3) pos_pb.x++;
        else pos_pb.x--;
        
        // Verifica se os professores se encontraram
        if (pos_pa.x == pos_pb.x && pos_pa.y == pos_pb.y) {
            printf("Encontraram-se na posicao (%d,%d) no passo %d\n", pos_pa.x, pos_pa.y, i + 1);
            return;
        }
        
        // Verifica se algum professor saiu do CP
        if (pos_pa.x < 1 || pos_pa.x > cols || pos_pa.y < 1 || pos_pa.y > rows) {
            printf("PA saiu na posicao (%d,%d) no passo %d\n", pos_pa.x, pos_pa.y, i + 1);
            return;
        }
        else if (pos_pb.x < 1 || pos_pb.x > cols || pos_pb.y < 1 || pos_pb.y > rows) {
            printf("PB saiu na posicao (%d,%d) no passo %d\n", pos_pb.x, pos_pb.y, i + 1);
            return;
        }
    }
    
    printf("Nao se encontraram\n");
}

int main() {
    int cols, rows, p;
    scanf("%d %d", &cols, &rows);
    scanf("%d", &p);
    
    int movimentos[p][2];
    for (int i = 0; i < p; i++) {
        scanf("%d %d", &movimentos[i][0], &movimentos[i][1]);
    }
    
    verificar_encontro(cols, rows, p, movimentos);
    
    return 0;
}
