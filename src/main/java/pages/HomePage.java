package pages;

import org.openqa.selenium.remote.RemoteWebDriver;

import com.relevantcodes.extentreports.ExtentTest;

import Model.LoginLocators;
import wrappers.LeaftapsWrappers;

public class HomePage extends LeaftapsWrappers {
	
	public HomePage(RemoteWebDriver driver, ExtentTest test){
		this.driver = driver;
		this.test = test;
		if(!verifyTitle("Online recharge | mobile recharge for prepaid & pay postpaid bill@Paytm.com")){
			reportStep("This is not HomePage", "FAIL");
		}

}
	
	public HomePage ClickLogInSignup()
	{
		clickByClassName(LoginLocators.LoginLinkbyclass);
		return this;
	}
	
	public HomePage ClickSignup()
	{
		return this;
		
	}
}
