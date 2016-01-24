import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class AccessDenied {

	public static void main(String[] args) {
	    boolean bLogin=false;
	    boolean bUinput=false;
	    boolean bPinput=false;
	    boolean bLoginOk=false;
	    String str, username="", passwort="";
	    BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
	    
	    // simple state machine
	    try {
			while((str=input.readLine())!=null && str.length()!=0) {
			    if(bLogin==true && bLoginOk==false) {
			    	if(bUinput==true && bPinput==false) {
			    		passwort=new String(str);
			    		bPinput=true;
			    	}
			    	if(bUinput==false && bPinput==false) {
			    		username=new String(str);
			    		bUinput=true;
			    		System.out.print("Password: ");
			    	}
			    	if(bUinput==true && bPinput==true) {
			    		if((username.compareTo("administrator")==0) && (passwort.compareTo("passw0rd")==0) ) {
			    			bLoginOk=true; bLogin=false; bUinput=false; bPinput=false;
			    			System.out.println("Anmeldung erfolgreich.");
			    		} else {
			    			bLoginOk=false; bLogin=false; bUinput=false; bPinput=false;
			    			System.out.println("Anmeldung fehlgeschlagen.");
			    		}
			    	}
			    	
			    }
			    if((str.compareTo("login")==0)&&(bLogin==false)&&(bLoginOk==false)) {
			    	bLogin=true;
			    	System.out.print("Username: ");
			    }
			    if((str.compareTo("logout")==0)&&(bLoginOk=true)) {
			    	bLogin=false; bLoginOk=false;
			    	System.out.println("Abmelden erfolgreich.");
			    }
			    if(str.compareTo("dostuff")==0) {
			    	if(bLoginOk==true) {
			    		System.out.println("Bearbeiten erfolgreich.");
			    	} else {
			    		System.out.println("Bearbeiten nicht erlaubt.");
			    	}
			    }
			    
			}
		} catch (IOException e) { 	}
	}
}
