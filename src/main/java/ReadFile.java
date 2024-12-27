import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;

class ReadFile extends Demo_Base {

	public static void main(String[] args) {

		String myFile = "/home/apmosys/Documents/MYSHEET.xlsx";
		FileInputStream fis = null;
		XSSFWorkbook workbook = null;
		try {
			fis = new FileInputStream(myFile);
			try {
				workbook = new XSSFWorkbook(fis);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		XSSFSheet mySheet = workbook.getSheet("Sheet1");
		XSSFRow myRow = mySheet.getRow(0);
		XSSFCell myCell = myRow.getCell(0);
//         int myRows = mySheet.getLastRowNum().;
		boolean found = false;
		for (Row row : mySheet) {

			for (Cell cell : row) {
				System.out.println(cell.getStringCellValue());
				if (cell.getStringCellValue().equalsIgnoreCase("openbrowser")) {
					Demo_Base.GetDriver();
					System.out.println("***************************if block");
					
				}
				if (cell.getStringCellValue().equalsIgnoreCase("openurl")) {
					driver.get("https://mail.apmosys.com/webmail/");
				}
				if (cell.getStringCellValue().equalsIgnoreCase("username")) {
					driver.findElement(By.name("email-address")).sendKeys("vishal.ghoalp@apmosys.com");
					driver.findElement(By.name("next")).click();
				}
				if (cell.getStringCellValue().equalsIgnoreCase("password")) {
					driver.findElement(By.name("password")).sendKeys("q@123");
					driver.findElement(By.name("next")).click();
					//found = true;
				}
			}
			if (found) {
				System.out.println("****************outer if");
				 break;
			}

		}

	}
}