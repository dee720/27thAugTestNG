package Homework_July25th;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Xpath_HW_OPenWeather {
    public static WebDriver driver;
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://openweathermap.org/");
		//driver.findElement(By.xpath("//div[@class = 'owm-loader-container']"));	
		
		//driver.findElement(By.xpath("//div[@id =  'support-dropdown']"));
	
		//driver.findElement(By.xpath("//div[@class = 'owm-loader-container']"));
		//driver.findElement(By.xpath("//a[text() ='href=\"https://openagro.uk/\']")); agricultural analytics URL
		//driver.findElement(By.xpath("//span[@class = 'control-el owm-switch']"));
		
		
		
		
		driver.quit();

	}

}
