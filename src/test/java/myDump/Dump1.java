package myDump;

import java.awt.Desktop;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.net.URI;
import java.time.Duration;
import java.util.ArrayList;
import java.util.Base64;
import java.util.Date;
import java.util.Properties;

import javax.swing.JDialog;
import javax.swing.JOptionPane;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

import trash.FillEOD;

public class Dump1 {

	protected static WebDriver driver;
	static WebDriverWait wait;
	protected static ExtentTest test1;
	private static Properties properties;
	public static ExtentReports extend;

	public static void main(String[] args) throws InterruptedException {

		Setup();
		test1 = extendReportHTMLReport().createTest("TC_Ragistration_Positive_Flow",
				"To check the positive flow and validate the success massage");
		try {
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
			WaitFor2Secound();
			SendKeys(By.xpath("//input[@name='username']"), UserID);
			WaitFor2Secound();
			SendKeys(By.xpath("//input[@name='password']"), Userpass);
			WaitFor2Secound();
			Clickme(By.xpath("//button[@type='submit']"));
			WaitFor2Secound();
			System.out.println(VerifythePreseseOfElement(By.xpath("//p[@class='oxd-text oxd-text--p'][1]")));
			WaitFor2Secound();
			ScrollDown();
//		ScrollDowntillElement(By.xpath("(//p[@class='oxd-text oxd-text--p'])[9]"));
			WaitFor2Secound();
			WaitforElememt(By.xpath("(//p[@class='oxd-text oxd-text--p'])[9]"));
			String Randomtext = GetTextOfElement(By.xpath("(//p[@class='oxd-text oxd-text--p'])[9]"));
			System.out.println(Randomtext);
		} catch (Exception e) {
			e.printStackTrace();
		}
		OpennewTab();
		NavigateToUrl("https://ishine.apmosys.com/#/login");
//		SendKeys(By.xpath("//input[@id='username' and @placeholder='Enter Username'] "), ReadConfigFile("mailID"));
		SendKeys(By.xpath("//input[@id='username' and @placeholder='Enter Username'] "), "vishal.gholap@apmosys.com");
//		SendKeys(By.xpath("//input[@id='userPassword' and @placeholder='Enter Password'] "),
//				ReadConfigFile("ishinepass"));
		SendKeys(By.xpath("//input[@id='userPassword' and @placeholder='Enter Password'] "),"Vishal@12345");
		Clickme(By.xpath("//button[text()='SIGN IN']"));
		WaitFor2Secound();
		WaitFor2Secound();
		
		OpennewTab();

		NavigateToUrl("https://mail.apmosys.com/webmail/");
//		SendKeys(By.xpath("//input[@name='email-address']"), ReadConfigFile("mailID"));
		SendKeys(By.xpath("//input[@name='email-address']"),"vishal.gholap@apmosys.com" );
		Clickme(By.xpath("//button[@name='next']"));
//		SendKeys(By.xpath("//input[@name='password']"), ReadConfigFile("mailPass"));
		SendKeys(By.xpath("//input[@name='password']"), "1Wtogo");
		Clickme(By.xpath("//button[@name='next']"));
		System.out.println(VerifythePreseseOfElement(By.xpath("//div[@class='ico root_private']/b")));
		WaitforElememt(By.xpath("//div[@class='ico root_private']/b"));
		VsibilityonstaleElement(By.xpath("//div[@class='ico root_private']/b"));
//		String ProfileName = GetTextOfElement(By.xpath("//div[@class='ico root_private']/b"));
//		System.out.println(ProfileName);

		Switchtoframe("gui.frm_main.main.mailview#frame");
		VerifythePreseseOfElement(By.xpath("//body[@id='iw_webmail_msg_body']"));
		String Mailbody = GetTextOfElement(By.xpath("//body[@id='iw_webmail_msg_body']"));
		System.out.println(Mailbody);
		String OTP = Mailbody.substring(21, 27);
		System.out.println(OTP);

		Switchtotabs(1);

		SendKeys(By.xpath("//input[@placeholder='Enter OTP']"), OTP);
		Clickme(By.xpath("//button[@type='submit' and @class='btn btn-primary btn-block otp__btn']"));
		
		if (VerifythePreseseOfElement(By.xpath("//h4[text()='Ishine Portal Release Note']"))) {
			test1.pass("The login into ishine poetal is successful");
			test1.log(Status.INFO, "The Ishine Login Flow").addScreenCaptureFromBase64String(Base_64());
		} else {
			test1.fail("The login into ishine poetal is Failed");
			test1.log(Status.INFO, "The Ishine Login Flow").addScreenCaptureFromBase64String(Base_64());
		}
		ScrollDowntillElement(By.xpath("//p[text()='Apply Timesheet']"));
		Clickme(By.xpath("//p[text()='Apply Timesheet']"));
		System.out.println("outside EOD");

		try {

			for (int i = 0; i <= 20; i++) {
				FillEOD.EOD();
			}
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("The EOD loop end ");
		}
		WaitFor2Secound();
		Clickme(By.xpath("//li[@title='Home']"));
		ScrollDowntillElement(By.xpath("//li/a[text()='EOD This Month']"));
		Clickme(By.xpath("//li/a[text()='EOD This Month']"));
		
		

//		TearDown();
	}

