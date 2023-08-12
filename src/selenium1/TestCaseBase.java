package selenium1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import module.LoginModule;

public class TestCaseBase {
	WebDriver driver = null;
	LoginModule login = null;
	public void setupTestcase() {
		System.setProperty("webdriver.chrome.driver", 
				"C:\\Users\\Vaibhav\\git\\maybatch\\driver\\chrome\\115\\chromedriver.exe");

		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.saucedemo.com/"); 
		login = new LoginModule(driver);
	}
	public void closeBrowser() {
		try {
		driver.close();
		}catch(Exception e) {
			
		}
	}
}
