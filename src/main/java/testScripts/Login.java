package testScripts;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import wrappers.LeaftapsWrappers;

public class Login extends LeaftapsWrappers{
	
	@BeforeClass
	public void setValues(){
		browserName = "chrome";
		testCaseName = "Login";
		testDescription = "Login to PayTm";
		category = "smoke";
		authors = "Gopi";
		dataSheetName = "TC001";
		
	}
	@Test
	public void login()
	{
		//invokeApp("chrome");
	}

}
