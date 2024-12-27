package pROGS;

public class MissingNumberInArray {

	public static void main(String[] args) {
		
		int[]Myarray= {1,2,4,3,5,6,7,9};
		int n=9;
		
		int ActualNumber = n*(n+1)/2;
		System.out.println(ActualNumber);
		
		int expextedNumber=0;
		for(int i=0;i<=Myarray.length-1;i++) {
			expextedNumber= expextedNumber+Myarray[i];
			
		}
		System.out.println(expextedNumber);
		int MissingNumberFromArray =ActualNumber-expextedNumber;
		System.out.println(MissingNumberFromArray);

	}

}
