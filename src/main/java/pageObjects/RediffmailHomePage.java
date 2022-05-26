package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class RediffmailHomePage {
	public WebDriver driver;
	
	public RediffmailHomePage(WebDriver driver) {
		this.driver=driver;
	}
	
	
	public WebElement getRediffmailLoginLink() {
		return driver.findElement(By.xpath("//a[@class='mailicon']"));
	}
	
	

}
