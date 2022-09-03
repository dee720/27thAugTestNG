package Inheritance_Automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;


public class Rediff_SignIn_Link extends Parent_Automation  {

   @Test
   public void clickOnSignInLink() {
	  
	   driver.findElement(By.className("Sign in")).click();
   }



