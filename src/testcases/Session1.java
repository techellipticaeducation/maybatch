package testcases;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Session1 {
	public static void main(String[] args) {
		// we have to configure webdriver service
		// webdriver.chrome.driver  - Chrome
		// webdriver.gecko.driver  - mozilla
		// webdriver.edge.driver - edge
		
		System.setProperty("webdriver.chrome.driver", 
				"C:\\Users\\Vaibhav\\git\\maybatch\\driver\\chrome\\115\\chromedriver.exe");
		
		
		
//		for(int i = 1 ; i < 3 ;i++) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
//		driver.manage().window().setSize(new Dimension(500, 500));
		driver.get("https://www.google.com");  // url open
		
		System.out.println(driver.getCurrentUrl());
		System.out.println(driver.getPageSource());
		System.out.println(driver.getTitle());
		
		driver.close(); // current tab
		driver.quit(); // complete session
//		}
		
		
	}
}
