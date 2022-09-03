package AUTOMATIONCODE_HTML;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Html__Practice_1 {
	
	public static WebDriver driver;
	private static String signinbtn;

	public static void main(String[] args) throws Exception {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
	    String login;
		Object Seleniumpanda;
		Object rediffmail;
		Object https;
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
	    driver.findElement(By.name("login")).sendKeys("seleniumpanda@rediffmail.com");
	    driver.findElement(By.id("password")).sendKeys("Selenium@123");
	    driver.findElement(By.className("signinbtn")).click();
	    Thread.sleep(2000);
	    driver.findElement(By.className("rd_logout")).click();
	    Thread.sleep(2000);
		driver.quit();
	}

}
