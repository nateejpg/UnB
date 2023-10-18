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
  