package Homework_July25th;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CssSelectors_HW_1 {
public static WebDriver driver;
private Object a;

	public static void main(String[] args) {
	WebDriverManager.chromedriver().setup();
	driver = new ChromeDriver() ;
	driver.manage().window().maximize();
	driver.get("https://www.rediff.com/");
	driver.findElement(By.cssSelector("a.backmovies"));
	
	//driver.findElement(By.cssSelector("a.backmovies"));  //movies
	//driver.findElement(By.cssSelector("a.shopicon relative"));//shopping
	//driver.findElement(By.cssSelector("a.mailicon")).click();//rediffmail
	//driver.findElement(By.cssSelector("input# login1")).sendKeys("Seleniumpanda@rediffmail.com");
	//driver.findElement(By.cssSelector("a[class = mailicon]"));
	driver.quit();}

}
