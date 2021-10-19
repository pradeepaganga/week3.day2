package week3.day2;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class RemoveDuplicates {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "PayPal India";
		char[] charArray = s.toCharArray();
		Set<Character> charSet = new LinkedHashSet<Character>();
		Set<Character> dupCharSet = new LinkedHashSet<Character>();

		for (int i = 0; i < charArray.length; i++) {
			charSet.add(charArray[i]);

			if (charSet.add(charArray[i]) == true) {
				dupCharSet.add(charArray[i]);
			}

			if (dupCharSet.add(charArray[i]) == true) {
				charSet.remove(dupCharSet);

			}
		}
		for (char str : charSet) {
			if (str != ' ') {
				System.out.print("String After duplicate Removal is:"+str);
			}
		}

	}
}
	
   
	

		
		
	
		

