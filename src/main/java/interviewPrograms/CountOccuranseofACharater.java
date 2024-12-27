package interviewPrograms;

public class CountOccuranseofACharater {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		String a="rama narayan baje wala";
		char mychar= 'a';
		int count = 0;
		for(int i=0;i<=a.length()-1;i++) {
			if(a.charAt(i)==mychar) {
				count++;
			}
		}
		System.out.println("The count of char "+mychar+" is "+count);
		
		
		int totalcount= a.length();
		int countAfterRemovingMyChar =a.replaceAll("a", "").length();
		System.out.println("The total count of charter a in string is "+(totalcount-countAfterRemovingMyChar));
		
		
		
		
	}

}
