package katas;

import java.io.IOException;

public class TestFastRead {

	public static String fastRead() throws IOException {
		String line = "";
        int c;
		while ((c = System.in.read()) >= 0) {
			switch (c) {
            	case '\n':
            		break;
            	default:
                    line += (char) c;
                    break;
			}
		}
		return line;
	}
	
	public static void main(String[] args) {
		System.out.println("start");
		String ein;
		try {
			ein = fastRead();
			System.out.println("readed: "+ein);
		} catch (IOException e) {
			System.out.println("errors on read");
		}
		

	}

}
