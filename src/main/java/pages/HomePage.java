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
	public HomePage clearText(String data)
	{
		enterByNameandClear(SignupLocators.mobilenumberbyName,data);
		return this;
	}
	public HomePage VerifyMobileNumber()
	{
		verifyTextByName(SignupLocators.mobilenumberbyName);
		return this;
	}
	
	public HomePage EmptyMobileNumberMessage()
	{
		verifyEmptyMobileNumber(SignupLocators.EmptyMobileErrorXpath);
		return this;
	}
	
	public HomePage emptypasswordMessageLogin()
	{
		verifyErrorMessagePasswordLogin(LoginLocators.verifyErrorpasswordXpathLogin);
		return this;
	}
	
	public HomePage invalidMobileMessageLogin()
	{
		verifyinvalidusernameErrorMessageLogin(LoginLocators.invalidusernameerrorXpath);
		return this;
	}
	
	public HomePage InvalidMobileNumberMessage()
	{
		verifyInvalidMobileNumber(SignupLocators.InvalidMobileMSgbyXpath);
		return this;
	}
	
	public HomePage InvalidEmailIDMessage()
	{
		verifyInvalidEmailID(SignupLocators.InvalidEmailMSgbyXpath);
		return this;
	}
		
	public HomePage EnterMobileNumber(String data)
	{
		enterByName(SignupLocators.mobilenumberbyName,data);
		return this;
	}
	
	public HomePage enterUsername(String data)
	{
		enterByName(LoginLocators.UserNameLoginbyname,data);
		return this;
	}
	
	public HomePage enterPasswordLogin(String data)
	{
		enterByName(LoginLocators.PasswordLoginbyname,data);
		return this;
		
	}
	
	public HomePage clickSecureLogin()
	{
		clickByXpath(LoginLocators.SubmitButtonbyXPath);
		return this;
	}
	
	public HomePage clickverifyOTP() throws InterruptedException
	{   Thread.sleep(60000);
		clickByXpath(LoginLocators.verifyButtonbyXpath);
		return new HomePage(driver,test);
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
	
	public HomePage Mousehover()
	{
		mouseOverByXpath(LoginLocators.LoginLinkbyxpath);
		return this;
	}
	public HomePage profileclick()
	{
		clickByClassName(ViewProfile.profileclickbyclass);
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
public HomePage Addnewaddress() throws InterruptedException
	{
	Thread.sleep(2000);
		clickByClassName(ViewProfile.plusiconbyxpath);
		return this;
	}
public HomePage Pincode(String data)
	{
		enterByName(ViewProfile.pincodebyname, data);
		return this;
	}
public HomePage Fullname(String data)
	{
		enterByName(ViewProfile.plusiconbyxpath,data);
		return this;
	}
public HomePage Addressline1(String data) throws InterruptedException
	{
	Thread.sleep(2000);
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
public HomePage saveaddress() throws InterruptedException
	{
	Thread.sleep(2000);	
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

public HomePage switchingframe(String xpath)
{
	frames(xpath);
	return this;
}
public HomePage switchingframebyIndex(int num)
{
	frames(num);
	return this;
}
public HomePage switchingfrchangepswd(String xpath) throws InterruptedException
{
	Thread.sleep(8000);
	frames(xpath);
	return this;
}
public HomePage pswdsuccessupdatedframe()
{
	frames(ViewProfile.pswdupdatedframebyXpath);
	return this;
}
public HomePage nobyid()
{
	clickById(ViewProfile.clickingnobyid);
	return this;
}
public HomePage changepasswordtab()
{
clickByXpath(ViewProfile.ChangepswdbyXpath);
return this;
}

public HomePage oldpassword1(String data)
{
	enterById(ViewProfile.oldpswdbyid,data);
	return this;
}
public HomePage newpassword1(String data)
{
	enterById(ViewProfile.newpasswordbyid,data);
	return this;
}
public HomePage confirmpassword1(String data)
{
	enterById(ViewProfile.confirmpasswordbyid,data);
	return this;
}
public HomePage savebutton()
{
	clickById(ViewProfile.savebuttonbyid);
	return this;
}

public HomePage switchoutframe()
{
	switchoutofframe();
	return this;
}


public HomePage settingprofileclick()
{
	clickByXpath(ViewProfile.settingprofileclick);
	return this;
}

public HomePage Mousescroll()
{
	mouseoverscroll();
	return this;
	
}

}