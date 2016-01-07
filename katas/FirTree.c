#include <stdio.h>
#include <stdlib.h>
#include <string.h>

/* Schreibe eine kleine Anwendung welche einen Tannenbaum zeichnen kann. 
  Die Größe soll dabei als Parameter beim Start der Anwendung angegeben werden können. 
  Zusätzlich zur Größe kann optional angegeben werden, ob der Baum durch einen Stern als Spitze geschmückt werden soll.
*/

int main(int argc, char *argv[]) {

	int anzahl=0;
	int stern=0;

	int x, y;

	anzahl = atoi(argv[1]);

	if(argc==3) 
		if(strcmp("true", argv[2])==0)
			stern=1;

	if(stern==1) {
		for(x=0;x<anzahl-1;x++) {
			printf(" ");
		}
		printf("*\n");
	}

	y=1;
	for(x=0;x<(anzahl-(y));x++) {
		printf(" ");
	}
	printf("X\n");

	y++;
	while(y<=anzahl) {
		for(x=0;x<anzahl-(y);x++) {
			printf(" ");
		}
		for(x=0;x<y+(y-1);x++) {
			printf("X");
		}
		printf("\n");
		y++;
	}

	for(x=0;x<anzahl-1;x++) {
		printf(" ");
	}
	printf("I\n");
	

	return 0;
}
