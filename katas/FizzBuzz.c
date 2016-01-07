#include <stdio.h>
#include <stdlib.h>

/* Schreibe eine Anwendung, welcher eine Zahl zwischen 1 und 100 übergeben wird. 
  Die übergeben Zahl soll dabei auf dem Bildschirm ausgegeben werden, 
  wobei manche Zahlen dabei allerdings übersetzt werden sollen:

  Für ein Vielfache von 3 gib ´Fizz´ statt der Zahl aus.
  Für ein Vielfache von 5 gib ´Buzz´ statt der Zahl aus.
  Für ein Vielfache von 3 und 5 gib ´FizzBuzz´ statt der Zahl aus.
*/

int main(int argc, char *argv[]) {

	int zahl=0;

	zahl = atoi(argv[1]);
	
	if((zahl%3==0)&&(zahl%5==0)) {
		printf("FizzBuzz\n");
	} else if (zahl%3==0) {
		printf("Fizz\n");
	} else if (zahl%5==0) {
		printf("Buzz\n");
	} else {
		printf("%d\n", zahl);
	}

	return 0;
}
