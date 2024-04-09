#include <stdio.h>

int main() {
  int n, m;
  scanf("%d %d", &n, &m);
  int x, y;
  scanf("%d %d", &x, &y);
  int k;
  scanf("%d", &k);
  int directions[k];
  for (int i = 0; i < k; i++) {
    scanf("%d", &directions[i]);
  }

  // Contador de minutos
  int minutes = 0;

  // Posição do homem A
  int a_x = 0;
  int a_y = 0;

  // Posição do homem B
  int b_x = 0;
  int b_y = 0;

  for (int i = 0; i < k; i++) {
    // Mover o homem A
    switch (directions[i]) {
      case 1:
        a_x--;
        break;
      case 2:
        a_x++;
        break;
      case 3:
        a_y++;
        break;
      case 4:
        a_y--;
        break;
    }

    // Mover o homem B
    if (i >= 1) {
      switch (directions[i - 1]) {
        case 1:
          b_x--;
          break;
        case 2:
          b_x++;
          break;
        case 3:
          b_y++;
          break;
        case 4:
          b_y--;
          break;
      }
    }

    // Verificar se o homem A está no quadrado do microfone
    if (a_x == x && a_y == y) {
      minutes++;
    }

    // Verificar se o homem B está no quadrado do microfone
    if (b_x == x && b_y == y) {
      minutes++;
    }
  }

  printf("%d\n", minutes);

  return 0;
}
