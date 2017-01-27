package pages;

import org.openqa.selenium.remote.RemoteWebDriver;

import com.relevantcodes.extentreports.ExtentTest;

import Model.LoginLocators;
import Model.SignupLocators;
import Model.ViewProfile;
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
	public HomePage switchingframe()
	{
		frames(SignupLocators.FrameXpath);
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
	
	public HomePage EmptyMobileNumberMessage()
	{
		verifyEmptyMobileNumber(SignupLocators.MobileErrorMSgbyXpath);
		return this;
	}
	
	public HomePage InvalidMobileNumberMessage()
	{
		verifyInvalidMobileNumber(SignupLocators.MobileErrorMSgbyXpath);
		return this;
	}
	
	public HomePage InvalidEmailIDMessage()
	{
		verifyInvalidEmailID(SignupLocators.MobileErrorMSgbyXpath);
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
	
	public HomePage EnterPassword(String data)
	{
		enterByName(SignupLocators.PasswordbyName, data);
		return this;
	}
	
	public HomePage checkBox()
	{
		verifyCheckboxByClass(SignupLocators.CheckByClass);
		return this;
	}	
	
public HomePage clickAddress()
	{
		clickByXpath(ViewProfile.AddressbyXpath);
		return this;
             }
public HomePage Addnewaddress()
	{
		clickByClassName(ViewProfile.plusiconbyClassname);
		return this;
	}
public HomePage Pincode(String data)
	{
		enterByName(ViewProfile.pincodebyname, data);
		return this;
	}
public HomePage Fullname(String data)
	{
		enterByName(ViewProfile.Fullnamebyname,data);
		return this;
	}
public HomePage Addressline1(String data)
	{
		enterByXpath(ViewProfile.Addressline1byXpath, data);
		return this;
	}
public HomePage Addressline2(String data)
	{
		enterByXpath(ViewProfile.Addressline2byXpath, data);
		return this;
	}

public HomePage city(String data)
	{
		enterByXpath(ViewProfile.CitybyXpath, data);
		return this;
	}
public HomePage State(String data)
	{
		enterByXpath(ViewProfile.StatebyXpath, data);
		return this;
	}
public HomePage Mobilenumber(String data)
	{	
		enterByXpath(ViewProfile.MobilenumberbyXpath, data);
		return this;
	}
public HomePage saveaddress()
	{
		clickByXpath(ViewProfile.SavebyXpath);
		return this;
		
	}
public HomePage Requestwalletupgrade()
	{
		clickByXpath(ViewProfile.requestwalletbyXpath);
		return this;
	}
public HomePage requestvistagent()
	{
		clickByXpath(ViewProfile.requestvisitagentbyXpath);
		return this;
	}
public HomePage PaytmKYCcentre()
	{
		clickByXpath(ViewProfile.PaytmKYCcentreByXpath);
		return this;
	}
public HomePage Logout()
	{
		clickByLink(ViewProfile.Logoutbylinktext);
		return this;
	}
public HomePage changepassword()
	{
		clickByXpath(ViewProfile.changepasswordbyXpath);
		return this;
	}
public HomePage oldpassword(String data)
	{
		enterByXpath(ViewProfile.oldpasswordbyXpath, data);
		return this;
	}
public HomePage newpassword(String data)
	{
		enterByXpath(ViewProfile.newpasswordbyXpath, data);
		return this;
	}
public HomePage confirmpassword(String data)
	{
		enterByXpath(ViewProfile.confirmpasswordbyXpath, data);
		return this;
	}
}
