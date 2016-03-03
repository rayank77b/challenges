package katas;

public class Rot13 {

	public static void rot13(char i) {
		int z = (int)i;
		
		if ( i == 'Ö' ) {
			System.out.print("BR");
		} else if ( i == 'Ä' ) {
			System.out.print("NR");
		} else if ( i == 'Ü' ) {
			System.out.print("HR");
		} else if((z>64)&&(z<91)) {
			z=z+13;
			if(z>90)
				z=z-26;
			System.out.print((char)z);
		} else {
			System.out.print(i);
		}
		
		
		
	}
	
	public static void main(String[] args) {
		String input = args[0];
		
		//System.out.println(input);
		String uinput = input.toUpperCase();
		//System.out.println(uinput);
		
		for(int i=0; i<uinput.length(); i++) {
			//System.out.println(uinput.charAt(i));
			rot13(uinput.charAt(i));
		}
		System.out.println();

	}

}
