package source;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Base {
	
	public WebDriver driver;
	public Properties property;
	
	// driver initialize method
	public WebDriver driverInitialize() throws IOException {
		 
		 System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"/drivers/chromedriver.exe");
		 driver=new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
		 return driver;
	 }
	
	 
	 public String getProperty(String propertyName) throws IOException {
		 File file=new File(System.getProperty("user.dir")+"\\config.properties");
		 FileInputStream fis=new FileInputStream(file);
		 property=new Properties();
		 property.load(fis);
		 return property.getProperty(propertyName);
	 }
	 
	 
	 
	 
	 
	 

}
