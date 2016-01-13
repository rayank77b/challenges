/*
 Schreibe ein Program, dem bei Programmstart eine Zahl übergeben wird. 
 Es soll daraufhin geprüft werden, ob die übergebene Zahl eine fröhliche Zahl ist. 
 Ist die Zahl fröhlich so soll true auf dem Bildschirm ausgegeben werden. 
 Ansonsten wird false ausgegeben.

Definition (Fröhliche Zahl):

Sei f eine Vorschrift die eine natürliche Zahl auf die aufsummierten 
Quadrate ihrer Ziffern abbildet. Eine natürliche Zahl n heißt genau dann 
fröhlich, wenn endlich viele Anwendungen von f auf n zum Zahlenwert 1 führen.

Beispielrechnung:

19 ist eine fröhliche Zahl, denn:
19 -> 1² + 9² = 82 -> 8² + 2² = 68 -> 6² + 8² = 100 -> 1² + 0² + 0² = 1
Beispiel:

> IsHappy.exe 19
true
 */

public class FroehlicheZahl {

	public static int berechne(int ein) {
		int summe=0;
		
		while(ein>0) {
			int rest = ein%10;
			ein = ein / 10;
			summe = summe + rest*rest;
		}
		
		return summe;
	}
	
	public static void main(String[] args) {
		int eingabe = Integer.parseInt(args[0]);
		
		int cnt=0;
		int erg = berechne(eingabe);
		boolean froh=false;
		
		while(cnt<1000) {
			//System.out.println(erg);
			erg = berechne(erg);
			if(erg==1) {
				froh=true;
				break;
			}
			if(erg==4) {
				froh=false;
				break;
			}
			cnt++;
		}
		
		System.out.println(froh);
		
	}

}
