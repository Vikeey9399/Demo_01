package interviewPrograms;

public class OddAndEvenNumbersInAnArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] a= {1,2,3,4};
		
		for(int i=0;i<=a.length-1;i++) {
			
			if(a[i]%2==0) {
				System.out.println("the even Nubers are : "+a[i]);
			}
			else if(a[i]%2==1) {
				System.out.println("the odd Nubers are : "+a[i]);
			}else {
				System.out.println("Something is fishy");
			}
			
			
		}

	}

}
