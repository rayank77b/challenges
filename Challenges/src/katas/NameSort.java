package katas;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class NameSort {

	public static void main(String[] args) {
		String filename = args[0];
		
		List<String> liste = new ArrayList<String>();
		
		try (BufferedReader br = new BufferedReader(new FileReader(filename))) {
		    String line;
		    while ((line = br.readLine()) != null) {
		       String []s = line.split(" ");
		       liste.add(s[1]+ " "+s[0]);
		       
		       
		    }
		} catch (IOException e) {
			e.printStackTrace();
		}
		//System.out.println(liste);
		
		Collections.sort(liste);
		//System.out.println(liste);
		
		for(String s: liste) {
			//System.out.println(s);
			String []s2 = s.split(" ");
			System.out.println(s2[1]+ " "+s2[0]);
		}

	}

}
