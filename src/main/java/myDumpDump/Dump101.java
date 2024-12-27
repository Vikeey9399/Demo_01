package myDumpDump;

import java.util.Date;

public class Dump101  {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Date date = new Date();
	String currentdate1 =	date.toString();
	String date1=	currentdate1.replaceAll(" ", "_");
	String currentDate=	date1.replaceAll(":", "_");
		System.out.println(currentDate);
		
	}

}
