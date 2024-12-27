package interviewPrograms;

public class palindrome_Number {

	public static void main(String[] args) {

		int Num = 1221;

		int OGNum = Num;

		int rev = 0;

		while (Num != 0) {
			rev = rev * 10 + Num % 10;
			Num = Num / 10;
		}
		//System.out.println(rev);

		if (OGNum==rev) {
			System.out.println(OGNum + " is the Palindrome Number");
		} else {
			System.out.println(OGNum + " is Not the Palindrome Number");
		}

	}

	
}
