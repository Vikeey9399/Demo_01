package pROGS;

import java.nio.file.spi.FileSystemProvider;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class RemoveDuplicateValuesArray {

	public static void main(String[] args) {
		
		int[]myArray = {1,2,3,4,3,4,5,1,7,8,6};
		
		Set<Integer> mySet = new HashSet<Integer>();
		
		for(int num: myArray) {
		 mySet.add(num);	
		}
		System.out.println(mySet);
		int index=0;
		int[] NewmyArray = new int[mySet.size()];
		for(int setnum : mySet) {
			NewmyArray[index++]=setnum;
		}
		
		System.out.println(Arrays.toString(NewmyArray));
		

	}

}
