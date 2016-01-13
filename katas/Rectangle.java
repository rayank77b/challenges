
/*
Schreibe eine Anwendung welche ein Rechteck zeichnen kann. 
Die Breite und Höhe wird als Parameter beim Programmstart übergeben.

Beispiel:

> Rechteck.exe 7 4
*******
*     *
*     *
*******
 */

public class Rectangle {

	public static void main(String[] args) {
		int breite = Integer.parseInt(args[0]);
		int hoehe = Integer.parseInt(args[1]);
		
		for(int x=0; x<breite;x++)
			System.out.print("*");
		System.out.println();
		
		for(int y=2; y<hoehe; y++) {
			System.out.print("*");
			for(int x=3; x<=breite; x++)
				System.out.print(" ");
			if(breite>1)
				System.out.println("*");
			else
				System.out.println();
		}
		
		if(hoehe>1) {
			for(int x=0; x<breite;x++)
				System.out.print("*");
			System.out.println();
		}
		

	}

}