	public static void Setup() {
//		String browser = ReadConfigFile("Browser");
		String browser = "chrome";
		if (browser != null && !browser.isEmpty()) {
			if (browser.equalsIgnoreCase("chrome")) {
				driver = new ChromeDriver();
			} else if (browser.equalsIgnoreCase("firefox")) {
				driver = new FirefoxDriver();
			} else if (browser.equalsIgnoreCase("edge")) {
				driver = new EdgeDriver();
			} else {
				throw new IllegalArgumentException("Unsupported browser: " + browser);
			}

			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
			wait = new WebDriverWait(driver, Duration.ofSeconds(20));
			driver.manage().window().maximize();
		} else {
			throw new IllegalArgumentException("Browser type must be specified in the config file.");
		}
//		 test1 = extendReportHTMLReport().createTest(TestTitle, testDescrpction);

	}

	public static void LaunchBrowserWithUrl(String URL) {
		driver.get(URL);
	}

	public static void Clickme(By by) {
		highlightElement(driver, by);
		driver.findElement(by).click();
		
	}

	public static void SendKeys(By by, String value) {
		driver.findElement(by).clear();
		highlightElement(driver, by);
		driver.findElement(by).sendKeys(value);
		
	}

	public static String GetTextOfElement(By by) {
		highlightElement(driver, by);
		return driver.findElement(by).getText();
	}

	public static void TearDown() {
		extend.flush();
		OpenReport();
		driver.close();
		driver.quit();

	}

	public static boolean VerifythePreseseOfElement(By by) {
		try {
			wait.until(ExpectedConditions.visibilityOfElementLocated(by));
			highlightElement(driver, by);
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
			highlightElement(driver, by);
		} catch (Exception e) {

			System.out.println("waited for element");
			e.printStackTrace();
		}

	}

	public static void ScrollDowntillElement(By by) {

		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", driver.findElement(by));

	}

	public static void SendleysJavaScript(By by, String text) {

		((JavascriptExecutor) driver).executeScript("arguments[0].value ='" + text + "';", driver.findElement(by));
	}

