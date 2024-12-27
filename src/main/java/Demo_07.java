import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Demo_07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		String BrowserType = System.getProperty("browser","firefox");
		WebDriver driver = WebDriverInIT("firefox");
		driver.get("https://mail.apmosys.com/webmail/");
	System.out.println(	driver.getTitle());
		
		
		

	}

	public static WebDriver WebDriverInIT(String BrowserType) {
		WebDriver driver = null;
		try {
			if(BrowserType.equalsIgnoreCase("chrome")) {
				driver = new ChromeDriver();
			}
			if(BrowserType.equalsIgnoreCase("Edge")) {
				driver = new EdgeDriver();
			}
			if(BrowserType.equalsIgnoreCase("Firefox")) {
				driver = new FirefoxDriver();
			}else {
				throw new IllegalArgumentException("Unknown browser type: " + BrowserType);
			}
			
		}
		catch (Exception e) {
			e.printStackTrace();
			System.out.println("WebDriverInIT Catch");
			
		}
		
		return driver;
	}

}
