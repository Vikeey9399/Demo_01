package interviewPrograms;

import java.util.Scanner;

public class GenrateFibonacciSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n1=0;
		int n2=1;
		int n3;
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number of Fibonacci series you want to print:");
		int j=sc.nextInt();
		
		System.out.println(n1);
		System.out.println(n2);
		for(int i=0;i<j-2;i++) {
		
			n3=n1+n2;
			System.out.println(n3);
			n1=n2;
			n2=n3;
			
		}
		
		
	}

}
