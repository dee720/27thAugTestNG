package Inheritance_Automation;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class Rediff_login extends Parent_Automation {

	@Test
	public void rediffLoginCredentials() {
		driver.findElement(By.xpath("//input[@id ='login1']")).sendKeys("seleniumpanda@rediffmail.com");
		driver.findElement(By.xpath("//input[@id ='password']")).sendKeys("Selenium@123");
		driver.findElement(By.xpath("//input[@class = 'signinbtn']")).click();
		
	driver.quit();
	}
}
