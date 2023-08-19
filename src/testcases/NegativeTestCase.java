package testcases;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class NegativeTestCase extends TestCaseBase{
	
	@Before
	public void setup() {
		setupTestcase();
	}
	
	@After
	public void teardown() {
		closeBrowser();
	}
	
	@Test
	public void _1_test_verify_no_username_error_msg() {
		login.login( "", "");
		// Assertion - help test framework to find out that expected is same as actual 
		Assert.assertTrue("Error msg is not correct as per expected in case no username provided",
				login.verifyErrorMsg("Epic sadface: Username is required"));
	}
	
	@Test
	public void _2_test_verify_no_password_error_msg() {
		login.login( "asdfadfasdfasd", "");
		Assert.assertTrue(login.verifyErrorMsg("Epic sadface: Password is required"));		
	}
	
	@Test
	public void _3_test_verify_invalid_credentials_error_msg() {
		login.login( "asdfasdf", "adsfadsfdas");
		Assert.assertTrue(login.verifyErrorMsg
				("Epic sadface: Username and password do not match any user in this service"));
	}
	
	@Test
	public void _4_test_verify_valid_username_invalid_password_error_msg() {
		login.login("standard_user", "adsfadsfdas");
		Assert.assertTrue(login.verifyErrorMsg
				("Epic sadface: Username and password do not match any user in this service"));
	}
}
