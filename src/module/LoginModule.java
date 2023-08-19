package module;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import actions.BrowserActions;
import pageobjects.LoginPageObject;

public class LoginModule {

	WebDriver driver;
	public LoginModule(WebDriver driver) {
		this.driver = driver;
	}
	
	
	public  void login( String username, String password) {
		// Explicit Wait
		BrowserActions.enterText(driver, LoginPageObject.txt_username, username);
		//BrowserActions.rightClick(driver, LoginPageObject.txt_username);
		BrowserActions.enterText(driver, LoginPageObject.txt_password, username);
		BrowserActions.click(driver, LoginPageObject.btn_login);

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
