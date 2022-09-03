import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FacebookCreateAccount {
	public static WebDriver driver;
	public static Select select;
	@Test
	
	public void checkDOB() throws Exception{
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		driver.findElement(By.xpath("//a [//a [contains text() = 'Create new account']//ancestor:: div]")).click();
	
	driver.findElement(By.name("First name")).sendKeys("Deepa");
	driver.findElement(By.name("last name")).sendKeys("Sharma");
	driver.findElement(By.className("reg_email__")).sendKeys("deeps.rsharma@yahoo.in");
	driver.findElement(By.className("reg_email_confirmation__")).sendKeys("deeps.rsharma@yahoo.in");
	driver.findElement(By.id("password_step_input")).sendKeys("Connect@2022");
	
	select = new Select(driver.findElement(By.id("month")));
	select.selectByVisibleText("Jan");
	select = new Select(driver.findElement(By.id("day")));
	select.selectByVisibleText("1");
	select = new Select(driver.findElement(By.id("year")));
	driver.findElement(By.xpath("//label[contains(text(), 'Female']")).clear();
	driver.findElement(By.xpath("//button[@name = 'websubmit']")).click();
	
	
	
			driver.quit();
			
			
			
	

	}
	

}
