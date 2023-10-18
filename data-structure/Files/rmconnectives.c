#include <stdio.h>
#include <string.h>

char *myConnectives[] = {"and", "also", "the", "like", "with", "in", "or", "on", "for"};

// FUNCTION TO CHECK
int isConnective(char *word) {
    for (int i = 0; i < sizeof(myConnectives) / sizeof(myConnectives[0]); i++) {
        if (strcmp(word, myConnectives[i]) == 0) {
            return 1;
        }
    }
    return 0;
}

int main() {
    FILE *Foriginal, *fCopy;
    char word[100];
    int qtdConnectives = 0;

    // TRADITIONAL BOILERPLATE
    Foriginal = fopen("connectives.txt", "r");

    if (Foriginal == NULL) {
        puts("Não foi possível abrir o arquivo");
        return 1;
    }

    // copy creation
    fCopy = fopen("Texto_Vocaculo.txt", "w");

    if (fCopy == NULL) {
        puts("Não foi possível gravar o arquivo");
        fclose(Foriginal);
        return 1;
    }

    // START OF THE MINING
    while (fscanf(Foriginal, "%s", word) == 1) {
        if (isConnective(word)) {
            fprintf(fCopy, "%s\n", word);
            qtdConnectives++;
        }
    }

    fclose(Foriginal);
    fclose(fCopy);

    printf("The total amount of connectives is: %d\n", qtdConnectives);

}
