package testScripts;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import pages.HomePage;
import wrappers.LeaftapsWrappers;

public class InvalidMobileNumberSignup extends LeaftapsWrappers {
	
	@BeforeClass
	public void setValues(){
		browserName = "chrome";
		testCaseName = "Invalid Mobile Number Signup";
		testDescription = "Verifying invalid mobile number message in Signup";
		category = "smoke";
		authors = "Prasanaa";
		dataSheetName = "TC002";
		
	}
	@Test
	public void invalidmobilenumberSignup()
	{
		new HomePage(driver,test)
		.ClickLogInSignup()
		.switchingframe()
		.ClickSignup()
		.EnterMobileNumber("85089")
		.EnterEmailId("")
		.InvalidMobileNumberMessage();	
		
	}

}
