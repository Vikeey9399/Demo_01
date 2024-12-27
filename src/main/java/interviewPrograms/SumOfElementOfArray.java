package interviewPrograms;

public class SumOfElementOfArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a= {1,2,3,4};
		
		int sum=0;
		
		for(int i=0;i<=a.length-1;i++) {
			sum=sum+a[i];
		}
		System.out.println("the Sum of elements In Array A :"+sum);

		
	}
	
	

}
