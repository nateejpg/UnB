#include <stdio.h>

// Struct pessoa com typedef
typedef struct 
{
    float Peso;
    int Idade;
    float Altura;

} Pessoa;


int ImprimePessoa(Pessoa pessoa){

    printf("%d \n", pessoa.Idade);
    printf("%.2f \n", pessoa.Peso);
    printf("%.2f \n", pessoa.Altura);

}


int main(){

// Declaração do chamando a struct com o apelido pessoa
Pessoa Joao, P2;
Pessoa Povo[10];

Joao.Idade = 15;
Joao.Peso = 60.5;
Joao.Altura = 1.89;

Povo[4].Idade = 23;
Povo[4].Peso = 75.3;
Povo[4].Altura = 1.89;

P2 = Povo[4];
  
    P2.Idade++;

    ImprimePessoa(Joao);
    ImprimePessoa(Povo[4]);
    ImprimePessoa(P2);

    return 0;
    
}

