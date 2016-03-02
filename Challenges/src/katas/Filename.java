package katas;

public class Filename {

	public static void main(String[] args) {
		String pfad = args[0];
				
		String pfad1 = pfad.substring(0, pfad.lastIndexOf("\\"));
		String datei = pfad.substring(pfad.lastIndexOf("\\") + 1);
		
		String filename = datei.substring(0, datei.lastIndexOf("."));
		String typ = datei.substring(datei.lastIndexOf(".") + 1);
		
		System.out.println("Verzeichnis: "+pfad1);
		System.out.println("Dateiname:   "+filename);
		System.out.println("Erweiterung: "+typ);
	}
}
