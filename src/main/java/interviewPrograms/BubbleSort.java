package interviewPrograms;

import java.lang.reflect.Array;
import java.util.Arrays;

public class BubbleSort {

	public static void main(String[] args) {

		int[] a = { 4, 5, 2, 1, 3 };

		System.out.println("Array a Before sorting "+Arrays.toString(a));
		int l = a.length;

		for (int i = 0; i < l - 1; i++) {

			for (int j = 0; j < l - 1; j++) {

				if(a[j]>a[j+1]) {
				int temp = a[j];// c=a
				a[j] = a[j + 1];// a=b
				a[j + 1] = temp;// b=c
				}
			}

		}
		System.out.println("Array a After sorting "+Arrays.toString(a));

	}

}
