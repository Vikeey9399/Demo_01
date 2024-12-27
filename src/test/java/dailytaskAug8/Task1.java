package dailytaskAug8;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.aventstack.extentreports.Status;

import myDump.Dump1;

public class Task1 extends Dump1 {

	static WebDriver driver;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Positive();
		Negative();
		// AmezonProductSearch();
		AmezonProductBuy();
	}

	public static void Positive() {
		Setup();

		test1 = extendReportHTMLReport().createTest("TC_Ragistration_Positive_Flow",
				"To check the positive flow and validate the success massage");

		try {

			LaunchBrowserWithUrl("https://demo.wpeverest.com/user-registration/simple-registration-form/");
			SendKeys(By.xpath("//input[@id='first_name']"), "A" + dateAndTime());
			SendKeys(By.xpath("//input[@id='last_name']"), "R");
			SendKeys(By.xpath("//input[@id='user_login']"), "Rehman" + dateAndTime());
			SendKeys(By.xpath("//input[@name='user_email' and @type='email']"), "Ram" + dateAndTime() + "@gmail.com");
			SendKeys(By.xpath("//input[@name='user_pass' and @type='password']"), "0000@Go");
			SendKeys(By.xpath("//input[@name='user_confirm_password' and @type='password']"), "0000@Go");
			SendKeys(By.xpath("//textarea[@name='description' and @id='description']"), "NIce Good Well");
			Clickme(By.xpath("//button[@class='btn button ur-submit-button ']"));

			if (ValidateAndTakeScreenshot(By.xpath("//ul[text()='User successfully registered.']"))) {
				System.out.println("The Positive Test Is passed");
				test1.pass("The Positive Test Is passed");
//				test1.addScreenCaptureFromPath(getScreenShot());
				test1.log(Status.INFO, "All the form details are filed").addScreenCaptureFromBase64String(Base_64(),
						Thread.currentThread().getStackTrace()[1].getMethodName());
			} else {
				System.out.println("The Positive Test Is Failed");
				test1.fail("The Positive Test Is Failed");
				test1.log(Status.INFO, "There is some issue ").addScreenCaptureFromBase64String(Base_64(),
						Thread.currentThread().getStackTrace()[1].getMethodName());
				// test1.addScreenCaptureFromPath(getScreenShot());
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		TearDown();
	}

	public static void Negative() {

		Setup();


		test1 = extend.createTest("TC_Ragistration_Nigative_Flow",
				"To check the Nigative flow and validate the success massage");
		try {

			LaunchBrowserWithUrl("https://demo.wpeverest.com/user-registration/simple-registration-form/");
			SendKeys(By.xpath("//input[@id='first_name']"), "Ram");
			SendKeys(By.xpath("//input[@id='last_name']"), "Bajewala");
			SendKeys(By.xpath("//input[@id='user_login']"), "Narayan");
			SendKeys(By.xpath("//input[@name='user_email' and @type='email']"), "Ram123@gmail.com");
			SendKeys(By.xpath("//input[@name='user_pass' and @type='password']"), "123@Go");
			SendKeys(By.xpath("//input[@name='user_confirm_password' and @type='password']"), "123@Go");
			SendKeys(By.xpath("//textarea[@name='description' and @id='description']"), "NIce Good Well");
			Clickme(By.xpath("//button[@class='btn button ur-submit-button ']"));
			if (ValidateAndTakeScreenshot(By.xpath("//ul/li[text()='Email already exists.']"))) {
				System.out.println("The Negative testcase Passed");
				test1.pass("The Negative testcase Passed");
				test1.log(Status.INFO, "The form error validation is success").addScreenCaptureFromBase64String(Base_64(),
						Thread.currentThread().getStackTrace()[1].getMethodName());

				// test1.addScreenCaptureFromPath(getScreenShot());
			} else {
				System.out.println("The Negative testcase Failed");
				test1.fail("The Negative testcase Failed");
				test1.log(Status.INFO, "There is some issue ").addScreenCaptureFromBase64String(Base_64(),
						Thread.currentThread().getStackTrace()[1].getMethodName());
				// test1.addScreenCaptureFromPath(getScreenShot());
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		TearDown();
	}

	public static void AmezonProductSearch() {
		Setup();

		try {

			LaunchBrowserWithUrl("https://www.amazon.in/");
			SendKeys(By.xpath("//input[@id='twotabsearchtextbox']"), "Moto G85 5G");
			MoveOverCurser(By.xpath("//input[@id='nav-search-submit-button']"));
			ScrollDowntillElement(By.xpath("//span[text()='Moto G85 5G (8GB 128GB, Urban Grey, New)']"));
//		System.out.println(VerifythePreseseOfElement(By.xpath("//span[text()='Moto G85 5G (8GB 128GB, Urban Grey, New)']")));
			Clickme(By.xpath("//a[@id='nav-logo-sprites']"));
			ScrollDowntillElement(By.xpath("(//span[contains(text(),'Fastrack Limitless Glide Advanced Ultr')])[2]"));
			String Item = GetTextOfElement(
					By.xpath("(//span[contains(text(),'Fastrack Limitless Glide Advanced Ultr')])[2]"));
			// System.out.println(Item);
			SendKeys(By.xpath("//input[@id='twotabsearchtextbox']"), Item);
			MoveOverCurser(By.xpath("//input[@id='nav-search-submit-button']"));
			ScrollDowntillElement(By.xpath("(//span[contains(text(),'Fastrack Limitless Glide Advanced Ultr')])[2]"));
			Clickme(By.xpath("(//span[contains(text(),'Fastrack Limitless Glide Advanced Ultr')])[2]"));

		} catch (Exception e) {
			e.printStackTrace();
		}

		if (ValidateAndTakeScreenshot(
				By.xpath("(//span[contains(text(),'Fastrack Limitless Glide Advanced Ultr')])[2]"))) {
			System.out.println("The AmezonProductSearch testcase Passed");
		} else {
			System.out.println("The AmezonProductSearch testcase Failed");
		}
		TearDown();

	}

	public static void AmezonProductBuy() {
		Setup();
		test1 = extend.createTest("TC_AmezonProductBuy_Flow",
				"To check the AmezonProductBuy flow and validate the success massage");
		try {

			LaunchBrowserWithUrl("https://www.amazon.in/");
			SendKeys(By.xpath("//input[@id='twotabsearchtextbox']"), "Moto G85 5G");
			MoveOverCurser(By.xpath("//input[@id='nav-search-submit-button']"));
			ScrollDowntillElement(By.xpath("//span[text()='Moto G85 5G (256, Olive Green, New)']"));
			// System.out.println(VerifythePreseseOfElement(By.xpath("//span[text()='Moto
			// G85 5G (256, Olive Green, New)']")));
			Clickme(By.xpath("//span[text()='Moto G85 5G (256, Olive Green, New)']"));
			Switchtotabs(1);
			ScrollDowntillElement(By.xpath("//input[@id='buy-now-button']"));
			Clickme(By.xpath("//input[@id='mbb-offeringID-1' and @type='checkbox']"));
			SelctByText(By.xpath("//select[@id='quantity']"), "2");
			Clickme(By.xpath("//input[@id='buy-now-button']"));
			

		} catch (Exception e) {
			System.out.println("this is catch");
			e.printStackTrace();
		}

		if (ValidateAndTakeScreenshot(By.xpath("//span[@id='continue']"))) {
			System.out.println("The AmezonProductBuy testcase Passed");
			test1.pass("The AmezonProductBuy testcase Passed");
			 test1.log(Status.INFO, "The purches is success").addScreenCaptureFromBase64String(Base_64(), Thread.currentThread().getStackTrace()[1].getMethodName());

		} else {
			System.out.println("The AmezonProductBuy testcase Failed");
			test1.fail("The AmezonProductBuy testcase Failed");
			 test1.log(Status.INFO, "There is some issue ").addScreenCaptureFromBase64String(Base_64(), Thread.currentThread().getStackTrace()[1].getMethodName());

			
		}
		TearDown();

	}
}
