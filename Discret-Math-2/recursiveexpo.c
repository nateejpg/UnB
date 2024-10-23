#include <stdio.h>

int main(){

    int num;
    int resultado = 1;
    int exp;

    scanf("%d", &num);
    scanf("%d", &exp);

    if( exp == 0){

       resultado = 1;

    }else if (exp > 0){

        resultado = num;

        while(exp > 1){

             resultado = resultado * num;
             exp--;

        }
        
        

    }

    printf("%d, %d, %d", num, exp, resultado);



    return 0;
}