package week3.day2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class FindIntersection {

	public static void main(String[] args) {

		Integer[] array1 = {3,2,11,4,6,7};
		Integer[] array2 = {1,2,8,4,9,7};
		
		List<Integer> list1 = new ArrayList<Integer>();
		List<Integer> list2 = new ArrayList<Integer>();
		
		Collections.addAll(list1, array1);
		Collections.addAll(list2, array2);
		
		String resultint = "";

		for(int i = 0;i<list1.size();i++) 
		{
			for(int j = 0;j<list2.size();j++) 
			{
				if(list1.get(i) == list2.get(j) ) 
				{
					if(resultint.isEmpty()) 
					{
						resultint += list1.get(i).toString();
					} 
					else {
						resultint += ","+ list1.get(i).toString();
				}

			}
		}
	}
		System.out.println("Print Intersection value :" +resultint);

	}
}	
