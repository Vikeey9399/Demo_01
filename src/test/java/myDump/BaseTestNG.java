package myDump;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Date;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;

public class BaseTestNG {
	static WebDriver driver;
	static WebDriverWait wait;
	private static Properties properties;

	@Parameters("browser")
//	@BeforeMethod(groups = { "SmokeTest", "sanity" })
	public  void Setup(String browser) {
		// TODO Auto-generated method stub

		try {
			if (browser.equalsIgnoreCase("chrome")) {
				driver = new ChromeDriver();
			}
			if (browser.equalsIgnoreCase("firefox")) {
				driver = new FirefoxDriver();
			} else {
				System.out.println("driver is null");
			}
		} catch (Exception e) {
			printme(e + "this is excepthion from setup");
			e.printStackTrace();
		}
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		wait = new WebDriverWait(driver, Duration.ofSeconds(20));

	}

//	@AfterMethod(groups = { "SmokeTest", "sanity" })
	public void tearDown() {
		// TODO Auto-generated method stub

		driver.close();
		printme("this is tear down");
	}

	public static void LaunchBrowserWithUrl(String URL) {
		driver.get(URL);
	}

	public static void Clickme(By by) {
		driver.findElement(by).click();
	}

	public static void SendKeys(By by, String value) {
		driver.findElement(by).sendKeys(value);
	}

	public static String GetTextOfElement(By by) {
		return driver.findElement(by).getText();
	}

	public static String ReadConfigFile(String key) {

		properties = new Properties();
		try {
			FileInputStream fileInputStream = new FileInputStream("src/main/resources/myProp.properties");
			properties.load(fileInputStream);
		} catch (IOException e) {
			e.printStackTrace();
		}
		return properties.getProperty(key);
	}

	public static boolean VerifythePreseseOfElement(By by) {
		try {
			wait.until(ExpectedConditions.visibilityOfElementLocated(by));
			if (driver.findElement(by).isDisplayed()) {
				return true;
			}

		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("catch of VerifythePreseseOfElement ");
		}
		return false;
	}

	public static void WaitforElememt(By by) {
		try {
			wait.until(ExpectedConditions.elementToBeClickable(by));
		} catch (Exception e) {

			System.out.println("waited for element");
			e.printStackTrace();
		}

	}

	public static String dateAndTime() {
		Date date = new Date();
		String currentdate1 = date.toString();
		String date1 = currentdate1.replaceAll(" ", "_");
		String currentDate = date1.replaceAll(":", "_");
		return currentDate;

	}

	public static void printme(Object val) {

		System.out.println(val);
	}
}
