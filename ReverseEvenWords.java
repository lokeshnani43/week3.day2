package week3.day2;

import java.util.Arrays;

public class ReverseEvenWords {

	public static void main(String[] args) {
		String test = "I am a software tester"; 
		String[] s =test.split(" ");
		System.out.println(Arrays.toString(s));
		String rev = "";
		for (int i = 0; i < s.length; i++) { 
			
			if (i % 2 == 1)
		        rev = rev + new StringBuilder(s[i]).reverse().toString() + " "; 
		    else
		        rev = rev + s[i] + " ";
		}
          System.out.println(rev);
				
			
		}
	
	}

