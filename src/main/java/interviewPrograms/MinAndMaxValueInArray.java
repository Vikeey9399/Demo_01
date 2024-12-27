package interviewPrograms;

public class MinAndMaxValueInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] a = { 5, 10, 9, 100, 6,-1 };
		int max = a[0];
		int min=a[0];
		for (int i = 0; i <= a.length - 1; i++) {
			if (a[i] > max) {

				max = a[i];
			}
			if(a[i]<min) {
				min=a[i];
			}
		}
		System.out.println("The max num in array is :"+max+" And  Min Num is "+min);

	}

}
