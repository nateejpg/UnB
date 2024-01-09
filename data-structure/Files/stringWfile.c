#include <stdio.h>
#include <string.h>

int main(){

    FILE *fp;   
    char s[80];

    fp = fopen("xputwords.txt", "w");

   if(fp == NULL){

        puts("File not found" );

   }else{

        while(strlen (gets(s)) > 0){ // cant use EOF cos u writting, cant use 1 cos theres no end

             fputs(s, fp);
             fputs("\n", fp);

        }

   }

    fclose(fp);



    return 0;
}




// Professor's code
/*
#include <stdio.h>
#include <stdlib.h>
#include <string.h>

main( )
{
  FILE *fp;
  char s[80];
  fp = fopen ( "POEM.TXT", "w" ) ;
  if ( fp == NULL )
  {
    puts ( "Cannot open file" ) ;

  }
  printf ( "\nEnter a few lines of text:\n" ) ;
  while ( strlen ( gets ( s ) ) > 0 )
  {
    fputs ( s, fp ) ;
    fputs ( "\n", fp ) ;
  }
  fclose ( fp );
}

*/
  