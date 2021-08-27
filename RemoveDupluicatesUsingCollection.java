package Week2.Day2Assignments;

import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDupluicatesUsingCollection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String text = "We learn java basics as part of java sessions in java week1";
		
		String[] split = text.split(" ");
		
		Set<String> strSet=new LinkedHashSet<String>();
		Set <String> dupStrSet=new LinkedHashSet<String>();
		boolean bFlag;
		for (String string : split) {
			bFlag= strSet.add(string);
			if (bFlag==false) {
				dupStrSet.add(string);
			}
		}
		
		System.out.println("Without Duplicates : " +strSet);
		
		System.out.println("Duplicates : " +dupStrSet);
		
	}

}
