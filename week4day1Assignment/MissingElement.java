package week4day1Assignment;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MissingElement {

	public static void main(String[] args) {

		int[] arr = {1, 2, 3, 4, 10, 6, 8, 13, 17, 20};
		
		List<Integer> list = new ArrayList<>();
		for (Integer num : arr) {
			list.add(num);
		}
		
		Collections.sort(list);
		int size =list.size();
		
		for(int i=0;i<size-1;i++) {
			int current = list.get(i);
			int next = list.get(i+1);
			
			if(current+1!=next) {
				for(int j=current+1;j<next;j++) {
					System.out.println("The missing elements are : "+j);
				}
			}
			
		}
	}

}
