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
		clickByXpath(LoginLocators.LoginLinkbyxpath);
		return this;
	}
	
	public HomePage ClickSignup()
	{
		clickByXpath(SignupLocators.SignupTabyXPath);
		return this;
	}
	
	public HomePage VerifyMobileNumber()
	{
		verifyTextByName(SignupLocators.mobilenumberbyName);
		return this;
	}
	
	public HomePage VerifyMobileNumberMessage()
	{
		verifyTextByName(SignupLocators.mobilenumberbyName,SignupLocators.MobileErrorMSgbyClass);
		return this;
	}
	public HomePage EnterMobileNumber(String data)
	{
		enterByName(SignupLocators.mobilenumberbyName,data);
		return this;
	}
	
	public HomePage EnterEmailId(String data)
	{
		enterByName(SignupLocators.EmailidbyName,data);
		return this;
	}
	public HomePage EmailErrorMSg()
	{
		verifyTextByName(SignupLocators.EmailidbyName,SignupLocators.MobileErrorMSgbyClass);
		return this;
	}
	
	
}
