package Model;

public class SignupLocators {
	// Sign Up link
	public static String SignupLinkbyLinkText = "Log In/Sign Up";
	// Sign Up tab
	public static String SignupTabyXPath = "//li[contains(text(),'Sign Up')]";
	// Mobile number for
	public static String FrameXpath = "//iframe[@src='/v1/api/login?isIframe=true&theme=mp-web']";
	public static String SignupLinkbyclass = "_3ac-";
	// Sign Up tab
	// public static String SignupTabyLinkText = "Sign Up";
	// Mobile number
	public static String mobilenumberbyName = "mobileNumber";
	// Email field
	public static String InvalidMobileMSgbyXpath = "//span[contains(text(),'Mobile Number must be valid.')]";
	// empty mobile error msg path
	public static String EmptyMobileErrorXpath = "//span[contains(text(),'Mobile Number is Compulsory')]";
	// empty invalid mail msg path
	public static String InvalidEmailMSgbyXpath = "//span[contains(text(),'Please enter a valid email address.')]";
	// email id by name
	public static String EmailidbyName = "email";
	// checkbox class name
	public static String CheckByClass = "md-container";
	// Password field
	public static String PasswordbyName = "loginPassword";
	// Create account button
	public static String CreateLinkTextbyXPath = "//button[@class='md-raised md-primary btn-new md-button ng-scope md-default-theme']";

}
