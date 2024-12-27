import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Demo_Base {
	static WebDriver driver;
	
	public Demo_Base() {
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

	}
	
	public static WebDriver GetDriver() {
		// TODO Auto-generated method stub
		ChromeOptions options = new ChromeOptions();
		//options.addArguments("--no-proxy-server");
		//options.addArguments("--remote-debugging-port=9222");
		options.addArguments("--headless");
		driver = new ChromeDriver(options);
		 driver = new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		 return driver;
	}
	public static void waitfor(int n) {
		try {
			Thread.sleep(n);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
