package actions;

import java.io.File;
import java.time.Duration;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import constant.ProjectConstant;

public class BrowserActions {

	public static void enterText(WebDriver driver, By elem, String textToEnter) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(elem));
		driver.findElement(elem).sendKeys(textToEnter);
		System.out.println("Logger - enterText event for " +elem);
		
	}
	
	public static void click(WebDriver driver, By elem) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(elem));
		driver.findElement(elem).click();
		System.out.println("Logger - Click event for " +elem);
	}
	
	public static void rightClick(WebDriver driver, By elm) {
		Actions action = new Actions(driver);
		WebElement elm1 = driver.findElement(elm);
		action.moveToElement(elm1).scrollByAmount(10, 10).contextClick(elm1).build().perform();
	}
	
	public static void takeScreenshot(WebDriver driver, String name) {
		try {
			Date dt = new Date();
			File file = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(file, new File(ProjectConstant.screenshotFolder+dt.getTime()+name+".png"));
			
		}catch(Exception e) {
			
		}
	}
	
	
	// id, name, xpath , tagname, classname, linktext , partial-linktext, cssselector
}
