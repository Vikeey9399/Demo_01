package interviewPrograms;

public class ArmstrongNumber {

	public static void main(String[] args) {

		int Num = 7;
		int OGNum = Num;
		int sum = 0;
		while (Num > 0) {
			sum = sum + (Num % 10) * (Num % 10) * (Num % 10);
			Num = Num / 10;
		}
		if (OGNum == sum) {
			System.out.println("The Number is Armstrong " + OGNum);
		} else if (OGNum <= 9) {
			System.out.println("The Number is Armstrong " + OGNum);
		} else {
			System.out.println("The Number not is Armstrong " + OGNum);

		}

	}

}
