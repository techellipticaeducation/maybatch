package module;

import org.openqa.selenium.WebDriver;

import pageobjects.LoginPageObject;

public class LoginModule {

	WebDriver driver;
	public LoginModule(WebDriver driver) {
		this.driver = driver;
	}
	
	
	public  void login( String username, String password) {
		driver.findElement(LoginPageObject.txt_username).sendKeys(username);	
		driver.findElement(LoginPageObject.txt_password).sendKeys(password);
		driver.findElement(LoginPageObject.btn_login).click();

	}
	
	public  String getErrorMsg() {
		String msg = driver.findElement(LoginPageObject.lbl_error).getText();
		return msg;
	}
	
	
	public  boolean verifyErrorMsg( String expectedErrorMsg) {
		String actualErrorMsg = getErrorMsg();
		return actualErrorMsg.equals(expectedErrorMsg);
	}
	
	public  boolean verifyInventoryURL() {
		return driver.getCurrentUrl().contains("inventory.html");
			
	}
	
	
//	placeorder
	// clickonPayment
	// addpaymentdetail
	// add address
	
}
