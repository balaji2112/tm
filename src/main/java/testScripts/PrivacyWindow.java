package testScripts;

import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import Model.LoginLocators;

import wrappers.LeaftapsWrappers;

public class PrivacyWindow extends LeaftapsWrappers
{
	
	@BeforeClass
	public void setValues()
	{
	
		browserName = "chrome";
		testCaseName = "Login";
		testDescription = "Login to PayTm";
		category = "smoke";
		authors = "Gopi";
		dataSheetName = "TC001";
	}
	
	@Test
	public void privacywindow() throws InterruptedException
	{
		LoginLocators l = new LoginLocators();
		String compare = "https://paytm.com/terms.html";
		//clickByXpath(l.LoginLinkbyxpath);
		clickByXpath(LoginLocators.LoginLinkbyxpath);
		Thread.sleep(5000);
		WebElement frame =driver.findElementByXPath("//iframe[@src='/v1/api/login?isIframe=true&theme=mp-web']");
		driver.switchTo().frame(frame);
		//enterByName("UserNamebyname", "9894655621");
		//enterByName("Passwordbyname","GSR@200");
		//clickByXpath("SubmitButtonbyXPath");
		clickByLink(LoginLocators.TermsbyLinkText);
		Thread.sleep(3000);
		String url =driver.getCurrentUrl();
		String winHandleBefore = driver.getWindowHandle();
		for(String winHandle : driver.getWindowHandles()){
		driver.switchTo().window(winHandle);
		if(compare ==url)
		{
			System.out.println("The page is Terms and conditions");
		}
		else
		{
				System.out.println("The page is not Terms and conditions");
		}
		}
		driver.close();
		driver.switchTo().window(winHandleBefore);
		
	}
	

}
