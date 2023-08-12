package selenium1;

public class NegativeTestCase extends TestCaseBase{

	public static void main(String[] args) {
	NegativeTestCase tests = new NegativeTestCase();
	tests.test_verify_no_username_error_msg();
	tests.test_verify_no_password_error_msg();
	tests.test_verify_invalid_credentials_error_msg();
	tests.test_verify_valid_username_invalid_password_error_msg();
	}
	
	public void test_verify_no_username_error_msg() {
		
		setupTestcase();
		login.login( "", "");
		String status = login.verifyErrorMsg("Epic sadface: Username is required") ? "Pass":"Fail";
		System.out.println(status);
		closeBrowser();
	}
	
	public void test_verify_no_password_error_msg() {
		setupTestcase();
		login.login( "asdfadfasdfasd", "");
		String status = login.verifyErrorMsg("Epic sadface: Password is required") ? "Pass":"Fail";
		System.out.println(status);
		closeBrowser();
	}
	
	public void test_verify_invalid_credentials_error_msg() {
		setupTestcase();
		login.login( "asdfasdf", "adsfadsfdas");
		String status = login.verifyErrorMsg("Epic sadface: Username and password do not match any user in this service") ? "Pass":"Fail";
		System.out.println(status);
		closeBrowser();
	}
	
	public void test_verify_valid_username_invalid_password_error_msg() {
		setupTestcase();
		login.login("standard_user", "adsfadsfdas");
		String status = login.verifyErrorMsg("Epic sadface: Username and password do not match any user in this service") ? "Pass":"Fail";
		System.out.println(status);
		closeBrowser();
	}
}
