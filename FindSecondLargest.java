package week3.day2;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class FindSecondLargest {

	public static void main(String[] args) {
		
		int[] data = {3,2,11,4,6,7};

		Arrays.sort(data);
		System.out.println(data[data.length-2]);
		
		Integer[] data1 = {3,7,8,5,6,9};
		List<Integer>list = Arrays.asList(data1);
		Collections.sort(list);
		System.out.println(list.get(list.size()-2));
		
	}

}
