package Inheritance_Automation;

import org.openqa.selenium.By;

public class Rediff_HomeLink_Click extends Parent_Automation{

	
	@Test
	public void clickOnHomeLink() {
		driver.findElement(By.xpath("//b[contains (text(), 'Rediff Home')]")).click();
	
	driver.quit();
	}
}
