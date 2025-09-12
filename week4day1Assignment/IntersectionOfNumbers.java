package week4day1Assignment;

import java.util.ArrayList;
import java.util.List;

public class IntersectionOfNumbers {
	
	public static void main(String[] args) {
        // Declare arrays
        int[] arr1 = {3, 2, 11, 4, 6, 7};
        int[] arr2 = {1, 2, 8, 4, 9, 7};

        // Add elements of arr1 to a list
        List<Integer> list1 = new ArrayList<>();
        for (int num : arr1) {
            list1.add(num);
        }

        // Add elements of arr2 to another list
        List<Integer> list2 = new ArrayList<>();
        for (int num : arr2) {
            list2.add(num);
        }

        System.out.println("Common elements between the two arrays:");

        // Iterate through list1 and check if the element is present in list2
        for (int num : list1) {
            if (list2.contains(num)) {
                System.out.println(num);
            }
        }
    }

}
