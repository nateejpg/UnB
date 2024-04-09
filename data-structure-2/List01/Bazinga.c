#include <stdio.h>
#include <string.h>

int main() {
    char sheldon[10], raj[10];
    
    // Lendo as escolhas de Sheldon e Raj
    scanf("%s %s", sheldon, raj);
    
    // Verificando o resultado com base nas escolhas
    if (strcmp(sheldon, raj) == 0) {
        printf("De novo!\n");
    } else if (
        (strcmp(sheldon, "pedra") == 0 && (strcmp(raj, "lagarto") == 0 || strcmp(raj, "tesoura") == 0)) ||
        (strcmp(sheldon, "papel") == 0 && (strcmp(raj, "pedra") == 0 || strcmp(raj, "Spock") == 0)) ||
        (strcmp(sheldon, "tesoura") == 0 && (strcmp(raj, "papel") == 0 || strcmp(raj, "lagarto") == 0)) ||
        (strcmp(sheldon, "lagarto") == 0 && (strcmp(raj, "Spock") == 0 || strcmp(raj, "papel") == 0)) ||
        (strcmp(sheldon, "Spock") == 0 && (strcmp(raj, "tesoura") == 0 || strcmp(raj, "pedra") == 0))
    ) {
        printf("Bazinga!\n");
    } else {
        printf("Raj trapaceou!\n");
    }
    
    return 0;
}
