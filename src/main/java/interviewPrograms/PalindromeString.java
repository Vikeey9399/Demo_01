package interviewPrograms;

public class PalindromeString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str ="MADAM";
		String rev="";
		
		
		for(int i=0;i<=str.length()-1;i++) {
			
		rev=str.charAt(i)+rev;
			
		}
		//System.out.println(rev);
		if(str.equals(rev)) {
			System.out.println(str+" is a Palindrome String");
		}
		else {
			System.out.println(str+" is Not a Palindrome String");
		}
		

	}

}
