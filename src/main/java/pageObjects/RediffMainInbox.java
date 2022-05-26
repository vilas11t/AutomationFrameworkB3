package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class RediffMainInbox {
	WebDriver driver;
	
	public RediffMainInbox(WebDriver driver){
		this.driver=driver;
	}
	
	
	public WebElement deleteMailButton() {
		return driver.findElement(By.xpath("//span[@class='rd_fil_del']"));
	}
	
	public WebElement deleteMailButtonText() {
		return driver.findElement(By.xpath("//div[@class='jqimessage ']"));
	}
	

	public WebElement deleteMailButtonOK() {
		return driver.findElement(By.xpath("//button[@class=' jqidefaultbutton ']"));
	}
	
	
	
	
	
	

}
