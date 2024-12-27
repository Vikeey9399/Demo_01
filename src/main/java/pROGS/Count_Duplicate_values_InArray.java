package pROGS;

import java.util.HashSet;
import java.util.Set;

public class Count_Duplicate_values_InArray {

	public static void main(String[] args) {

		int[] myArray = { 4,1, 2, 3, 4, 1, 3, 1, 2 };
		//int Count=0;
		Set<Integer> myset = new HashSet<Integer>();
		for(int set : myArray) {
			myset.add(set);
			
		}
		System.out.println(myset);
	
		for(int value : myset) {
		int	count=0;
			for(int j=0;j<=myArray.length-1;j++) {
				if(value==myArray[j]) {
					count++;
				}
			}
			System.out.println(value +": the count is :"+count);
			
		}	
			
			
		
		
	}

}
