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
		//rb = ResourceBundle.getBundle("config");// Load config.properties
				  
		//launch right browser based on parameter
		
	    driver = new ChromeDriver();
					
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		driver.get("https://develop-v2.superlink.io/userthree"); // get url from config.properties file
		driver.manage().window().maximize();
	}
 //Step8 groups added
  /* @AfterClass
	public void teadDown() {	
		driver.quit();
	}*/
	
}
