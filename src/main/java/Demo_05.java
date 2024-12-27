import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.FluentWait;

public class Demo_05 extends Demo_Base {

	public static void main(String[] args) {

		String myFile = "/home/apmosys/Documents/MYSHEET.xlsx";
		FileInputStream fis = null;
		XSSFWorkbook workbook = null;
		try {
			fis = new FileInputStream(myFile);
			try {
				workbook = new XSSFWorkbook(fis);
			} catch (IOException e) {
				e.printStackTrace();
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		XSSFSheet mySheet = workbook.getSheet("Sheet2");
		
		
		
//		XSSFRow myRow = mySheet.getRow(1);
//		XSSFCell myCell = myRow.getCell(0);
		
		
		
		
		
//		System.out.println("For 1 0 "+	mySheet.getRow(1).getCell(0).getStringCellValue());
//		
//		System.out.println("For 1 1 "+	mySheet.getRow(1).getCell(1).getStringCellValue());
//		
//		System.out.println("For 2 0 "+	mySheet.getRow(2).getCell(0).getStringCellValue());
//		
//		System.out.println("For 2 1 "+	mySheet.getRow(2).getCell(1).getStringCellValue());
	
		
		List<List<String>> excelData = new ArrayList<>();
		int lastRowIndex = mySheet.getLastRowNum();
		for (int i = 1; i <= lastRowIndex; i++) {
		
			 
			XSSFRow row = mySheet.getRow(i);
			if (row != null) {
				List<String> rowData = new ArrayList<>();
				int lastCellIndex = row.getLastCellNum() - 1;
				for (int j = 0; j <= lastCellIndex; j++) {

					XSSFCell cell = row.getCell(j);
					if (cell != null) {
		                rowData.add(cell.getStringCellValue());

						System.out.println(cell.getStringCellValue());
						String Username = cell.getStringCellValue();
						System.out.println();
						
					} else {
						System.out.println("Cell (" + i + ", " + j + ") is empty or null.");
						 rowData.add("");
					}
				}
				  excelData.add(rowData);
			} else {
				System.out.println("Row (" + i + ") is empty or null.");
			}
		}
		for (List<String> row : excelData) {
		    System.out.println(row);
		}
		
		
		
		String Uname1=mySheet.getRow(1).getCell(0).getStringCellValue();
		String pass1=	mySheet.getRow(1).getCell(1).getStringCellValue();
		String Uname2=	mySheet.getRow(2).getCell(0).getStringCellValue();
		String pass2=	mySheet.getRow(2).getCell(1).getStringCellValue();
			
		Demo_Base.GetDriver();
		driver.get("https://www.facebook.com/");
		driver.findElement(By.id("email")).sendKeys(Uname1);
		driver.findElement(By.id("pass")).sendKeys(pass1);
		driver.findElement(By.xpath("//div[@class='_6ltg']/button")).click();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	
//
//		boolean found = false;
//		for (Row row : mySheet) {
//
//			for (Cell cell : row) {
//				System.out.println(cell.getStringCellValue());
//				if (cell.getStringCellValue().equalsIgnoreCase("openbrowser")) {
//					Demo_Base.GetDriver();
//					System.out.println("***************************if block");
//					
//				}
//				if (cell.getStringCellValue().equalsIgnoreCase("openurl")) {
//					driver.get("https://mail.apmosys.com/webmail/");
//				}
//				if (cell.getStringCellValue().equalsIgnoreCase("username")) {
//					driver.findElement(By.name("email-address")).sendKeys("vishal.ghoalp@apmosys.com");
//					driver.findElement(By.name("next")).click();
//				}
//				if (cell.getStringCellValue().equalsIgnoreCase("password")) {
//					driver.findElement(By.name("password")).sendKeys("q@123");
//					driver.findElement(By.name("next")).click();
//					//found = true;
//				}
//			}
//			if (found) {
//				System.out.println("****************outer if");
//				 break;
//			}
//
//		}
//
//	
//		
//		
//		
//		
//		
//		
//		
//		
//		
//		
//		
//		
//		
//		
//		
//		
//		
//		
//		
//		
//		
//		
//		
//		
//		
//		
//		
//		

		List<String> list = new ArrayList<>();
		list.add("A");
		list.add("B");
		list.add("C");

//		for(int i=0;i<=list.size()-1;i++) {
//			String name=list.get(i);
//			if (name.equals("A")) {
//				list.remove(name); // Causes ConcurrentModificationException
//			}
//		}

		// Iterate and modify
//		for (String item : list) {
//			System.out.println(list.size());
//			if (item.equals("A")) {
//				list.remove(item); // Causes ConcurrentModificationException
//				System.out.println(list.size());
//			}
//		}
//		for(String ne : list) {
//			
//			System.out.println(ne);
//		}
		
		
//		FluentWait<WebDriver> fwait= new FluentWait<WebDriver>(driver);
//		fwait.withTimeout(Duration.ofSeconds(10)).pollingEvery(Duration.ofSeconds(5)).ignoring(NoSuchElementException.class);
//		fwait.until(driver -> driver.findElement(By.xpath("")) );
	}
	

	

}
