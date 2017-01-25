package testScripts;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import Model.LoginLocators;
import wrappers.LeaftapsWrappers;

public class InvalidMobileNumber extends LeaftapsWrappers {
	
	@BeforeClass
	public void setValues(){
		browserName = "chrome";
		testCaseName = "Login";
		testDescription = "Login to PayTm";
		category = "smoke";
		authors = "Gayathri";
		dataSheetName = "TC001";
		
	}
	@Test
	public void invalidmobilenumber()
	{
		
		
	}

}
