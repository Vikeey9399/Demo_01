package interviewPrograms;

import java.util.Arrays;

public class CheckArraysAreEqual {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] a1 = { 1, 2, 3, 4, 6, 6 };
		int[] a2 = { 1, 2, 3, 4, 5, 6 };
		boolean flag = true;

	boolean status = Arrays.equals(a1, a2);
	System.out.println(status);
		
		
		
		if (a1.length == a2.length) {

			for (int i = 0; i <= a1.length - 1; i++) {

				if (a1[i] != a2[i]) {
					flag = false;

				} 
			}

		} else {
			System.out.println("Array are not equal");
		}
		if (flag == true) {
			System.out.println("Arrays are equal");
		} else {
			System.out.println("Array are not equal");
		}

	}

}
