package testScripts;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import pages.HomePage;
import wrappers.LeaftapsWrappers;

public class InvalidMobileNumber extends LeaftapsWrappers {
	
	@BeforeClass
	public void setValues(){
		browserName = "chrome";
		testCaseName = "Signup";
		testDescription = "Signup to PayTm";
		category = "smoke";
		authors = "Prasanaa";
		dataSheetName = "TC002";
		
	}
	@Test
	public void invalidmobilenumber()
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
