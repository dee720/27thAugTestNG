import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Looping_Dropdown_EaseMyTrip {
     public static WebDriver driver;
     public static WebDriverWait wait;
	public static void main(String[] args) {
	WebDriverManager.chromedriver().setup();
	driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.easemytrip.com/");
	driver.findElement(By.xpath("//p[@id = 'ptravlrNo']")).click();
	
	driver.findElement(By.xpath("//span[@id = 'spnTraveller']")).click();
	
	
	
	for (int A = 0; A <=5; A++) {
		System.out.println(A);
		driver.findElement(By.xpath("//input[@ id = 'optAdult']")).click();
		
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}
			
	for ( int c = 0; c<=2; c++) {
				System.out.println(c);
			driver.findElement(By.xpath("//input[@id = 'optChild']")).click();
			}
			
			
			for ( int i =0; i<=4; i++) {
				System.out.println(i);
			driver.findElement(By.xpath("//input[@ id = 'optInfant']")).click();
			}
	
	driver.quit();

	}

}
