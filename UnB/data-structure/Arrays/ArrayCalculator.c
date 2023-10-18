#include <stdio.h>

int main(){

    int num;
    int qItems;
    char operation;
    int sum, sub, times;
    int result = 0;
    int resm = 1;

    printf("Welcome to the ArrayCalculator \n");
    printf("How many items do you want to calculate? \n");

    scanf("%d", &qItems);

      int arr[qItems];

    printf("Enter your items: \n");

    for(int i = 0; i < qItems; i++){

        scanf("%d", &arr[i]);

    }

   /* 
   
   for(int i = 0; i < qItems; i++){

        printf("%d ", arr[i]);

        // print the array
    }

    */

    printf("Choose an operation: SUM(A), SUB(S), TIMES(T) or EXIT(E) \n");

    scanf(" %c", &operation);

    switch (operation)
    {
    case 'A':
    case 'a':

        for(int i = 0; i < qItems; i++){

            result += arr[i];

        }

        printf("Your final result is: %d", result);
        
        break;
    
    case 'S':
    case 's':

        for(int i = 0; i < qItems; i++){

            result -= arr[i];

        }

        printf("Your final result is: %d", result);

        break;


    
    case 'T':
    case 't':

        for(int i = 0; i < qItems; i++){

            resm *= arr[i];

        }

        printf("Your final result is: %d", resm);

        break;



    case 'E':
    case 'e':


        break;


    }

    return 0;

}