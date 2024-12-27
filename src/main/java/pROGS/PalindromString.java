package pROGS;

import java.util.Scanner;

public class PalindromString {

	public static void main(String[] args) {
		Scanner scan =new Scanner(System.in);
		System.out.print("Enter The String : ");
	String Input= scan.nextLine();
//	int NUMInput= scan.nextInt();
	
	
	StringBuilder sb = new StringBuilder(Input);
	String revString = sb.reverse().toString();
	System.out.println(revString);
	if(Input.equals(revString)) {
		System.out.println(Input+" is Palindrome");
	}else{
		System.out.println(Input+" is not Palindrome");
	}
	
    }

}
