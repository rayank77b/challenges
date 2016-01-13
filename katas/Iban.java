import java.io.*;
import java.math.BigInteger;

/*
 Schreibe eine Konsolenanwendung welche eine Bankleitzahl 
 und Kontonummer in das IBAN Format für Deutschland konvertiert. 
 Die Ausgabe der IBAN soll dabei in Papierform erfolgen.

Beispiel:

> iban.exe
Kontonummer: 123456
BLZ: 60050101
IBAN: DE53 6005 0101 0000 1234 56
 */

public class Iban {

	public static BigInteger einlesen(String mess) {
		InputStreamReader isr = new InputStreamReader(System.in);
	    BufferedReader br = new BufferedReader(isr);
	    System.out.print(mess+": ");
	    BigInteger ausgabe;
		try {
			String eingabe = br.readLine();
			ausgabe = new BigInteger(eingabe);
		} catch (IOException e) {
			ausgabe = new BigInteger("-1");
		}
	    return ausgabe;
	}
	
	public static void main(String[] args) {
		//BigInteger konto = new BigInteger("123456"); 
		//BigInteger blz = new BigInteger("60050101"); 
		BigInteger konto = einlesen("Kontonummer");
		BigInteger blz = einlesen("BLZ");
		
		BigInteger b1 = blz.multiply(new BigInteger("10000000000000000"));
		BigInteger b2 = konto.multiply(new BigInteger("1000000"));
		BigInteger b3 = b2.add(new BigInteger("131400"));
		BigInteger b4 = b3.add(b1);
		BigInteger rest = b4.mod(new BigInteger("97"));
		BigInteger n = new BigInteger("98");
		BigInteger pruef = n.subtract(rest);
		//BigInteger zahl = 
		//System.out.println(b4);
		//System.out.println(rest);
		//System.out.println(pruef);
		//System.out.println();
		
		long lpruef = pruef.longValue();
		
		long lblz = blz.longValue();
		long lblz1 = lblz/10000;
		long lblz2 = lblz%10000;
		
		long lk = konto.longValue();
		long lk1 = lk/1000000;
		long lk2 = (lk%1000000)/100;
		long lk3 = lk%100;
		
		// IBAN: DE53 6005 0101 0000 1234 56
		System.out.format("IBAN: DE%02d %04d %04d %04d %04d %02d\n", lpruef, lblz1, lblz2, lk1, lk2, lk3);

	}
}

