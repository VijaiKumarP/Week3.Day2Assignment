package Week2.Day2Assignments;

import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicates {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String removeDup="PayPal India";
		char[] charArray = removeDup.toCharArray();
		
		Boolean bDup;
		Set <Character> charSet = new LinkedHashSet<Character>();
		Set <Character> dupCharSet = new LinkedHashSet<Character>();
		
		for (Character character : charArray) {
			bDup= charSet.add(character);
			if (bDup==false) {
				dupCharSet.add(character);
			}
		}
		
		System.out.println("Removed Duplicate : " + charSet);
		System.out.println("Duplicate characters found: " + dupCharSet);
		
	}

}
