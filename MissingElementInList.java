package Week2.Day2Assignments;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MissingElementInList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {1,2,3,4,7,6,8};
		
		List<Integer> intList=new ArrayList<Integer>();
		
		for (Integer integer : arr) {
			intList.add(integer);
		}
		
		Collections.sort(intList);
		System.out.println("Sorted List Value is : " + intList);
		String missingElement="";
		int j=0;
		for (int i = intList.get(0); i <intList.size(); i++) {
			if (intList.get(j)!=(i)) {
				missingElement= missingElement+ (i) + " ";
				continue;
			}
			j++;
		}
		System.out.println("Missing Element is : " +missingElement);
	}

}
