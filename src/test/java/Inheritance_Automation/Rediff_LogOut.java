package Inheritance_Automation;

import org.openqa.selenium.By;

public class Rediff_LogOut extends Parent_Automation {
      @Test
      
      public void LogOut() {
    	  driver.findElement(By.xpath("//a[@class = 'rd_logout']")).click();
     
         driver.quit();
      
      }


  


}
