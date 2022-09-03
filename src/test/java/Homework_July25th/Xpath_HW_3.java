package Homework_July25th;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Xpath_HW_3 {
	public static WebDriver driver;
	
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.rediff.com/");	
     
		//driver.findElement(By.xpath("//a[contains(text(),'backsports')]")).click();
		
		//driver.findElement(By.xpath("//div[@class = tabs]")).click();
		//driver.findElement(By.xpath("//a[contains(@class,'moneyicon relative')]")).click();
		//driver.findElement(By.xpath("//a[contains(@class,'backgetahead')]")).click();
		//driver.findElement(By.xpath("//a[contains(@class,'shopicon relative')]")).click();
	
	
	}

}
