#include <stdio.h>
#include <math.h>

int Triangules(int n){

    int eq = pow(3, n - 1);

    printf("Triangules iteration %d leads to = %d \n", n, eq);

    return eq;

}

int Fractals(int n){

    int num = pow(3,n) - 1;
    int eq = num / 2;

    printf("Fractal iteration %d leads to = %d \n", n, eq);

    return eq;
}


int main(){

    int n;

    printf("Enter the N: \n");
    scanf("%d", &n);

    for(int i = 1; i <= n; i++){

       Triangules(i);
       
    }

    for(int i = 1; i <= n; i++){

       Fractals(i);

    }

    return 0;
}