	public static void ScrollDown() {

		((JavascriptExecutor) driver).executeScript("window.scrollBy(0, 1000);");

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

	public static void MoveOverCurser(By by) {

		WebElement search = driver.findElement(by);
		Actions actions = new Actions(driver);
		actions.moveToElement(search).click().perform();
	}

	public static void DownArrow() {

		Actions actions = new Actions(driver);
		actions.sendKeys(Keys.ARROW_DOWN).perform();

	}

	public static void TabKey() {

		Actions actions = new Actions(driver);
		actions.sendKeys(Keys.TAB).perform();

	}

	public static void SelctByIndex(By by, int index) {
		WebElement search = driver.findElement(by);
		Select sl = new Select(search);
		sl.selectByIndex(index);
	}

	public static void SelctByText(By by, String Text) {
		WebElement search = driver.findElement(by);
		Select sl = new Select(search);
		sl.selectByVisibleText(Text);
	}

	public static String dateAndTime() {
		Date date = new Date();
		String currentdate1 = date.toString();
		String date1 = currentdate1.replaceAll(" ", "_");
		String currentDate = date1.replaceAll(":", "_");
		return currentDate;

	}

	public static String inputBox() {
		final JDialog dialog = new JDialog();
		dialog.setAlwaysOnTop(true);
		String otp = JOptionPane.showInputDialog(dialog, "Please enter your Value", "Enter Value",
				JOptionPane.INFORMATION_MESSAGE);
		System.out.println(otp);
		dialog.dispose();
		return otp;

	}

	public static boolean ValidateAndTakeScreenshot(By by) throws TimeoutException {

		try {
			WebElement until = wait.until(ExpectedConditions.visibilityOfElementLocated(by));
			if (until.isDisplayed()) {
				return true;
			} else {
				System.out.println("Validation Failed");
				getScreenShot();
				return false;
			}
		} catch (Exception e) {
			e.printStackTrace();
			getScreenShot();
			return false;
		}

	}

	public static String getScreenShot() {

		TakesScreenshot Screenshot = (TakesScreenshot) driver;
		String base64SS = Screenshot.getScreenshotAs(OutputType.BASE64);
		byte[] decodedBytes = Base64.getDecoder().decode(base64SS);

		// Specify the destination file path
		String filePath = System.getProperty("user.dir") + "//ScreenShot//" + dateAndTime() + "screenshot.png";

		// Write the byte array to a file
		try (FileOutputStream fos = new FileOutputStream(filePath)) {
			fos.write(decodedBytes);
			// System.out.println("Screenshot saved successfully at " + filePath);
		} catch (FileNotFoundException e) {

			e.printStackTrace();
		} catch (IOException e) {

			e.printStackTrace();
		}
		return filePath;

	}

	public static ExtentReports extendReportHTMLReport() {

		ExtentSparkReporter sparkreport = new ExtentSparkReporter("myrep.html");
		sparkreport.config().setDocumentTitle("Automation Test Report");
		sparkreport.config().setReportName("Functional Test Report");
		sparkreport.config().setTheme(Theme.DARK);
		sparkreport.config().getReporter();

		extend = new ExtentReports();
		extend.setSystemInfo("Tester", "Vishal");
		extend.setSystemInfo("Automation Type ", "Web-Automation");

//		ExtentReports extend = new ExtentReports();
		extend.attachReporter(sparkreport);
		return extend;

	}

	public static String Base_64() {

		TakesScreenshot screenshot = (TakesScreenshot) driver;
		String base64SS = screenshot.getScreenshotAs(OutputType.BASE64);
		return base64SS;

	}

	public static void OpenReport() {

		String path = System.getProperty("user.dir") + "/myrep.html";
		File htmlfile = new File(path);
		try {
			Desktop.getDesktop().browse(htmlfile.toURI());
		} catch (IOException e) {

			e.printStackTrace();
		}
	}

	public static void clickonstaleElement(By by) {

		try {
			wait.until(ExpectedConditions.refreshed(ExpectedConditions.visibilityOfElementLocated(by)));
			Clickme(by);

		} catch (StaleElementReferenceException e) {
			driver.navigate().refresh();
			Clickme(by);
		}

	}
	public static void VsibilityonstaleElement(By by) {

		try {
			wait.until(ExpectedConditions.refreshed(ExpectedConditions.visibilityOfElementLocated(by)));
			

		} catch (StaleElementReferenceException e) {
			driver.navigate().refresh();
			
		}

	}

	public static void WaitFor2Secound() {

		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
    public static void highlightElement(WebDriver driver,  By by) {
    	WebElement ele = driver.findElement(by);
        JavascriptExecutor js = (JavascriptExecutor) driver;
        // Change the style of the element to highlight it (e.g., yellow background with a red border)
        js.executeScript("arguments[0].style.border='3px solid red'", ele);
        js.executeScript("arguments[0].style.backgroundColor='yellow'", ele);

        // Optional: Add a sleep to keep the highlight visible for a few seconds
        try {
            Thread.sleep(1000); // Pause for 2 seconds
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // Reset the element's style back to its original state
        js.executeScript("arguments[0].style.border=''", ele);
        js.executeScript("arguments[0].style.backgroundColor=''", ele);
    }
}


