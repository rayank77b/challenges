/*
Schreibe ein Programm das die nächste Generation des Spiel des Lebens von Conway ausgehend 
von einem bestehenden Spielfeld berechnet. Das Spielfeld wird als zweidimensionales Gitter 
in einer bestimmten Größe übergeben. Jede Zelle dieses Gitters hat entweder den Zustand 
lebend oder tot. Ausserhalb des Gitters gibt es kein Leben. Die nächste Generation des 
Gitters wird nach folgenden vier Regeln berechnet:

- Eine lebende Zelle die weniger als zwei benachbarte lebende Zellen hat stirbt Aufgrund von Einsamkeit.
- Eine lebende Zelle die mehr als drei benachbarte lebende Zellen hat stirbt Aufgrund Überbevölkerung.
- Eine lebende Zelle die zwei oder drei lebende Zellen als Nachbarn hat überlebt in die nächste Generation.
- Jede tote Zelle die genau drei lebende Zellen als Nachbarn hat erwegt zum Leben.

Als erster Parameter wird die Anzahl Zeilen des Gitters beim Programmstart übergeben. 
Der zweite Parameter enthält das Gitter als Zeichenkette. Wobei lebende Zellen mit * gekennzeichnet werden. 
Tote Zellen werden durch . ausgedrückt.

Beispiele:

> life.exe 4 ............*......**...........
........
...**...
...**...
........
 */

public class GameOfLife {
	
	public static int getPointLife(int x, int y,int [][]z) {
		int l=0;
		try {
			l= z[x][y];
		}catch( ArrayIndexOutOfBoundsException e ) {
		}
		return l;
	}
	
	public static int getLifeAboutPoint(int x, int y, int maxx, int maxy, int [][]z) {
		int cnt=0;
		
		for(int i=-1; i<=1; i++) {
			for(int j=-1; j<=1; j++) {
					//System.out.print(">>"+(x+i)+ " "+ (y+j)+"  ");
					//System.out.println("> "+getPointLife(x+i,y+j,maxx,maxy, z));
					cnt = cnt + getPointLife(x+i,y+j, z);
			}
		}
		
		return cnt-getPointLife(x,y,z);
	}

	public static void main(String[] args) {
		int anzahl = Integer.parseInt(args[0]);
		
		String kette = args[1];
		int laenge = kette.length();
		int ax = laenge/anzahl;
		
		int zellen[][] = new int[ax][anzahl];
		int zellenNext[][] = new int[ax][anzahl];
		
		int count=0;
		for(int y=0; y<anzahl; y++) {
			for(int x=0; x<ax; x++) {
				if(kette.charAt(count)=='.') {
					zellen[x][y]=0;
				} else {
					zellen[x][y]=1;
				}
				count++;
			}
		}
		
		//System.out.println(kette);
		//System.out.println("anzahl: "+anzahl);
		//System.out.println();
		
		//System.out.println(getLifeAboutPoint(3, 2, zellen));
		
		for(int y=0; y<anzahl; y++) {
			for(int x=0; x<ax; x++) {
				int cleb=getLifeAboutPoint(x, y, ax, anzahl, zellen);
				if(getPointLife(x, y, zellen)==1) {
					if(cleb<2)
						zellenNext[x][y]=0;
					else if (cleb>3)
						zellenNext[x][y]=0;
					else
						zellenNext[x][y]=1;
				} else {
					if(cleb==3)
						zellenNext[x][y]=1;
					else
						zellenNext[x][y]=0;
				}
			}
		}
		
		/*
		for(int y=0; y<anzahl; y++) {
			for(int x=0; x<ax; x++) {
				if(zellen[x][y]==0) {
					System.out.print(".");
				} else {
					System.out.print("*");
				}
			}
			System.out.println();
		}
		System.out.println();
		*/
		for(int y=0; y<anzahl; y++) {
			for(int x=0; x<ax; x++) {
				if(zellenNext[x][y]==0) {
					System.out.print(".");
				} else {
					System.out.print("*");
				}
			}
			System.out.println();
		}
		

	}

}
