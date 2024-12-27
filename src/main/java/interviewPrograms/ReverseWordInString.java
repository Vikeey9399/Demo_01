package interviewPrograms;

import java.lang.reflect.Array;
import java.util.Arrays;

public class ReverseWordInString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String a = "My name is vishal";
		String[] a1 = a.split(" ");

		String revString = "";
	for(int i=0;i<=a1.length-1;i++) {
		//System.out.println(a1[i]);
		String RevWord = "";
		
		for(int j=0;j<=a1[i].length()-1;j++) {
			
			//System.out.println(a1[i].charAt(j));
			RevWord=a1[i].charAt(j)+RevWord;
		}
		// System.out.println(RevWord);
		revString=revString+RevWord+" ";
		
	}
	System.out.println(revString);

//		System.out.println(revString);

	}

}
