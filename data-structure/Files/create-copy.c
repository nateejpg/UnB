#include <stdio.h>

int main(){


 FILE *fp;
 FILE *copyfp;
 char ch;

 fp = fopen("xarquivo1.txt", "r");
 copyfp = fopen("xpoccopia.txt", "w");

 if(fp == NULL){

    printf("File not found!");

 }else{

    while(1){

        ch = fgetc(fp);

        if(ch != EOF){

            fputc(ch, copyfp);

        }else{

            return 0;
        }
    }
 }

 fclose(fp);
 fclose(copyfp);

    return 0;
}



/* 

Creating a file copy 
#include <stdio.h>
#include <stdlib.h>

main( )
{
  FILE *fOriginal, *fCopia;
  char ch;
  fOriginal = fopen ("Arquivo1.txt", "r" );
  if (fOriginal == NULL )
  {
    puts ( "Nao foi possivel abrir o arquivo!!!" ) ;
    exit(0);
  }
  fCopia = fopen ("Copia_Arquivo1.txt", "w" );
  if (fCopia == NULL )
  {
    puts ( "Nao foi possivel gravar o arquivo!!!" ) ;
    exit(0);
  }
  while ( 1 )
  {
    ch = fgetc(fOriginal);
    if(ch==EOF)
      break;
    fputc (ch, fCopia);
  }
  fclose (fOriginal);
  fclose (fCopia);
  return 0;
}


*/