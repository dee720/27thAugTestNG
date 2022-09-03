package automation_code;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Abrowser_abcnews_code {
public static WebDriver driver;

     public static void main(String[]args) {
     WebDriverManager.chromedriver().setup();
     driver = new ChromeDriver();
     driver.manage().window().maximize();
     driver.get("https://abcnews.go.com");

 }
}
