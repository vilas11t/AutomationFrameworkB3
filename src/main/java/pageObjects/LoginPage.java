package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage {

	public WebDriver driver;
	
	public LoginPage(WebDriver driver){
		this.driver=driver;
	}
	
	public WebElement getUserName() {
		return driver.findElement(By.xpath("//input[@id='login1']"));
	}
	
	public WebElement getPassword() {
		return driver.findElement(By.xpath("//input[@id='password']"));
	}
	
	public WebElement getLoginButton() {
		return driver.findElement(By.xpath("//input[@class='signinbtn']"));
	}
	
}
