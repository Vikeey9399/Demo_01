import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Set;

public class Demo11 {
	public static void main(String[] args) throws InterruptedException {

	 RemoteWebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		driver.get("https://www.flipkart.com/");
		driver.findElement(By.xpath("//div[text()='Best-selling Earphones']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id=\"container\"]/div/div[3]/div/div[2]/div[2]/div/div[1]/div/a[2]")).click();
		driver.findElement(
				By.xpath("//*[@id=\"container\"]/div/div[3]/div/div[2]/div[2]/div/div[2]/div/a[1]/div[1]/div/div/img"))
				.click();
		driver.findElement(
				By.xpath("//*[@id=\"cd`\"]/div/div[3]/div/div[2]/div[2]/div/div[3]/div/a[1]/div[1]/div/div/img"))
				.click();

		ArrayList<String> a = new ArrayList<String>(driver.getWindowHandles());
		
		driver.switchTo().window(a.get(1));
		String childTitle1 = driver.getTitle();
		System.out.println("First product :::::" + childTitle1);
		String text1 = driver.findElement(By.xpath("//div[@class='Nx9bqj CxhGGd']")).getText();
		System.out.println(text1);

	

		driver.switchTo().window(a.get(2));
		System.out.println("secound product ::::" + driver.getTitle());
		String text2 = driver.findElement(By.xpath("//div[@class='Nx9bqj CxhGGd']")).getText();
		System.out.println(text2);
		

		driver.switchTo().window(a.get(3));
		System.out.println("Third product ::::" + driver.getTitle());
		String text3 = driver.findElement(By.xpath("//div[@class='Nx9bqj CxhGGd']")).getText();
		System.out.println(text3);
		driver.quit();

	}

}
