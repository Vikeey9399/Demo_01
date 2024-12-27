package interviewPrograms;

public class CountTheWordInString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String myString = "hello guys this is vishal gholap and i am an QA";
		int count = 1;

		String str = myString.replace(" ", "");
		String[] mystr = myString.split(" ");

		System.out.println("total Number of words are "+mystr.length);

		System.out.println(mystr);

		for (int i = 0; i <= mystr.length - 1; i++) {

			String ch = mystr[i];
			count++;
			System.out.println("The " + count + "st" + " Word In String is " + ch);

		}
		System.out.println("Count The Word In String==>>>" + count);

	}

}
