#include <stdio.h>
#include <stdlib.h>

/* Schreibe eine Konsolenanwendung die den Namen beim Programmstart vom 
   Benutzer abfragt und anschließend diesen mit Hallo, <Name>! grüßt.
*/

int main() {

	char name[2049];
	int i;

	for(i=0; i<2049; i++) {
		name[i]=0;
	}

	printf("Geben Sie den Namen ein: ");
	if( fgets (name, 2048, stdin)!=NULL ) {
		for(i=0; i<2048; i++) {
			if( name[i]==0 )
				name[i-1]=0;
		}
		printf("Hallo, %s!\n",name);
	}

	return 0;
}
