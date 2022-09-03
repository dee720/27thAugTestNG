package TestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Parameterization4 extends Parametrization1{

	@Test
    public void clickonsignin() {
    	driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
    	driver.findElement(By.className("signin")).click();
    	System.out.println("The title of the login page is:" + driver.getTitle() );
    	
    }
 
		
		
		
		
}

