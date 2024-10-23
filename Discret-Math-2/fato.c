#include <stdio.h>


int fat(int num){

    if( num == 0){

        return 1;

    }else{

        return num * fat(num - 1);

    }


}

int main(){

    int res;
    int num;

    printf("Enter your number to use the fatorial: \n");
    scanf("%d", &num);

    res = fat(num);

    printf("Your result is: %d \n", res);

    return 0;
}