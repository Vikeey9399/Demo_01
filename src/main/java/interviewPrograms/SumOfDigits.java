package interviewPrograms;

public class SumOfDigits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int Num=1234;
		int Sum = 0;
		
		while(Num>0) {
			
			Sum=Sum+Num%10;
			Num=Num/10;
			
		}
		System.out.println("The Sum of Digits in the Number is "+Sum);
		

	}

}
