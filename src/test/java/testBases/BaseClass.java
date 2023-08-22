package testBases;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class BaseClass {
	
	public static WebDriver driver;
   @BeforeClass
	public void setup()		
	{
	    driver = new ChromeDriver();	
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://develop-v2.superlink.io/userthree");
		driver.manage().window().maximize();
	}
   @AfterClass
	public void teadDown() {	
		driver.quit();
	}
	
}
