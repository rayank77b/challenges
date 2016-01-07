#include <stdio.h>
#include <stdlib.h>

/* Schreibe ein Program, dem bei Programmstart ein Jahr übergeben wird. 
   Es soll daraufhin geprüft werden, ob das übergebene Jahr eine Schaltjahr ist. 
   Handelt es sich um ein Schaltjahr so soll true auf dem Bildschirm ausgegeben werden. 
   Ansonsten wird false ausgegeben.

   Definition (Schaltjahr): Ein Schaltjahr ist ein Jahr, welches durch 4 teilbar ist, 
   aber nicht durch 100 geteilt werden kann, es sei den es ist zusätzlich auch durch 400 teilbar.
*/

int main(int argc, char *argv[]) {

	int jahr=0;
	int rest=0;

	jahr = atoi(argv[1]);

	rest = jahr%400;
	if(rest==0) {
		printf("true\n");
		return 0;
	}
	rest = jahr%4;
	if(rest==0) {
		rest = jahr%100;
		if(rest == 0) {
			printf("false\n");
		} else {
			printf("true\n");
		}
		return 0;
	}
	printf("false\n");
	return 0;
}
