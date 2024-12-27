package testNG;

import org.testng.annotations.Test;
import myDump.BaseTestNG;

public class NG_0X extends BaseTestNG {


	@Test(groups = {"smoke"},priority = 2,invocationCount = 2 )
	private void X() {
		// TODO Auto-generated method stub
		printme("4");

	}
	@Test(groups = {"sanity","smoke","reg"} ,priority = 3 , invocationCount = 3)
	private void Y() {
		// TODO Auto-generated method stub
		printme("5");

	}
	@Test(groups = {"sanity"} ,priority = 1,invocationCount = 1)
	private void Z() {
		// TODO Auto-generated method stub
		printme("6");

	}
	


}
