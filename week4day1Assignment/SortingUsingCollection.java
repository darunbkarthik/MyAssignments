package week4day1Assignment;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortingUsingCollection {

	public static void main(String[] args) {

		String[] elements =  {"HCL","Wipro", "Aspire Systems", "CTS"};
		
		List<String> list = new ArrayList<>();
		for (String value : elements) {
			list.add(value);
		}
		
		Collections.sort(list);
		System.out.println(list);
		
		for(int i=list.size()-1;i>=0;i--) {
			System.out.print(list.get(i));
            if (i > 0) {
                System.out.print(", ");
            }
		}
	}

}
