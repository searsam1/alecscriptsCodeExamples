
/* generate a random number example */
#include <stdio.h>      /*  NULL */
#include <stdlib.h>     /* srand, rand */
#include <time.h>       /* time */
#include <iostream>     /* cout */

int main ()
{
  int randomNumber;

  /* initialize random seed: */
  srand (time(NULL));

  /* generate random number between 1 and 100: */
  randomNumber = rand() % 100 + 1;
  std::cout << randomNumber << "\n";

  return 0;
}      
    
