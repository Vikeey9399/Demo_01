import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class Demo_ActionsClass extends Demo_Base {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GetDriver();
//		driver.get("https://www.amazon.in/");
		driver.get("https://the-internet.herokuapp.com/drag_and_drop");
		Actions action= new Actions(driver);
		WebElement a =driver.findElement(By.id("column-a"));
		WebElement b =driver.findElement(By.id("column-b"));
//		WebElement Amezon =driver.findElement(By.xpath("//span[@class='icp-nav-link-inner']"));
		
		System.out.println("Brefore actions");
		System.out.println(a.getText());
		System.out.println(b.getText());
		
		waitfor(1000);
//		action.moveToElement(Amezon).build().perform();
		waitfor(1000);
		action.dragAndDrop(b, a).build().perform();
		System.out.println("After Drog and drop actions");
		waitfor(1000);
		System.out.println(a.getText());
		System.out.println(b.getText());
		waitfor(2000);
		action.clickAndHold(a).moveToElement(b).release().build().perform();
		System.out.println("After movetoelement actions");
		System.out.println(a.getText());
		System.out.println(b.getText());
		
		
		driver.get("https://mail.apmosys.com/webmail/");
		WebElement button =driver.findElement(By.xpath("//button[@name='next']"));
		WebElement LAN =driver.findElement(By.xpath("//label[@class='o-dropdown__text']"));
		
		action.moveToElement(button).build().perform();
		action.click(LAN).build().perform();
		//driver.navigate().refresh();
		WebElement hindi =driver.findElement(By.xpath("//li[text()='हिन्दी']"));
		waitfor(1000);
		action.click(hindi).build().perform();
		waitfor(2000);
		
		action.sendKeys(Keys.NUMPAD6).build().perform();
		
		waitfor(2000);
		
				

		
		
		
	}

}
