package Week2.Day2Assignments;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;



public class FindSecondLargestCollection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] data = {3,2,11,4,6,7};
		
		List<Integer> intLst=new ArrayList<Integer>();
		
		for (Integer integer : data) {
			intLst.add(integer);
		}
		Collections.sort(intLst);
		Collections.reverse(intLst);
		
		System.out.println("Second Largest Value in the given list is : " +intLst.get(1));
	}

}
