package Homework_July25th;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Xpath_HW_Rediff {
    public static WebDriver driver;
	public static void main(String[] args) {
	WebDriverManager.chromedriver().setup();
	driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.rediff.com/");
	//driver.findElement(By.xpath"//input[@id = 'login1' and @name 'login']"));click;
	//driver.findElement(By.xpath("//a[@class = 'signin']"));click();
	//driver.findElement(By.xpath("//input[@class ='signinbtn' and @ value = 'Sign in']"));
	//driver.findElement(By.xpath("//a[@[contains(class,'moneyicon relative')]"));
	//driver.findElement(By.xpath("/a[text() = href=\"https://mail.rediff.com/cgi-bin/login.cgi']"));
	
driver.quit();
	}
	private static void click() {
		// TODO Auto-generated method stub
		
	}

}
