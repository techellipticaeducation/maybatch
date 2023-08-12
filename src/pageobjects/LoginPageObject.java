package pageobjects;

import org.openqa.selenium.By;

public class LoginPageObject {
	public static By txt_username = By.id("user-name");
	public static By txt_password = By.id("password");
	
	
	public static By btn_login = By.id("login-button");
	public static By lbl_error = By.xpath("//h3[@data-test='error']");
	
	
	
}
