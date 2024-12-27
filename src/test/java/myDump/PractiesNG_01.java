package myDump;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class PractiesNG_01 extends BaseTestNG {
	
	
	@Test
	 @Parameters({"browser", "username"})
	private void mail(String browser, String username) {
		LaunchBrowserWithUrl("https://mail.apmosys.com/webmail/");
		System.out.println(browser+username);
	}
	
	
	@Test
	private void facebook() {
		LaunchBrowserWithUrl("https://www.facebook.com/");
		System.out.println(	driver.getTitle());
		printme(driver.getTitle());
	}
	@Test
	private void Insta() {
		LaunchBrowserWithUrl("https://www.instagram.com/");
		System.out.println(	driver.getTitle());
		printme(driver.getTitle());
	}

}
