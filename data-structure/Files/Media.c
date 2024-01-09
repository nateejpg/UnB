#include <stdio.h>

float media1(float *pv, int pn){

    float pm = 0;
    int pInd;
    for(pInd = 0; pInd < pn; pInd++){
        pm += pv[pInd];

        return (pm/pn);
    }
}

float media2(float *pv, int pn){

    float *pVaux = pv, pm = 0;
    int pind;
    for(pind = 0; pind < pn; pind++){

        pm += *pVaux;

    }

    return (pm/pn);
}


int main(){



    return 0;
}

/*
[2,0] Considerando que as funções do quadro Média devem retornar a média dos
valores de um vetor do tipo float, marque a opção contendo a afirmativa
correta.
a. [ ] – Media e Media2 estão corretas somente no caso de pV ter sido
alocado dinamicamente;
b. [ ] – Media e Media2 estão corretas somente no caso de pV não ter sido
alocado dinamicamente;
c. [ ] – Media está correta somente no caso de pV não ter sido alocado
dinamicamente;
d. [ ] – Media2 está correta somente no caso de pV ter sido alocado
dinamicamente;
e. [ X ] – Media e Media2 estão corretas, sendo pV um vetor declarado
estaticamente ou alocado dinamicamente.
*/