import java.io.File;
import java.io.IOException;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.devtools.idealized.Javascript;
import org.openqa.selenium.interactions.Actions;

import lombok.val;

public class Demo_04 extends Demo_Base {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		GetDriver();
		driver.get("https://mf.nipponindiaim.com/knowledge-center/tools/step-up-sip-calculator");
		waitfor(5000);
	System.out.println(	driver.findElement(By.tagName("header")).getText());
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,500);");
		WebElement Slider = driver.findElement(By.xpath("(//div[@class=\"noUi-handle noUi-handle-lower\"])[1]"));
		waitfor(4000);
		Actions move = new Actions(driver);

		// Move the slider by an offset (e.g., 50 pixels to the right)
		move.clickAndHold(Slider).moveByOffset(-200, 0).release().perform();
		waitfor(4000);

		WebElement value = driver.findElement(By.xpath("(//div[@class=\"c_draggers_each--input\"])[1]/input"));

		// String myval = (String) js.executeScript("return arguments[0].value;",
		// value);
		String myval = value.getAttribute("value");
		System.out.println(myval);
		// System.out.println(myval);

		int i = 10;
		while (value.getAttribute("value") != "25000") {
			if(value.getAttribute("value").equals("25000")) {
				break;
			}
			move.clickAndHold(Slider).moveByOffset(i, 0).release().perform();
			System.out.println("the value is : " + value.getAttribute("value"));
			i += 1;
			// System.out.println(i);
			waitfor(1000);
		}

		
		
		
		 TakesScreenshot ss=(TakesScreenshot)driver;
	File src=	ss.getScreenshotAs(OutputType.FILE);
	File Des = new File("/home/apmosys/Desktop/bkp/eclipse-workspace/myDump/src/main/resources/ss.png");
	try {
		FileUtils.copyFile(src, Des);
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
		
		
		
		
		
		
		
		
		
		
		
		// (//div[@class="noUi-connects"])[1]
//		driver.get("https://www.amazon.in/");
//		List<WebElement> links = driver.findElements(By.tagName("a"));
//		System.out.println(links.size());
//		int i = 1;
//		for (WebElement link : links) {
//			String Text = link.getText();
//			System.out.println(i + " th text is :" + Text);
//			if (Text.contains("Customer Service")) {
//				link.click();
//				break;
//			}
//
//			i++;
//		}
//		driver.quit();

	}

}
