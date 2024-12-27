package pROGS;

import java.util.Scanner;

public class ReverseAString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);
		String UserInput = scan.nextLine();
		System.out.println("Enter The String :");
		System.out.println(UserInput);

		String empty = "";
		for (int i = 0; i < UserInput.length(); i++) {
			empty = UserInput.charAt(i) + empty;
		}
		System.out.println("The Reverse String Is :" + empty);

//____________________OR_______________________________		

		int myNum = 121;

		String MyNumber = String.valueOf(myNum);

		String rev = "";
		for (int i = MyNumber.length() - 1; i >= 0; i--) {

			rev = rev + MyNumber.charAt(i);
		}
		System.out.println("This is my rev:" + rev);

		if (rev.equals(MyNumber)) {
			System.out.println(rev + " : is palindrom");
		} else {
			System.out.println(rev + " : is not Plindrom ");
		}

	}

}
