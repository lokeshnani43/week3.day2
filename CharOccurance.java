package week3.day2;

import java.util.Arrays;

public class CharOccurance {

	public static void main(String[] args) {
		
		String str = "welcome to chittoor";
		char search = 'L'; 
		int count = 3;
		char[] Arrayinput=str.toCharArray();
		Arrays.sort(Arrayinput);
		int inputLength =str.length();
		
		for (int i = 0; i<str.length(); i++) {
			if(str.charAt(i) == search)
			      count++;
			 }
		System.out.println("The Character '"+search+"' appears "+count+" times.");
	  }
	
	}

