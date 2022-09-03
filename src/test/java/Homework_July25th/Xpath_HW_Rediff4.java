package Homework_July25th;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Xpath_HW_Rediff4 {

	public static WebDriver driver;
	
	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://openweathermap.org/");
		
		//driver.findElement(By.xpath("//div[@id = 'desktop-menu;]/child::form/sibling::a[1]")).click();
		
		//driver.findElement(By.xpath("//div[@id = 'desktop-menu']/descendant::a[1]")).click();
		//driver.findElement(By.xpath("//ul[@ id = 'first-level-nav']/descendant:: a[1]")).click();
		//driver.findElement(By.xpath("//li[@class = 'class']/descendant:: img[1]"));
		
		driver.quit();
	}

}
