#include <stdio.h>

int main(){


    int n = 0;
    int sum = 0;

    scanf("%d", &n);

    int numbers[n];

    for(int i = 0; i < n; i++){

        scanf("%d", &numbers[i]);   
        sum += numbers[i];     

    }

   int average = sum / n;

    int count = 0;
    for(int i = 0; i < n; i++){

        if(numbers[i] > average){

        printf("%d ",numbers[i]);
        count++;

        }

    }

         if(count == 0) {
        printf("0");
    }


    return 0;
}