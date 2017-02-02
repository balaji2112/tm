package Model;


public class LoginLocators 
{
	//Login/Sign up or Profile name 
	public static String LoginLinkbyxpath = "//div[@class='_3ac-']";
	//User name field
	public static String UserNameLoginbyname= "username";
	//Password
	public static String PasswordLoginbyname= "password";
	//Submit button
	public static String SubmitButtonbyXPath= "//button[@class='md-raised md-primary btn-new mt-20 md-button ng-scope md-default-theme']";
	//Login frame
	public static String LoginframebyXPath="//iframe[@src='/v1/api/login?isIframe=true&theme=mp-web']";
	//OTP button
	public static String verifyButtonbyXpath="//button[@class='md-raised md-primary btn-new-other mt-20 md-button md-default-theme']";
	//Login error message password and username error msg
	 public static String verifyErrorpasswordXpathLogin="//*[contains(text(),'Password is required.')]";
	//invalid username error msg
	 public static String invalidusernameerrorXpath="//*[@class='error']";
	//Login error message password and username error msg
	 public static String verifyinvalidpasswordXpathLogin="//*[contains(text(),'Please enter valid Username and Password.')]"; 
	//Terms and Conditions
	public static String TermsbyLinkText="T&C";
	//Privacy Policy
	public static String privacybyLinkText="Privacy Policy.";
	//Mobile number incorrect
	public static String numberInCorrectErrorbyClass="error";
	//Mobile number error messages
	public static String mobileincorrectmessage="Mobile Number incorrect.";
	public static String invalidcredentialsmessage="Please enter valid Username and Password.";
	public static String emptymobilenumbermessage="Mobile/Email is required.";
	//Password error message
	public static String emptypasswordmessage="Password is required.";
	//Valid credentials
	public static String validmobilenumber ="9894655621";
	public static String validpassword = "GSR@200";
	

}

