package interviewPrograms;

import java.util.Arrays;

public class BinarySearch {

	public static void main(String[] args) {

		int[] a = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
		int key = 1;
		int l = 0 ;
		int h = a.length - 1;
		boolean flag = false;
		while (l <= h) {

			int m = (l + h) / 2;

			if (a[m] == key) {
				flag = true;
				break;
			}
			if (a[m] < key) {
				l = a[m] + 1;

			}
			if (a[m] > key) {
				h = a[m] - 1;
			}
		}
		if (flag) {
			System.out.println("The Key is Found ");
		} else {
			System.out.println("The Key not Found ");
		}
		
	System.out.println(	Arrays.binarySearch(a, 1));

	}

}
