#include <stdio.h>

int sumInt(int num){

    if(num == 0){

        return 0;

    }else{

        // % returns the las digit. IE 32 = 2
        return (num % 10) + sumInt(num / 10);

    }

}


int main(){

    int num;

    scanf("%d", &num);

   int resultado = sumInt(num);

    printf("The result of the sum of the digits is: %d", resultado);

    return 0;

}