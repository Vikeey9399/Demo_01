package interviewPrograms;

public class ReverseNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Algorithm(1234);
		StringBufferRev(1234);
		StringBuilderRev(1234);

	}

	public static void Algorithm(int Num) {
		
		int rev = 0;
		while (Num != 0) {

			rev = rev * 10 + Num % 10;
			Num = Num / 10;
		}
		System.out.println("The Rev Num is " + rev);

	}

	public static void StringBufferRev(int Num) {

		StringBuffer rev;
		String myNum = String.valueOf(Num);
		StringBuffer SB = new StringBuffer(myNum);
		System.out.println("the rev Num is " + SB.reverse());

	}

	public static void StringBuilderRev(int Num) {

		StringBuilder sbb = new StringBuilder();
		sbb.append(Num);

		StringBuilder rev = sbb.reverse();
		System.out.println("The rev Num is " + rev);

	}
}
