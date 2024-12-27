package trash;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import myDump.Dump1;

public class FillEOD extends Dump1 {


	public static void EOD() {
		System.out.println("inside EOD");
		WaitFor2Secound();
		Clickme(By.xpath("//select[@id='dayTypeCursor']"));
		DownArrow();
		TabKey();
		WaitFor2Secound();
		Clickme(By.xpath("//input[@id='officeInTime']"));
		SelectInTime();
		WaitFor2Secound();
		Clickme(By.xpath("//input[@id='officeOutTime']"));
		OutTime();
		WaitFor2Secound();
		Clickme(By.xpath("//*[@role='combobox']"));
		DownArrow();
		DownArrow();
		TabKey();
		Clickme(By.xpath("(//*[@role='combobox'])[2]"));
		TabKey();
		Clickme(By.xpath("(//*[@role='combobox'])[3]"));
		TabKey();
		SelctByText(By.xpath("(//select[@id='dayTypeCursor'])[2]"), "Test Script Execution ");
		SendKeys(By.xpath("//textarea[@id='dayTypeDesc']"), "Regration on Ipru Edge Ios");
		SendKeys(By.xpath("//input[@type='number']"), "9");
		Clickme(By.xpath("//button[@type='submit']"));
		WaitFor2Secound();
		Clickme(By.xpath("//button[text()='OK']"));
		Clickme(By.xpath("//button[text()='Create New Timesheet']"));
		WaitFor2Secound();

	}

	static void Clickme(WebElement date) {

		date.click();
	}

	public static void SelectInTime() {
		WebElement date = driver.findElement(
				By.xpath("(//td[contains(@class, 'owl-dt-calendar-cell') and not(@aria-disabled='true')])[1]"));
		WebElement TimeSt = driver.findElement(By.xpath("//span[text()='PM']"));
		boolean mydate = date.isEnabled();
		if (mydate) {
			// Clickme(date);
			String ADte = date.getText();
			Clickme(date);
			System.out.println(ADte);

			WaitFor2Secound();
			SendKeys(By.xpath("(//*[@class='owl-dt-timer-input'])[1]"), "10");

			WaitFor2Secound();
			SendKeys(By.xpath("(//*[@class='owl-dt-timer-input'])[2]"), "07");
			WaitFor2Secound();
			String TimeStamp = TimeSt.getText();
			if (TimeStamp.equalsIgnoreCase("PM")) {
				Clickme(TimeSt);
			} else {
				System.out.println("this is only PM");
			}
			Clickme(By.xpath("//Button/span[text()='Set']"));

		} else {
			System.out.println("date are disabled");
		}

	}

	public static void OutTime() {

		WebElement date = driver.findElement(
				By.xpath("(//td[contains(@class, 'owl-dt-calendar-cell') and not(@aria-disabled='true')])[1]"));
		WebElement TimeSt = driver.findElement(By.xpath("//span[text()='AM']"));
		boolean mydate = date.isEnabled();
		if (mydate) {
			// Clickme(date);
			String ADte = date.getText();
			Clickme(date);
			System.out.println(ADte);
			Dump1.WaitforElememt(By.xpath("(//*[@class='owl-dt-timer-input'])[1]"));
			WaitFor2Secound();
			SendKeys(By.xpath("(//*[@class='owl-dt-timer-input'])[1]"), "07");
			WaitFor2Secound();
			SendKeys(By.xpath("(//*[@class='owl-dt-timer-input'])[2]"), "20");
			WaitFor2Secound();
			String TimeStamp = TimeSt.getText();
			if (TimeStamp.equalsIgnoreCase("AM")) {
				Clickme(TimeSt);
			} else {
				System.out.println("this is only PM");
			}
			Clickme(By.xpath("//Button/span[text()='Set']"));

		} else {
			System.out.println("date are disabled");

		}

	}

}
