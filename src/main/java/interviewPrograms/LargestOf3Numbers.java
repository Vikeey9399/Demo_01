package interviewPrograms;

import java.util.Scanner;

public class LargestOf3Numbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter Your 1st Number : ");
		int a=sc.nextInt();
		System.out.println("Enter Your 2nd Number : ");
		int b=sc.nextInt();
		System.out.println("Enter Your 3rd Number : ");
		int c=sc.nextInt();
		
		if(a>b&&a>c) {
			System.out.println(a+" is the greatest Number");
		}
		else if(b>a&&b>c) {
			System.out.println(b+" is the greatest Number");
		}
		else {
			System.out.println(c+" is the greatest Number");
		}
		

	}

}
