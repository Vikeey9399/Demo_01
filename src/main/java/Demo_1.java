
public class Demo_1 extends Demo_02 {

	public static void main(String[] args) {

		int[] arr1 = { 1, 2, 3, 4, 5 };
		int[] arr2 = { 1, 2, 5 };

		for (int i : arr1) {
			int count = 0;
			// System.out.println(i);
			for (int j : arr2) {
				if (i == j) {

					count++;
				}
			}
			
			if (count == 0) {
				System.out.println(" The missing number in array arr2 is " + i + " and count is " + count);
			}

		}

	}

}
