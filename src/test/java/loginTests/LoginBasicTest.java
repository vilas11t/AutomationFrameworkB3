package loginTests;

import static org.testng.Assert.assertEquals;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pageObjects.LoginPage;
import pageObjects.RediffMainInbox;
import pageObjects.RediffmailHomePage;
import source.Base;

public class LoginBasicTest extends Base{
	public WebDriver driver;
	RediffmailHomePage rediffmailHomePage;
	LoginPage loginPage;
	RediffMainInbox rediffMainInbox;
	
	
	@BeforeClass
	void beforeClass() throws IOException {
		driver=driverInitialize();
		rediffmailHomePage=new RediffmailHomePage(driver);
		loginPage=new LoginPage(driver);
		rediffMainInbox=new RediffMainInbox(driver);
		driver.get("https://www.rediff.com/");
	}
	
	@Test
	void logintest1() throws IOException {
		String eLoginPageTitle="Rediffmail";
		String eDeleteButtonText="Please select one or more mails to perform this action";
		rediffmailHomePage.getRediffmailLoginLink().click();
		loginPage.getUserName().sendKeys(getProperty("adminuser"));
		loginPage.getPassword().sendKeys(getProperty("password"));
		loginPage.getLoginButton().click();
		String aLoginPageTitle=driver.getTitle();
		Assert.assertEquals(aLoginPageTitle, eLoginPageTitle,"Page title does not matches.. user not loged in successfull");
		
		// to verify delete mail button
		Assert.assertTrue(rediffMainInbox.deleteMailButton().isDisplayed(), "Delete mail button deosn not diplay");
		rediffMainInbox.deleteMailButtonText().click();
		String aDeleteButtonText=rediffMainInbox.deleteMailButtonText().getText();
		assertEquals(aDeleteButtonText, eDeleteButtonText,"Delete mail text button not as expected");
		rediffMainInbox.deleteMailButtonOK().click();
		
		
	}
	
	
	
	
	@AfterClass
	void afterClass() {
		driver.close();
	}

}
