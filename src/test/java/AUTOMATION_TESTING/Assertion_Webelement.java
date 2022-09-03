package AUTOMATION_TESTING;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Assertion_Webelement {

	public static WebDriver driver;
	
	@BeforeTest
	
	public void launchBrowser() {
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://www.rediff.com/");
	}
			
			@Test
			
			public void loginCredentials() {
		System.out.println("Title of the page is:" + driver.getTitle());
		System.out.println("current url of the page is" + driver.getCurrentUrl());
		
		Assert.assertNotEquals(driver.getTitle(), driver.getCurrentUrl());
		
		Assert.assertNotEquals(driver.getTitle(), driver.getCurrentUrl());
			}
			{
		
	
	
	
	}
	
	
	
	

}
