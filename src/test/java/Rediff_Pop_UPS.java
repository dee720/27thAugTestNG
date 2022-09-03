import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Rediff_Pop_UPS {
	public static WebDriver driver;
	
	public static void main(String[] args) {
	
    
    
    WebDriverManager.chromedriver().setup();
    driver = new ChromeDriver();
    driver.manage().window().maximize();
    driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
    
    
    
	}

}
