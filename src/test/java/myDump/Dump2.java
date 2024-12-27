package myDump;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Dump2 {

	static WebDriver driver;
	static WebDriverWait wait;
	private static Properties properties;

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		Setup();
		LaunchBrowserWithUrl("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		String IntialUserid = GetTextOfElement(By.xpath("//p[@class='oxd-text oxd-text--p'][1]"));
		System.out.println(IntialUserid);
		String UserID = IntialUserid.substring(11, 16);
		System.out.println(UserID);
		String IntialUserPass = GetTextOfElement(By.xpath("//p[@class='oxd-text oxd-text--p'][2]"));
		System.out.println(IntialUserPass);
		String Userpass = IntialUserPass.substring(11, 19);
		System.out.println(Userpass);
		Clickme(By.xpath("//input[@name='username']"));
		Thread.sleep(2000);
		SendKeys(By.xpath("//input[@name='username']"), UserID);
		SendKeys(By.xpath("//input[@name='password']"), Userpass);
		Clickme(By.xpath("//button[@type='submit']"));
		System.out.println(VerifythePreseseOfElement(By.xpath("//p[@class='oxd-text oxd-text--p'][1]")));
		ScrollDown();
		WaitforElememt(By.xpath("(//p[@class='oxd-text oxd-text--p'])[9]"));
		String Randomtext = GetTextOfElement(By.xpath("(//p[@class='oxd-text oxd-text--p'])[9]"));
		System.out.println(Randomtext);
		Clickme(By.xpath("//span[text()='Admin']"));
		Thread.sleep(2000);

		WaitforElememt(By.xpath("//li[@class='oxd-main-menu-item-wrapper']"));
//		List<WebElement> HamOption = driver.findElements(By.xpath("//li[@class='oxd-main-menu-item-wrapper']"));

		List<WebElement> HamOption = driver.findElements(By.xpath("//li[@class='oxd-main-menu-item-wrapper']//a/span"));

		System.out.println(HamOption.size());
		for (int i = 1; i <= HamOption.size(); i++) {
			driver.navigate().refresh();
			Thread.sleep(1000);
			ClickmeWebEle(
					driver.findElement(By.xpath("(//li[@class='oxd-main-menu-item-wrapper']//a/span)[" + i + "]")));

			String pagename = GetTextOfElement(By.xpath("//div[@class='oxd-topbar-header-title']"));
			System.out.println(pagename);
		}

		ScrollDown();
		WaitforElememt(By.xpath("//div[@class='oxd-table-card-cell-checkbox']"));
		List<WebElement> checkBox = driver.findElements(By.xpath("//div[@class='oxd-table-card-cell-checkbox']"));
		for (int i = 0; i <= checkBox.size() - 1; i++) {
			ClickmeWebEle(checkBox.get(i));
		}
		ScrollUp();
		Clickme(By.xpath(
				"//button[@type='button' and @class='oxd-button oxd-button--medium oxd-button--label-danger orangehrm-horizontal-margin']"));
		Clickme(By.xpath(
				"//button[@type='button' and @class='oxd-button oxd-button--medium oxd-button--ghost orangehrm-button-margin']"));

//		OpennewTab();
//		
//		NavigateToUrl("https://mail.apmosys.com/webmail/");
//		SendKeys(By.xpath("//input[@name='email-address']"), ReadConfigFile("mailID"));
//		Clickme(By.xpath("//button[@name='next']"));
//		SendKeys(By.xpath("//input[@name='password']"), ReadConfigFile("mailPass"));
//		Clickme(By.xpath("//button[@name='next']"));
//		System.out.println(VerifythePreseseOfElement(By.xpath("//div[@class='ico root_private']/b")));
//		WaitforElememt(By.xpath("//div[@class='ico root_private']/b"));
//		String ProfileName = GetTextOfElement(By.xpath("//div[@class='ico root_private']/b"));
//		System.out.println(ProfileName);
//
//		Switchtoframe("gui.frm_main.main.mailview#frame");
//		VerifythePreseseOfElement(By.xpath("//body[@id='iw_webmail_msg_body']"));
//		String Mailbody = GetTextOfElement(By.xpath("//body[@id='iw_webmail_msg_body']"));
//		System.out.println(Mailbody);
//		
//
//		Switchtotabs(1);

		TearDown();
	}

	public static void Setup() {
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		wait = new WebDriverWait(driver, Duration.ofSeconds(20));
		driver.manage().window().maximize();

	}

	public static void LaunchBrowserWithUrl(String URL) {
		driver.get(URL);
	}

	public static void Clickme(By by) {
		driver.findElement(by).click();
	}

	public static void ClickmeWebEle(WebElement ele) {
		ele.click();

	}

	public static void SendKeys(By by, String value) {
		driver.findElement(by).sendKeys(value);
	}

	public static String GetTextOfElement(By by) {
		return driver.findElement(by).getText();
	}

	public static void TearDown() {
//		driver.close();
//		driver.quit();
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

	public static void NavigateToUrl(String URL) {
		driver.navigate().to(URL);
	}

	public static void WaitforElememt(By by) {
		try {
			wait.until(ExpectedConditions.elementToBeClickable(by));
		} catch (Exception e) {

			System.out.println("waited for element");
			e.printStackTrace();
		}

	}

	public static void ScrollDowntillElement(By ele) {

		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", ele);

	}

	public static void SendleysJavaScript(By by, String text) {

		((JavascriptExecutor) driver).executeScript("arguments[0].value ='" + text + "';", driver.findElement(by));
	}

	public static void ScrollDown() {

		((JavascriptExecutor) driver).executeScript("window.scrollBy(0, 1000);");

	}

	public static void ScrollUp() {

		((JavascriptExecutor) driver).executeScript("window.scrollBy(600, 0);");

	}

	public static void Switchtoframe(String ID) {

		driver.switchTo().frame(ID);
	}

	public static void OpennewTab() {
		driver.switchTo().newWindow(WindowType.TAB);
	}

	public static void Switchtotabs(int Index) {
		ArrayList<String> tabs = new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(tabs.get(Index));

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

}
