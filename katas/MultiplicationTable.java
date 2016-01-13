import java.io.*;

/*
 Schreibe ein Programm, das die Zahlen des Einmaleins 
 berechnet und in der Textdatei einmaleins.txt ablegt. 
 Die Zahlen sollen jeweils durch einen Tabulator voneinander 
 getrennt werden. Die Anzahl der Zahlen wird dabei als 
 Parameter beim Programmstart übergeben.

Beispiel:

> 101.exe 7
Inhalt der Textdatei einmaleins.txt:
 */

public class MultiplicationTable {

	public static void main(String[] args) {
		int cnt = Integer.parseInt(args[0]);
		
		try {
			FileWriter fw = new FileWriter("einmaleins.txt");
			BufferedWriter bw = new BufferedWriter(fw);
			for(int y=1; y<=cnt; y++){
				for(int x=1;x<cnt; x++) {
					bw.write(y*x+"\t");
				}
				bw.write(y*cnt+"\n");
			}
			bw.close();
			
		} catch (IOException e) {
		}
		
		

	}

}

