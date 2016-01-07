#include <stdio.h>
#include <stdlib.h>


/*
Schreibe eine Anwendung die Noten vom gymnasialen Oberstufe Punktesystem in Note (mit Tendenz) und andresrum umwandelt.
Geben sie immer den Fehlenden Wert auf der Konsole aus.

Umrechnungstabelle:
Note	Punkte	 	Note	Punkte
1+	15	 	3-	7
1	14	 	4+	6
1-	13	 	4	5
2+	12	 	4-	4
2	11	 	5+	3
2-	10	 	5	2
3+	9	 	5-	1
3	8	 	6	0

Parameter:
Nummer	Eigenschaften
1	N => Note (mit Tendenz) oder P => Punkte des gymnasialen Oberstufe Punktesystem
2	Wert

*/


int main(int argc, char *argv[])
{
	char P;
	int note=0;
	int note2=0;
	int punkte=0;
	char pktNoten[16][3]={"6","5-","5","5+","4-","4","4+","3-","3","3+","2-","2","2+","1-","1","1+"};

	P=argv[1][0];

	if(P=='N') // noten
	{
		note=argv[2][0]-'0';
		if(note==6) 
		{
			printf("0");
			return 0;
		}
		if((note<1)||(note>6))
			return -1;
		if(argv[2][1]=='+')
			note2=3;
		else if(argv[2][1]=='\0')
			note2=2;
		else if(argv[2][1]=='-')
			note2=1;
		else
			return -1;
		punkte = note2 + (5-note)*3;
		printf("%d", punkte);
		return 0;
	} else if (P=='P') // punkte
	{
		punkte = atoi(argv[2]);
		if((punkte<0)||(punkte>15))
			return -1;
		printf("%s", pktNoten[punkte]);
	}



	return 0;
}
