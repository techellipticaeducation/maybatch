package testcases;

import actions.BrowserActions;

public class PositiveTestCase extends TestCaseBase{
	
	public static void main(String[] args) {
		PositiveTestCase case1 = new PositiveTestCase();
		case1.positive_scenario();
	}
	
	public void positive_scenario() {
		setupTestcase();
		BrowserActions.takeScreenshot(driver,"loginscreen0");
		login.login( "standard_user", "secret_sauce");
		BrowserActions.takeScreenshot(driver,"loginscreen1");
		String status = login.verifyInventoryURL()?"Pass":"Fail";
		System.out.println(status);
		closeBrowser();
	}

}
