package interviewPrograms;

public class MissingNumberFromArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		//array should not have dublicates
		//array should be range bound 
		int[] a1 = { 1, 2, 3, 4, 6 };
		int Sum1 = 0;

		for (int i = 0; i <= a1.length-1; i++) {

			Sum1 = Sum1 + a1[i];
		}
		int Sum2 = 0;
		for (int i = 1; i <= 6; i++) {
			Sum2 = Sum2 + i;
		}
		int MissingNum = Sum2 - Sum1;
		System.out.println("The missing Number in the Arrary is :" + MissingNum);

	}

}
