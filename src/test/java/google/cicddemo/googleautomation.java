package google.cicddemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class googleautomation {

@Test
public static void launch() throws InterruptedException
{
		// TODO Auto-generated method stub
	
		// WebDriverManager.firefoxdriver().setup();
		// WebDriver driver =new FirefoxDriver();


	FirefoxProfile firefoxProfile = new FirefoxProfile();File extension = new File("extension.xpi");
firefoxProfile.addExtension(extension);
DesiredCapabilities capabilities = DesiredCapabilities.firefox();
capabilities.setCapability(FirefoxDriver.PROFILE, firefoxProfile);
driver = new RemoteWebDriver(new URL("http://localhost:4444/wd/hub"), capabilities);
	

	
		driver.get("https://www.google.co.in/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
				
		}
}
