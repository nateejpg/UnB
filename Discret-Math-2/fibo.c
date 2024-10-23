#include <stdio.h>

int fibo(int num){

    if(num == 0){
        return 0;
    }else if(num == 1){
        return 1;

    }else{

        return fibo(num - 1) + fibo(num - 2);

    }
}


int main(){

    int n;
    int res;

    printf("Enter your number: \n");
    scanf("%d", &n);

    res = fibo(n);

    printf("Fibo(%d): %d ", n, res);


    return 0;
}