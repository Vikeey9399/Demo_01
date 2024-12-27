package interviewPrograms;

public class Factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stubfact
		int Num = 6;
		int fact = 1;

		for (int i = 1; i <= Num; i++) {

			fact = fact * i;

		}
		System.out.println(Num + " The factorial of the number is " + fact);

	}

}
