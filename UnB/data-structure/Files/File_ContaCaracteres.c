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
