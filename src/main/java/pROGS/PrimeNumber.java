package pROGS;

public class PrimeNumber {

	public static void main(String[] args) {
		
		
		int Num = 13;
		int Count=0;
		if(Num==0||Num==1) {
			System.out.println("The 0 and 1 are not prime");
		}
		for(int i=1;i<=Num;i++) {
			if(Num % i == 0) {
				Count++;
			}
		}
		if (Count==2) {
			System.out.println(Num+":is prime Number");
		}else {
			System.out.println(Num+":is not prime Number");

		}
	}

}
