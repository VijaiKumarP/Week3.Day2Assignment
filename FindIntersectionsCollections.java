package Week2.Day2Assignments;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class FindIntersectionsCollections {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int intArr1[]={3,2,11,4,6,7};
		int intArr2[]={1,2,8,4,9,7};
		
		List<Integer> intArrList1=new ArrayList<Integer>();
		List<Integer> intArrList2=new ArrayList<Integer>();
		
		for (Integer integer : intArr1) {
			intArrList1.add(integer);
		}
		
		for (Integer integer : intArr2) {
			intArrList2.add(integer);
		}
		String intersection="";
		for (Integer integer : intArrList1) {
			for (Integer integer2 : intArrList2) {
				if (integer==integer2) {
					intersection=intersection + integer + " ";
					break;
				}
			}
		}
		
		System.out.println("The Intersection nubers of the two given List is " + intersection);
	}

}

