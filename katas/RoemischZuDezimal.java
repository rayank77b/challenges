public class RoemischZuDezimal {
	public static void main(String[] args) {
		String eingabe = new String(args[0]);
		//String eingabe = new String("IV");
		int length = eingabe.length();
		
		int zahlen[] = new int[100];
		
		int summe=0;
		
		for(int i=0; i<100;i++) {
			zahlen[i]=0;
		}
		
		for(int i=0; i<length; i++) {
			//System.out.println(eingabe.charAt(i));
			switch(eingabe.charAt(i)) {
				case 'M': zahlen[i]=1000;break;
				case 'D': zahlen[i]=500;break;
				case 'C': zahlen[i]=100;break;
				case 'L': zahlen[i]=50;break;
				case 'X': zahlen[i]=10;break;
				case 'V': zahlen[i]=5;break;
				case 'I': zahlen[i]=1;break;
			}
		}
		for(int i=0; i<99;i++) {
			//System.out.println(zahlen[i]);
			if(zahlen[i]<zahlen[i+1]) {
				summe=summe-zahlen[i];
			} else {
				summe=summe+zahlen[i];
			}
		}
		
		System.out.println("summe: "+summe);
		
	}

}
