package myDump;

import org.testng.annotations.Test;

import com.beust.jcommander.Parameter;

import org.openqa.selenium.By;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;

public class Practies1 extends BaseTestNG {

	@Parameters("browser")
	@Test(groups= { "SmokeTest" }, dataProvider = "mailtestdata",enabled = true)
	private void Task1(String MailID, String MailPassword) {
		// TODO Auto-generated method stub
		LaunchBrowserWithUrl("https://mail.apmosys.com/webmail/#sign-in");
		SendKeys(By.xpath("//input[@name='email-address']"), MailID);
		Clickme(By.xpath("//button[@name='next']"));
		SendKeys(By.xpath("//input[@name='password']"), MailPassword);
		Clickme(By.xpath("//button[@name='next']"));
		// System.out.println(VerifythePreseseOfElement(By.xpath("//div[@class='ico
		// root_private']/b")));
		WaitforElememt(By.xpath("//div[@class='ico root_private']/b"));
		String ProfileName = GetTextOfElement(By.xpath("//div[@class='ico root_private']/b"));
		// System.out.println(ProfileName);
		Clickme(By.xpath("//a[@id='gui.frm_main.stat/0']/span/i/b"));
		Clickme(By.xpath("//span[text()='Logout']"));
		if (VerifythePreseseOfElement(By.xpath("//p[text()='Vishal Gholap ']")))
			System.out.println("Test Passed");
		else
			System.out.println("Test Failed");

	}

	@Parameters("browser1")
	@Test(groups = {"sanity"},invocationCount = 1,enabled = true)
	public void Task2() {
		LaunchBrowserWithUrl("https://demo.wpeverest.com/user-registration/simple-registration-form/");
		SendKeys(By.xpath("//input[@id='first_name']"), "Ram");
		SendKeys(By.xpath("//input[@id='last_name']"), "Bajewala");
		SendKeys(By.xpath("//input[@id='user_login']"), "Narayan");
		SendKeys(By.xpath("//input[@name='user_email' and @type='email']"), "Ram123@gmail.com");
		SendKeys(By.xpath("//input[@name='user_pass' and @type='password']"), "123@Go");
		SendKeys(By.xpath("//input[@name='user_confirm_password' and @type='password']"), "123@Go");
		SendKeys(By.xpath("//textarea[@name='description' and @id='description']"), "NIce Good Well");
		Clickme(By.xpath("//button[@class='btn button ur-submit-button ']"));
		if (VerifythePreseseOfElement(By.xpath("//ul/li[text()='Email already exists.']"))) {
			System.out.println("The Negative testcase Passed");
		} else {
			System.out.println("The Negative testcase Failed");
		}

	}
	@Parameters("browser")
	@Test(groups = {"sanity"},enabled = true)
	public void Task3() {
		
		LaunchBrowserWithUrl("https://demo.wpeverest.com/user-registration/simple-registration-form/");
		SendKeys(By.xpath("//input[@id='first_name']"), "A"+dateAndTime());
		SendKeys(By.xpath("//input[@id='last_name']"), "R");
		SendKeys(By.xpath("//input[@id='user_login']"), "Rehman"+dateAndTime());
		SendKeys(By.xpath("//input[@name='user_email' and @type='email']"), "Ram"+dateAndTime()+"@gmail.com");
		SendKeys(By.xpath("//input[@name='user_pass' and @type='password']"), "0000@Go");
		SendKeys(By.xpath("//input[@name='user_confirm_password' and @type='password']"), "0000@Go");
		SendKeys(By.xpath("//textarea[@name='description' and @id='description']"), "NIce Good Well");
		Clickme(By.xpath("//button[@class='btn button ur-submit-button ']"));
		if (VerifythePreseseOfElement(By.xpath("//ul[text()='User successfully registered.']")))
			System.out.println("The Positive Test Is passed");
		else
			System.out.println("The Positive Test Is Failed");

		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	@Test
	@DataProvider(name = "mailtestdata")
	public Object[][] testData() {

		Object[][] twitterdata = new Object[2][2];
		twitterdata[0][0] = Dump1.ReadConfigFile("mailID");
		twitterdata[0][1] = Dump1.ReadConfigFile("mailPass");
		twitterdata[1][0] = Dump1.ReadConfigFile("mailID1");
		twitterdata[1][1] = Dump1.ReadConfigFile("mailPass1");
		
		return twitterdata;
	}

}
