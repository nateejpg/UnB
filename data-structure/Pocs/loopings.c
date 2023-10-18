#include <stdio.h>


int main(){

    int i;
    int n;
    int x = 0;
    int t = 0;
    char str[10];

    printf("Enter your number: \n");

     scanf("%d", &n);

    printf("Enter your string: \n");

     scanf("%s", str);

    for(i = 1; i <= n; i++){

        printf("%d \n", i);
        printf("%s \n", str);

    }
    
    while(x < 5){

        x = x + 1;

        printf("%d \n", x);

    }

    printf("Your final number is %d and your final string is %s \n", n, str);


    return 0;
}


