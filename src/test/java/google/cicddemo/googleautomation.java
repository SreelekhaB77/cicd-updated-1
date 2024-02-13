package google.cicddemo;
 
import java.io.File;
import java.util.concurrent.TimeUnit;
 
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;
 
import io.github.bonigarcia.wdm.WebDriverManager;
 
public class googleautomation {
	public static RemoteWebDriver driver;
 
@SuppressWarnings("deprecation")
@Test
public static void launch() throws InterruptedException
{
 
	System.out.println("hi");		
	
    	//System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"/usr/local/bin/chromedriver-linux64");
           
	WebDriverManager.firefoxdriver().setup();
	WebDriver driver = new FirefoxDriver();

	
    driver.manage().window().maximize();
    driver.manage().timeouts().implicitlyWait(3000, TimeUnit.SECONDS);
    edgeDriver.get("http://www.google.com");
    System.out.println("hi");
    System.out.println(driver.getTitle());
    System.out.println("hi2");	
}	
}
