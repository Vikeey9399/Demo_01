import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.locators.RelativeLocator;

public class Demo_FullPageSS extends Demo_Base implements a {

	public static void main(String[] args) {
		
		
		WebDriver driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		driver.get("https://www.w3schools.com/");
		
		FirefoxDriver fullPageScreenshot 	=(FirefoxDriver)driver;
		File src = fullPageScreenshot.getFullPageScreenshotAs(OutputType.FILE);
		
		try {
			FileUtils.copyFile(src, new File("/home/apmosys/Desktop/bkp/eclipse-workspace/myDump/src/main/resources/ff.png"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		// TODO Auto-generated method stub
//		Demo_Base.GetDriver();
//		Demo_Base.waitfor(1000);
//		Demo_Base DB = new Demo_Base();
//		DB.waitfor(1000);
//		driver.get("https://www.facebook.com/");
//		
//		
//		driver.findElement(By.partialLinkText("Create ne")).click();
//		WebElement pass = driver.findElement(By.id("passContainer"));
//
//		WebElement id = driver.findElement((By.id("email")));
//		
////		id.sendKeys("hello");
//		WebElement loginB = driver.findElement(RelativeLocator.with(By.name("login")).below(pass));
//	System.out.println(	loginB.getLocation());
//		loginB.click();
//		
//		
		
		

	}

	@Override
	public void sayMyName() {
		// TODO Auto-generated method stub

	}

}

interface a {
	void sayMyName();
}