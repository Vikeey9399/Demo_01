package interviewPrograms;

import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Your Number :");
		int Num = sc.nextInt();
		int count = 0;

		if (Num > 0) {

			for (int i = 1; i <= Num; i++) {

				if (Num % i == 0) {
					count++;
				}
			}
			if (count == 2) {
				System.out.println(Num + " The Number is  prime Number");
			} else {
				System.out.println(Num + " The Number is not prime Number");
			}

		} else {

			System.out.println(Num + " The Number is not prime Number");
		}

	}

}
