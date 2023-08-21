package testCase;

import testBases.BaseClass;
import org.testng.annotations.Test;

import pageObjects.HomePage;

public class LoginWithUnlockImg extends BaseClass{
	public HomePage hp;
	
	@Test(priority=1)
	public void ClickOnChatMeButton()
	{
		hp=new HomePage(driver);
		hp.ClickChatMeBTN();		
	}
	@Test(priority=2)
	public void ClickOnLetsStartBtn()
	{
	    hp.ClickLetsStartBtn();;		
	}
	@Test(priority=3)
	public void ClickOnMobileNumberInputBox()
	{
		hp.ClickMobNumberInputBox();
	}
	@Test(priority=4)
	public void EnterTheMobNumber() throws InterruptedException
	{
	    hp.EnterMobNuber("1111111111");
	}
	@Test(priority=5)
	public void ClickOnLoginContinueButton()
	{
		hp.ClickContinueBtn();;
	}
	@Test(priority=6)
	public void EntetTheOTP() throws InterruptedException
	{
		hp.EnterOTP();
	}
	@Test(priority=7)
	public void ClickOnUnlockImage()
	{
		hp.ClickUnlockImg();	
	}
	
}
