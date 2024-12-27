package dailytaskAug8;

import java.util.Scanner;

import trash.InputBox;

public class PasswordValidations {
	static String Password;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		  • At least one numeric digit
//		    • At Least one Small/Lowercase Letter
//		    • At Least one Capital/Uppercase Letter
//		    • Must not have space 
//		    • Must not have slash (/)
//		    • At least 6 characters
//		If someone inputs an invalid password, the code prints: “Invalid password, try again”.
//		Otherwise, it prints: “password valid”.

		Scanner input = new Scanner(System.in);
		System.out.println("please enter Password : ");
		Password = InputBox.inputBox(); //input.next();

		if (PasswardValidations(Password)) {
			System.out.println("Password valid");
		} else {
			System.out.println("Invalid password, try again");
		}

	}

	public static boolean PasswardValidations(String password) {
		// TODO Auto-generated method stub
		if (password.length() < 6) {
			return false;
		}

		if (!password.matches(".*[a-z].*")) {
			return false;
		}
		if (!password.matches(".*[A-Z].*")) {
			return false;
		}
		if (!password.matches(".*[0-9].*")) {
			return false;
		}
		if (password.contains(" ") && password.contains("/") ) {
            return false;
        }

		return true;

	}

}
