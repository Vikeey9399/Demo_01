package myDump;

import org.openqa.selenium.By;

public class InputBoxpractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Dump1.Setup();
		Dump1.LaunchBrowserWithUrl("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		Dump1.SendKeys(By.xpath("//input[@name='username']"), Dump1.inputBox());
		Dump1.SendKeys(By.xpath("//input[@name='password']"), Dump1.inputBox());
		
		
	}

}
