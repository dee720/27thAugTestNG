package Homework_July25th;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CssSelector_HW_$ {
 
	public static WebDriver driver;
  
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.rediff.com/");
		driver.findElement(By.cssSelector("//div[@class ='navbar']/child:: ul[@class = 'navbarul']/child:: li{@class = 'news']/child:: a{1}"));
		
		
		//driver.findElement(By.cssSelector("div[@class = 'fnt0']/child::div[@class = 'table']/child::div[@class = 'cell']/child::span[@class = 'cell'] "));
		//driver.findElement(By.cssSelector("//div[@class = stocksearchbox]+form[@class = formgetquote]/child:: input[2]"));  // search symbol
		//driver.findElement(By.cssSelector("//div[@class = cell topicons]child[2]::a[1]"));   //Money
		//driver.findElement(By.cssSelector("//div[@class = 'cell alignR toprlinks']child[2]:: p[@id = signin_info]child[1]"));   // signout

	}

}
