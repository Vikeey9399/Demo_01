import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Demo_BrokenLinks extends Demo_Base {
	static String a;
	static HttpURLConnection httpURLConnection;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GetDriver();

		driver.get("http://www.zlti.com");
		List<WebElement> link = driver.findElements(By.tagName("a"));
		System.out.println(link.size());
		for (WebElement l : link) {
			waitfor(1000);
			// System.out.println("This is link"+l.getAttribute("href"));
			String a = l.getAttribute("href");
			check(a);

		}

	}

	public static void check(String a) {
		try {
			URL link = new URL(a);
			 httpURLConnection = (HttpURLConnection) link.openConnection();
			httpURLConnection.setConnectTimeout(3000); // Set connection timeout to 3 seconds
			httpURLConnection.connect();

			if (httpURLConnection.getResponseCode() == 200) {
				System.out.println(a + " - " + httpURLConnection.getResponseMessage());
			} else {
				System.out.println(a + " - " + httpURLConnection.getResponseMessage() + " - " + "is a broken link"+httpURLConnection.getResponseCode());
			}
		} catch (Exception e) {
			try {
				System.out.println(a + " - " + "is a broken link"+httpURLConnection.getResponseCode());
			} catch (IOException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		}
	}

}
