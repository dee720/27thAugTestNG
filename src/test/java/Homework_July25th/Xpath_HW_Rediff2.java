package Homework_July25th;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Xpath_HW_Rediff2 {
    
	public static WebDriver driver;
	
    public static void main(String[] args) {
		
    	WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.rediff.com/");
		
		//driver.findElement(By.xpath("//a[@class = 'class=\"rd_setting_panel\"]")).click();		
		//driver.findElement(By.xpath("//a[text() = 'href=\"https://businessemail.rediff.com?sc_cid=ushome\"]")).click();
		//driver.findElement(By.xpath("//input(text(),'newsrchbtn']")).click();
		//driver.findElement(By.xpath("//a[contains(@class,'backmovies')]")).click;
		//driver.findElement(By.xpath("//span[@class = 'sensex']")).click;
		//driver.findElements(By.xpath("//a[text() ='href=\"https://www.rediff.com/getahead\"']")).click;
		
		
	driver.quit();	

	}


		
    {

	
		
	}

		
	
	}


