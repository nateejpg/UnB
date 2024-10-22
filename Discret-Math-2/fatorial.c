#include <stdio.h>

int main(){

    int n = 0;
    int f = 1;

    scanf("%d ", &n);
    printf("Your number entered was: %d", n);

    for(int i = 2; i <= n; i++){

        f = f * n;

    }

    printf("The result is: %d", f);


    return 0;
}