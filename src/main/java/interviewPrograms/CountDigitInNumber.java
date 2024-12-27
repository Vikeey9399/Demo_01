package interviewPrograms;

public class CountDigitInNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int digit= 123456789;
		int count=0;
		while(digit !=0) {
			count++;
			digit=digit/10;
		}
		System.out.println("the count of digits in Numbers are "+count);
		
	}

}
