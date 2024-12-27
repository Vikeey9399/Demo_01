package interviewPrograms;

public class ReverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		UsingCharAt("Hello World");
		UsingArray("Say Hiii");
	}

	public static void UsingCharAt(String value) {

		String rev = "";
		for (int i = 0; i <= value.length() - 1; i++) {

			rev = value.charAt(i) + rev;
		}
		System.out.println("The rev of String is " + rev);
	}

	public static void UsingArray(String value) {

		String rev = "";
		char[] myArr = value.toCharArray();
		//System.out.println(myArr);
		for (int i = 0; i <= myArr.length - 1; i++) {

			rev = myArr[i] + rev;
		}
		System.out.println("The rev of String Array is" + rev);
	}
}
