package testScripts;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pages.HomePage;
import wrappers.LeaftapsWrappers;

public class Login extends LeaftapsWrappers{
	
	@BeforeClass
	public void setValues(){
		browserName = "chrome";
		testCaseName = "Login";
		testDescription = "Login with valid credentials";
		category = "smoke";
		authors = "Prasanaa";
		dataSheetName = "TC012";
		
	}
	@Test
	public void logintestcase()
	{
		new HomePage(driver,test)
		.ClickLogInSignup()
		.switchingframe()
		.enterUsername("9894655621")
		.enterPasswordLogin("GSR@300")
		.clickSecureLogin();
	}

}
