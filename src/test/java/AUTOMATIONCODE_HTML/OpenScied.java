package AUTOMATIONCODE_HTML;

import java.sql.Driver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class OpenScied {
	
	public static WebDriver driver;
    
	public static void main(String[] args) {
	WebDriverManager.chromedriver().setup();
	driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.openscied.org/login/?redirect_to=https%3A%2F%2Fwww.openscied.org");
		driver.findElement(By.name("username-2263")).sendKeys("deeps.rsharma@yahoo.in");
		driver.findElement(By.id("user_password-2263")).sendKeys("");
		driver.findElement(By.className("class=\"um-button\"")).click();
	
		driver.findElement(By.className("item_title")).click();
		
		//driver.findElement(By.xpath(null)).click();

	driver.quit();
	
	
	}

}
