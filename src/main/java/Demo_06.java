

public class Demo_06 {

	public static void main(String[] args) {

		String Sen = "My Name Is Vishal";
		boolean flag = true;
		String[] words = Sen.split(" ");
		for (String word : words) {

			char ch = word.charAt(0);
			if (!Character.isUpperCase(ch)) {
				flag = false;
			}

		}
		if (flag) {
			System.out.println("yes its capital");
		} else {
			System.out.println("No its small");
		}
	}

}
