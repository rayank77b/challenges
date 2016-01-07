#include <stdio.h>
#include <stdlib.h>

/*
 Schreibe eine Konsolenanwendung die den Zinseszins für einen bestimmten Prozensatz berechnen kann. 
 Die nötigen Informationen, bestehend aus Startbetrag, Zinssatz und Anzahl Jahre, werden beim Programmstart 
 als Parameter übergeben. 
 Für jedes Jahr soll dabei der aktuelle Betrag ausgegeben werden. 
 Bei der Ausgabe sollen zwei Nachkommastellen verwendet werden.
*/

int main(int argc, char *argv[]) {

	double startbetrag, zinssatz;
	int jahre;
	int i;

	if( argc<4 ) {
		printf(" Argumente fehlen:  Startbetrag Zinssatz AnzahlJahre\n");
		return -1;
	}

	startbetrag = 0;
	startbetrag = atof(argv[1]);
	if(startbetrag == 0 ) {
		printf(" Error on startbetrag\n");
		return -1;
	}

	zinssatz = 0;
	zinssatz = atof(argv[2]);
	if(zinssatz == 0 ) {
		printf(" Error on zinssatz\n");
		return -1;
	}

	jahre = 0;
	jahre = atoi(argv[3]);
	if(jahre == 0 ) {
		printf(" Error on jahre\n");
		return -1;
	}

	zinssatz = zinssatz/100 + 1;
	for(i=1; i <= jahre; i++) {
		startbetrag = startbetrag * zinssatz;
         	printf("%.2lf\n", startbetrag);
      	}

	return 0;
}
