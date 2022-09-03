package Homework_July25th;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CssSelectors_HW_3 {
    public static WebDriver Driver;
	
    public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		
		driver.findElement(By.id("login1")).sendKeys("seleniumpanda@rediffmail.com");
		
	    driver.findElement(By.id("password")).sendKeys("Selenium@123");
		driver.findElement(By.className("signinbtn")).click();
		
		
		//driver.findElement(By.cssSelector(".rd_ml_info_upd no_cursor"));  // auto update
	    //driver.findElement(By.cssSelector("a.rd_logout"));
		//driver.findElement(By.cssSelector("a[class = rd_setting_panel]"));
		//driver.findElement(By.cssSelector("a [id = rd_adv_link]")).click();
		//driver.findElement(By.cssSelector("h4.rd_calendar_link")).click();   // calendar
		//driver.findElement(By.cssSelector("h4[class=\"rd_contacts_link\"]")).click();   //address book
		driver.quit();

	}

}
