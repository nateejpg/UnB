#include <stdio.h>

int main() {
  int n, i, digitos[1000], ultimo = -1, atual = 0, potencia = 1;
  scanf("%d", &n);
  for (i = 0; i < n; i++) {
    scanf("%d", &digitos[i]);
  }

  for (i = n - 1; i >= 0; i--) {
    if (digitos[i] == ultimo) {
      atual += digitos[i] * potencia;
      potencia *= 10;
    } else {
      if (ultimo != -1) {
        if (atual > ultimo) {
          if (atual > potencia - 1) {
            break;
          }
          atual -= ultimo * potencia;
          potencia /= 10;
        } else {
          break;
        }
      }
      ultimo = digitos[i];
      atual = digitos[i];
      potencia = 10;
    }
  }

  printf("%d\n", atual);

  return 0;
}
