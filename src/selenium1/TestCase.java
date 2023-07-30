package selenium1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestCase {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", 
			"C:\\Users\\Vaibhav\\git\\maybatch\\driver\\chrome\\115\\chromedriver.exe");
	
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	
	// Step 1
	driver.get("https://www.saucedemo.com/"); 
	
	
	// Locate web-element 
	// 8 locators
	
	// id 
	// name
	
	// id = 
	
	// SendKeys = to type
	// clear = clea r tha data
	// click = click 
	
	// ref
	
	// Step 2
	driver.findElement(By.id("user-name")).sendKeys("standard_user");	
	
	By ref2 = By.id("password");
	WebElement ref2Element = driver.findElement(ref2);
	ref2Element.sendKeys("secret_sauce");
	
	// Step 3
	By btn  =By.id("login-button");
	WebElement btnelem = driver.findElement(btn);
	btnelem.click();
	
	// Step 4
	System.out.println(driver.getCurrentUrl());
	if(driver.getCurrentUrl().contains("inventory.html")) {
		System.out.println("Pass");
	}else {
		System.out.println("Fail");
	}
	
	// XPath
	
	
}
}
