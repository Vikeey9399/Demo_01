package testNG;

import org.testng.annotations.Test;
import myDump.BaseTestNG;


public class NG_0A extends BaseTestNG {

	@Test(groups={"smoke"},priority = 2,description = "This is A")
	private void A() {
		// TODO Auto-generated method stub
		printme("1");

	}
	@Test(groups = {"sanity","smoke","reg"},priority = 3 )
	private void B() {
		// TODO Auto-generated method stub
		printme("2");

	}
	@Test(groups = {"sanity"} ,priority = 1)
	private void C() {
		// TODO Auto-generated method stub
		printme("3");

	}
	
}
