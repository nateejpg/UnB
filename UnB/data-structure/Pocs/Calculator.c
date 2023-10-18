#include <stdio.h>

int main(){

    int newNum = 0;
    int firstNum = 0;
    int resultSum = 0;
    int resultSub = 0;
    int resultTimes = 1;
    int resultDiv = 1;
    int result = 0;
    int qtdNum;
    char operation;

    printf("How many numbers in your equation? \n");

    scanf("%d", &qtdNum);

    printf("Start your operation!\n");

    scanf("%d", &firstNum);
    scanf(" %c", &operation);

    switch(operation){

        case '+':

             for(int i = 0; i < qtdNum; i++){

                 scanf("%d", &newNum);
                 printf("+\n");

                resultSum += newNum;

             }

                result = resultSum + firstNum;

                printf("== %d", result);

          break;

        case '-':

            for(int i = 0; i < qtdNum; i++){

                scanf("%d", &newNum);
                printf("-\n");

                resultSub -= newNum;

                result = firstNum + resultSub;

            }

                printf("== %d \n ", result);
        
        break;


        case '*':

            for(int i = 0; i < qtdNum; i++){

                scanf("%d", &newNum);
                printf("*\n");

                resultTimes *= newNum;
                
                result = firstNum * resultTimes;
                
            }

            printf("== %d \n", result);

        break;


        case '/': 

                scanf("%d", &newNum);
                printf("/ \n");

                result = firstNum / newNum;

            printf("== %d \n", result);
    }

    return 0;

}