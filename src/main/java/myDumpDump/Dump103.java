package myDumpDump;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Dump103 {

	public static <E> void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = { 1, 12, 4, 7, 9 };

		int max = Integer.MIN_VALUE;
		int secmax = Integer.MIN_VALUE;
		for (int i = 0; i < a.length; i++) {

			if (a[i] > max) {
				max = a[i];
			}
//			if(a[i]>max) {
//				secmax=max;
//				max=a[i];
//			} 
			if (a[i] > secmax && a[i] != max) {
				secmax = a[i];
			}
		}
		System.out.println(max + ":is the bigest of all");
		System.out.println(secmax + ":is the secound bigest ");
		System.out.println("****************************************************************************");
//		******************************************************************************

		int b = 5;

		if (b % 2 == 0) {
			System.out.println(b + ":the number is even");
		}
		if (b % 2 == 1) {
			System.out.println(b + ":the number is odd");
		}
		System.out.println("****************************************************************************");
//		******************************************************************************

		int c = 6;
		int cou = 0;
		if (c == 0 || c == 1) {
			System.out.println("0 and 1 are not prime");
		}
		for (int i = 1; i <= c; i++) {
			if (c % i == 0) {
				cou++;
			}
		}
		if (cou == 2) {
			System.out.println(c + ":is prime Number");
		} else {
			System.out.println(c + ":is not prime number");
		}
		System.out.println("****************************************************************************");
//		************************************************************************

		int yourNumb = 10;
		int n1 = 0;
		int n2 = 1;
		int sum = 0;
		int next;
		for (int i = 2; i <= yourNumb; i++) {
			sum = n1 + n2;
			System.out.print(sum);
			n1 = n2;
			n2 = sum;
		}
		System.out.println("****************************************************************************");

//		****************************************************************************

		int[] ab = { 1, 2, 3, 4, 5, 3, 1, 6, 1, 3, 5, 4, 3 };

		HashSet<Integer> hashSet = new HashSet<Integer>();

		for (int i : ab) {
			hashSet.add(i);

		}

		for (Integer i : hashSet) {
			int count = 0;
			for (Integer j : ab) {
				if (i == j) {
					count++;
				}
			}
			// System.out.println(count);
			if (count > 1) {
				System.out.println(i + ": is repetedfor  " + count);
			}
		}

		// *****************************************************************************
		System.out.println("****************************************************************************");

		String name = "vishal dilip gholap";
		StringBuilder SB = new StringBuilder();
		String namewothouspace = name.replaceAll(" ", "");

		for (int i = 0; i <= namewothouspace.length() - 1; i++) {

			char a1 = namewothouspace.charAt(i);
			if (SB.indexOf(String.valueOf(a1)) == -1) {
				SB.append(a1);

			}
		}
		System.out.println(SB);
		// System.out.println(namewothouspace);

		for (int i = 0; i <= SB.length() - 1; i++) {
			// System.out.println(namewothouspace.charAt(i));
			int mycount = 0;
			for (int j = 0; j <= namewothouspace.length() - 1; j++) {
				if (SB.charAt(i) == namewothouspace.charAt(j)) {
					// System.out.println(namewothouspace.charAt(i));
					mycount++;
				}

			}
			if (mycount > 1) {
				System.out.println(SB.charAt(i) + ":" + mycount);

			}
		}

		System.out.println("****************************************************************************");

		int MyNumb = 153;
		int OGNumb = MyNumb;
		int result = 0;
		
		while(MyNumb!=0) {
			int Digit=MyNumb%10;
			result += Digit*Digit*Digit;
			MyNumb/=10;
		}
		if (result==OGNumb) {
			System.out.println(OGNumb+" is Armstrong Number");
		}
		else {
			System.out.println(OGNumb+" is Not an armstrong no");
		}
		
		System.out.println("****************************************************************************");

		int num1=0;
		int num2=1;
		int num3=0;
		
		for(int i=0;i<=10;i++) {
			System.out.println(num1);
			num3=num1+num2;
			num1=num2;
			num2=num3;
			
		}
		
		System.out.println("****************************************************************************");

		String Dump="eevee";
		String Rev ="";		
		for(int i=0;i<=Dump.length()-1;i++) {
		
			Rev=Dump.charAt(i)+Rev;
			
			
		}
		System.out.println(Rev);
		if(Rev.equalsIgnoreCase(Dump)) {
			System.out.println("palindrome");
		}else {
			System.out.println("Not palindrome");
		}
		
		
		
		
		
		
		
		
		
		
		
	}

}
