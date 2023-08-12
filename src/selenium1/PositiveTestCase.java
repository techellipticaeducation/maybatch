package selenium1;


public class PositiveTestCase extends TestCaseBase{
	
	public static void main(String[] args) {
		PositiveTestCase case1 = new PositiveTestCase();
		case1.positive_scenario();
	}
	
	public void positive_scenario() {
		setupTestcase();
		login.login( "standard_user", "secret_sauce");
		String status = login.verifyInventoryURL()?"Pass":"Fail";
		System.out.println(status);
		closeBrowser();

	}

}
