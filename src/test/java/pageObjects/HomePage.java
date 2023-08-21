package pageObjects;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage {

	public HomePage(WebDriver driver) {
		super(driver);
	}
	
	// Elements added here
	@FindBy(xpath="//div[@class='text-center flex-center-center gap-4']//button") WebElement ChatMeBTN;
	@FindBy(xpath="//button[@class='cta button w-full mt-5 rounded-full text-white bg-black']") WebElement LetsStartBtn;
	@FindBy(xpath="//input[@class='form-control ']") WebElement MobInputBox;
	@FindBy(xpath="//button[@type='submit']") WebElement ContinueBtn;
	
	@FindBy(xpath="//input[@aria-label='Please enter verification code. Digit 1']") WebElement FirstInput;
	@FindBy(xpath="//div[@class='form-group mb-5 full max-w-[450px] mx-auto']//div[2]//input") WebElement secondInput;
	@FindBy(xpath="//div[@class='form-group mb-5 full max-w-[450px] mx-auto']//div[3]") WebElement thirdInput;
	@FindBy(xpath="//div[@class='form-group mb-5 full max-w-[450px] mx-auto']//div[4]") WebElement forthInput;
	@FindBy(xpath="//div[@class='form-group mb-5 full max-w-[450px] mx-auto']//div[5]") WebElement fifthInput;
	@FindBy(xpath="//div[@class='form-group mb-5 full max-w-[450px] mx-auto']//div[6]") WebElement sixthInput;
	@FindBy(xpath="//img[@alt='msg']") WebElement UnlockImg;
	
	//Methods
	
	public void ClickChatMeBTN()
	{
		ChatMeBTN.click();
	}
	public void ClickLetsStartBtn()
	{
		LetsStartBtn.click();
	}
	public void ClickMobNumberInputBox()
	{
		MobInputBox.click();
	}
	public void EnterMobNuber(String mob)
	{
		MobInputBox.sendKeys(mob);
	}

	public void ClickContinueBtn()
	{
		ContinueBtn.click();
	}
	
	public void EnterOTP() throws InterruptedException
	{
		driver.findElement(By.xpath("//input[@aria-label='Please enter verification code. Digit 1']")).sendKeys("1");
		driver.findElement(By.xpath("//input[@aria-label='Digit 2']")).sendKeys("2");
		driver.findElement(By.xpath("//input[@aria-label='Digit 3']")).sendKeys("3");
		driver.findElement(By.xpath("//input[@aria-label='Digit 4']")).sendKeys("4");
		driver.findElement(By.xpath("//input[@aria-label='Digit 5']")).sendKeys("5");
		driver.findElement(By.xpath("//input[@aria-label='Digit 6']")).sendKeys("6");
	}
	public void ClickUnlockImg() {
		UnlockImg.click();
	}
		
}
