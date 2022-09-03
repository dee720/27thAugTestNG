package AUTOMATIONCODE_HTML;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class OpenScied1 {
	
	public static WebDriver driver;
	

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.openscied.org/login/?redirect_to=https%3A%2F%2Fwww.openscied.org");
		driver.findElement(By.id("username-2263")).sendKeys("deeps.rsharma@yahoo.in");
		driver.findElement(By.id("user_password-2263")).sendKeys("Shopping@123");
		driver.findElement(By.id("um-submit-btn")).click();
		driver.quit();
		
		

	}

}
