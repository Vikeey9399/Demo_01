package interviewPrograms;

public class LinearSearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] a = { 5, 10, 9, 100, 6, -1 };
		boolean flag = false;
		int FindEle = 9;
		for (int i = 0; i <= a.length-1; i++) {
			if (FindEle == a[i]) {
				//System.out.println("The Element is found at position " + i);
				flag=true;
			}
		}

		if(flag) {
			System.out.println("The Element is found ");
		}else {
			System.out.println("The Element is Not found ");
		}
		
	}

}
