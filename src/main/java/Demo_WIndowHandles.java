import java.util.ArrayList;

import org.openqa.selenium.WindowType;

public class Demo_WIndowHandles extends Demo_Base {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GetDriver();
		driver.get("https://mail.apmosys.com/webmail/");
		driver.switchTo().newWindow(WindowType.TAB);
		driver.get("https://www.browserstack.com/guide/drag-and-drop-in-selenium");
		driver.switchTo().newWindow(WindowType.TAB);
		driver.get("https://the-internet.herokuapp.com/drag_and_drop");
		
		driver.getWindowHandles();
		ArrayList<String> tab = new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(tab.get(0));
		System.out.println("the first tab "+driver.getTitle());
		driver.switchTo().window(tab.get(1));
		System.out.println("the Secound tab "+driver.getTitle());
		driver.switchTo().window(tab.get(2));
		System.out.println("the third tab "+driver.getTitle());
		//driver.close();
		
		

	}

}
