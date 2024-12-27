package interviewPrograms;

import java.util.HashSet;

public class FindDuplicateElementInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String[] names= {"sagar","sham","ram","narayan","ram","sagar"};
		
		HashSet<String> hs=new HashSet();
		
		for(String name:names) {
			
			if(hs.add(name)==false) {
				System.out.println("The Duplicate Name found that is :"+name); 
				
			}
		}
		
		//Detailed way
		
		for(int i=0;i<=names.length-1;i++) {
			
			for(int j=i+1;j<names.length;j++) {
				if(names[i]==names[j]) {
					System.out.println("The Duplicate Name found "+names[i]);
				}
			}
		}
		
		
		
		
		

	}

}
