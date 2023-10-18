#include <stdio.h>
#include <stdlib.h>

 int* CriaVetInt(int quantidadeElementos){

        int *vetorPtr1 = (int*)malloc(quantidadeElementos * sizeof(int));

        if( vetorPtr1 == NULL){
            
            fprintf(stderr, "Nao foi possível alocar memória para o vetor de inteiros \n"); 
        }

        return vetorPtr1;
    }

    float* CriaVetFloat(int quantidadeElementos){

        float *vetorPtr2 = (float*)malloc(quantidadeElementos * sizeof(float));

        if(vetorPtr2 == NULL){

            fprintf(stderr, "Nao foi possível alocar memória para o vetor de inteiros \n");

        }

        return vetorPtr2;

    }

// To clear the buffer after we're done with the memory allocation
    void liberaVetor(void *vetor){

        free(vetor);
    }

int main(){

    return 0;
}