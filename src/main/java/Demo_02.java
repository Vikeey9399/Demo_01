
import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.time.Duration;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Demo_02 {
	

	public static void main(String[] args) throws InterruptedException, AWTException {
		// TODO Auto-generated method stub
//		String downloadFilePath = "/home/apmosys/Documents/Study";
//		Map<String, Object> prefs = new HashMap<>();
//		prefs.put("download.default_directory", downloadFilePath);
//		prefs.put("download.prompt_for_download", false);
//		prefs.put("download.directory_upgrade", true);s
//
//	
//		ChromeOptions options = new ChromeOptions();
//		options.setExperimentalOption("prefs", prefs);
//

//		WebDriver driver = new ChromeDriver(options);
//		driver.manage().window().maximize();
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
//		driver.get("https://www.ilovepdf.com/powerpoint_to_pdf");
//		Thread.sleep(5000);
//		driver.findElement(By.id("pickfiles")).sendKeys("/home/apmosys/Documents/Study/SeleniumAndJava.pptx");
//		driver.findElement(By.id("pickfiles")).click();
//		StringSelection filePath = new StringSelection("/home/apmosys/Documents/Study/SeleniumAndJava.pptx");
//		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(filePath, null);
		WebDriver driver1 = new ChromeDriver();
	
		driver1.manage().window().maximize();
		driver1.get("https://www.google.com/");
		Robot robot = new Robot();
		robot.delay(1000);
		robot.keyPress(KeyEvent.VK_V);
		robot.keyRelease(KeyEvent.VK_V);
		robot.delay(1000);
		robot.keyPress(KeyEvent.VK_I);
		robot.keyRelease(KeyEvent.VK_I);
		robot.delay(1000);
		robot.keyPress(KeyEvent.VK_S);
		robot.keyRelease(KeyEvent.VK_S);
		robot.delay(1000);
		robot.keyPress(KeyEvent.VK_H);
		robot.keyRelease(KeyEvent.VK_H);
		robot.delay(1000);
		robot.keyPress(KeyEvent.VK_A);
		robot.keyRelease(KeyEvent.VK_A);
		robot.delay(1000);
		robot.keyPress(KeyEvent.VK_L);
		robot.keyRelease(KeyEvent.VK_L);
		robot.delay(1000);
		robot.mouseMove(200, 400);
		robot.delay(1000);
		robot.mousePress(KeyEvent.VK_CLEAR);

//		robot.keyPress(KeyEvent.VK_CONTROL);
//		robot.keyPress(KeyEvent.VK_V);
//		robot.keyRelease(KeyEvent.VK_V);
//		robot.keyRelease(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);

		Thread.sleep(15000);
		driver1.findElement(By.id("processTask")).click();
		Thread.sleep(5000);
		driver1.findElement(By.id("pickfiles")).click();

		Thread.sleep(15000);
//
//		driver.navigate().to("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
//		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("Admin");
//		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("admin123");
//		driver.findElement(By.xpath("//button[@type='submit']")).click();
//		Thread.sleep(1000);
//		driver.findElement(By.xpath("//span[text()='Admin']")).click();
//		driver.findElement(By.xpath("(//div[@class='oxd-select-text-input'])[1]")).click();
//		List<WebElement> ele = driver.findElements(By.xpath("//div[@role='option']"));
//
////    Thread.sleep(5000);
////    for(WebElement el:ele) {
////    System.out.println(	el.getText());
////    if(el.getText().contains("ESS")) {
////    	el.click();
////    	System.out.println("Click on ele");
////    }
////    }
//		String parent = driver.getWindowHandle();
//
//		driver.switchTo().newWindow(WindowType.TAB);
//		driver.get("https://mail.apmosys.com");
//		Thread.sleep(1000);
//		String child = driver.getWindowHandle();
//		System.out.println(driver.getTitle());
//		driver.findElement(By.xpath("//input[@type='email']")).sendKeys("hello");
//		driver.switchTo().window(parent);
//		System.out.println(driver.getTitle());

	}

}
