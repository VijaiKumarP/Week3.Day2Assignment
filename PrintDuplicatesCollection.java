package Week2.Day2Assignments;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Set;

public class PrintDuplicatesCollection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr  = {14,12,13,11,15,14,18,16,17,19,18,17,20};
		Arrays.sort(arr);

		Set<Integer> intSet=new LinkedHashSet<Integer>();
		Set <Integer> dupIntSet=new LinkedHashSet<Integer>();
		boolean bFlag;
		for (int string : arr) {
			bFlag= intSet.add(string);
			if (bFlag==false) {
				dupIntSet.add(string);
			}
		}
		
		System.out.println("Removed Duplicates : " +intSet);
		
		System.out.println("Duplicates : " +dupIntSet);
	}

}
