package pROGS;

public class MaximumElementInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] a = { 1, 10, 3, 55, 5, 6, 12 };
		int max = a[0];
		for (int i = 0; i < a.length; i++) {

			if (a[i] > max) {
				max = a[i];

			}

		}
		System.out.println("The Max Number from the array is :" + max);

	}

}
