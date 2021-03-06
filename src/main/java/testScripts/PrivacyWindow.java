package testScripts;

import java.util.Set;

import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import Model.LoginLocators;

import wrappers.LeaftapsWrappers;

public class PrivacyWindow extends LeaftapsWrappers {

	@BeforeClass
	public void setValues() {

		browserName = "chrome";
		testCaseName = "Login";
		testDescription = "Login to PayTm";
		category = "smoke";
		authors = "Gopi";
		dataSheetName = "TC001";
	}

	@Test
	public void privacywindow() throws InterruptedException {
		// LoginLocators l = new LoginLocators();
		String compare = "Privacy Policy";
		// clickByXpath(l.LoginLinkbyxpath);
		clickByXpath(LoginLocators.LoginLinkbyxpath);
		Thread.sleep(5000);
		WebElement frame = driver.findElementByXPath("//iframe[@src='/v1/api/login?isIframe=true&theme=mp-web']");
		driver.switchTo().frame(frame);
		clickByLink(LoginLocators.privacybyLinkText);
		Thread.sleep(3000);
		String winHandleBefore = driver.getWindowHandle();
		switchToLastWindow();
		/*
		 * Set<String> allwindows = driver.getWindowHandles(); for (String
		 * winHandle : allwindows) { driver.switchTo().window(winHandle); }
		 */
		String PrivacyPolicy = driver.getTitle();
		Thread.sleep(2000);
		if (compare.equalsIgnoreCase(PrivacyPolicy)) {
			System.out.println("Privacy policy page is verified");
		} else {
			System.out.println("This page is not related to Privacy policy");
		}
		driver.switchTo().window(winHandleBefore);
		driver.close();

	}

}
