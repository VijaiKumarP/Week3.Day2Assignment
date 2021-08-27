package Week2.Day2Assignments;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortCollection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//String[] strArr= {"Cts","Aspire systems","wipro","Hcl"};
		List <String> strArr= new ArrayList<String>();
		strArr.add("Cts");
		strArr.add("Aspire systems");
		strArr.add("wipro");
		strArr.add("Hcl");
		Collections.sort(strArr);
		String strArrTemp="";
		for (String string : strArr) {
			strArrTemp= strArrTemp + string + ",";
		} 
		
		String[] split = strArrTemp.split(",");
		strArrTemp="";
		for (int i = split.length-1; i >= 0; i--) {
			strArrTemp = strArrTemp + split[i] + " ";
		}
		System.out.println("Array Values Sorted and Reversed : " + strArrTemp.replace(' ', ','));
		Collections.reverse(strArr);
		System.out.println("Collection . Reverse : " + strArr);
	}
}
