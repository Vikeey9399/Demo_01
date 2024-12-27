package interviewPrograms;

public class CountEvenAndOddDigitInNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int Num = 902236223;
		int EvenCount = 0;
		int OddCount = 0;

		while (Num > 0) {

			int rem = Num % 10;
			if (rem % 2 == 0) {
				EvenCount++;
			} else {
				OddCount++;
			}

			Num = Num / 10;

		}
		System.out.println(" The count of even digits in Number is "+EvenCount);
		System.out.println(" The count of odd digits in Number is "+OddCount);

	}

}
