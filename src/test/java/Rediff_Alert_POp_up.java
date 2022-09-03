import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Rediff_Alert_POp_up {
    
	public static WebDriver driver;
    
	public static void main(String[] args) {
	WebDriverManager.chromedriver().setup();
	driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
	driver.findElement(By.name("proceed")).click();
	
	Alert alert = driver.switchTo().alert();  // for pop removal need to use alert reference
	String textofTheAlert = alert.getText(); // alert is text,  so use string
	System.out.println(textofTheAlert);
	
	alert.accept(); // coz ok, or alert.dismiss() for cancel button
	driver.findElement(By.xpath("//input [@id = 'login1']")).sendKeys("seleniumpanda@rediffmail.com");
	driver.findElement(By.xpath("//input [@id = 'password']")).sendKeys("Selenium@123");
	driver.findElement(By.xpath("//input [@class = 'signinbtn']")).click();
	
	

  driver.quit();
	}

}
