package interviewPrograms;

public class RemoveSpacialChar {

	public static void main(String[] args) {
		
		String a="!@#$%hello$%&*world";
		a=a.replaceAll("[^a-zA-z0-9]", "");//removing Special char 
		System.out.println(a);
		
		
		String b="hello world from java";
		b=b.replaceAll("\\s", ""); //removing space
		System.out.println(b);
		
	}

}
