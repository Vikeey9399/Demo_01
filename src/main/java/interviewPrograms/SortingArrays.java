package interviewPrograms;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class SortingArrays {

	public static void main(String[] args) {
		
		int[] a= {1,46,3,8,2,3,10};
		
//		System.out.println("Array a Before Sort"+Arrays.toString(a));
//		Arrays.parallelSort(a);
//		System.out.println("Array a After Sort"+Arrays.toString(a));
		
		
		System.out.println("Array a Before Sort"+Arrays.toString(a));
		Arrays.sort(a);
		System.out.println("Array a After Sort"+Arrays.toString(a));
		
		Integer[] b= {1,46,3,8,2,3,10};
		System.out.println("Array a Before Reverse Sort"+Arrays.toString(b));
		Arrays.sort(b,Collections.reverseOrder());
		System.out.println("Array a After Reverse Sort"+Arrays.toString(b));
		
		
	}

}
