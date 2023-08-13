package testcases;

import java.time.Duration;

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
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		// Hard Code -> Thread.sleep 
		// implicitWait -> 30 Sec max , no such element found
		driver.get("https://www.saucedemo.com/"); 
		login = new LoginModule(driver);
		
		// Explicit Wait -> conditional wait , element per apply
		
		// 3 types 
		// Implicit wait - Global wait (10 sec)
		// 
	}
	public void closeBrowser() {
		try {
		driver.close();
		}catch(Exception e) {
			
		}
	}
}
