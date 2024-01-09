#include <stdio.h>

int main(){

    FILE *fp;
    char ch;
    int contador = 0;
    int contador_space = 0;

  fp = fopen("arquivo1.txt", "r");

  if(fp == NULL){

    printf("File not Found!");

    return 0;

  }else{

    while(ch != EOF){

        ch = fgetc(fp);

        if(ch == ' '){

            contador_space++;

        }else{

            contador++;
        }

    }

  }

  fclose(fp);

  printf("the quantity of spaces is: %d \n the amount of characters is: %d", contador_space, contador);

    return 0;
}



// Professors Code
/*
#include<stdio.h>

int main()
{
  FILE *fp;
  char ch;
  int contadorSpace = 0;
  int pqtdecar = 0;
  fp = fopen ( "Arquivo1.txt", "r" );

  if(fp == NULL){
      printf("Unable to open file \n");

      return 0;
  }else{
      while ( 1 ) {
        ch = fgetc(fp);
         if(ch==EOF)
          break;
        pqtdecar++;

       if(ch == ' '){
          contadorSpace++;
       }

     }
     fclose ( fp );
     printf("Quantidade de Caracteres: %d",pqtdecar);
     printf("Quantidade de espaços: %d", contadorSpace );
      return 0;
  }
}

*/
