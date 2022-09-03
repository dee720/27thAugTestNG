package Homework_July25th;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CssSelectors_HW_2 {
   public static WebDriver Driver;
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		Driver = new ChromeDriver();
		Driver.manage().window().maximize();
		Driver.get("https://www.rediff.com/");
		Driver.findElement(By.cssSelector("a[ class=\"mailicon\"]"));
		
		//Driver.findElement(By.cssSelector("input [class*=\'homesrchbox\"]"));
		//Driver.findElement(By.cssSelector("input [id *srchquery_tbox]"));
		//Driver.findElement(By.cssSelector("a[class * = vdicon] "));  //video
		// Driver.findElement(By.cssSelector(".hmsprite logo")).click();  // logo
		//Driver.findElement(By.cssSelector("a.backcricket"));  // cricket
		//Driver.findElement(By.cssSelector("i#idsubnews_icon"));
		//Driver.findElement(By.cssSelector("span.sensex")).click();  //BSE
		
		

	}

}
