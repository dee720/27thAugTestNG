package TestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Parameterization3 extends Parametrization1{


	@Test
    public void clickonsignin() {
    	driver.get("https://www.facebook.com/");
    	driver.findElement(By.xpath("//div[@id='reg_pages_msg']/preceding:: a[1]")).click();
    	System.out.println("The title of the login page is:" + driver.getTitle() );
    	
    }
 
		
		
		
}

