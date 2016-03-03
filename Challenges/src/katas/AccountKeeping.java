package katas;

import java.util.Scanner;

public class AccountKeeping {
	


	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int konto = 0;
		
		try {
            while (scan.hasNextLine()){

                String line = scan.nextLine();
                
                String []l = line.split(" ");
                if(l.length==2) {
	                String cmd = l[0];
	                int sum = Integer.valueOf(l[1]);
	                if( sum  < 0 ) {
	                	System.out.println("Negative Beträge sind nicht erlaubt.");
	                } else if ( cmd.compareTo("einzahlen") == 0) {
	                	konto = konto + sum;
	                	System.out.println("Aktueller Kontostand: "+konto);
	                } else if (cmd.compareTo("abheben")== 0) {
	                	if (konto<sum) {
	                		System.out.println("Ein Überziehen des Konto ist nicht erlaubt.");
	                	} else {
	                		konto = konto - sum;
	                		System.out.println("Aktueller Kontostand: "+konto);
	                	}
	                }
                }
                
            }

        } finally {
            scan.close();
        }

	    
	    
	}

}
