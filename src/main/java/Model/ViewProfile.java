package Model;

import org.openqa.selenium.WebElement;

public class ViewProfile {
	
	//Profilename click
	public static String profileclickbyclass ="_3ac-";
	
	//Address tab
	public static String AddressbyXpath ="//span[contains(text(),'Address')]";
	//Change password
	public static String ChangepswdbyXpath ="//span[contains(text(),'Change Password')][1]";
	//Enter into frame
	public static String moveframebyXpath ="//iframe[@class='border-blocks border-radius'][1]";
	//old password
	public static String oldpswdbyid ="oldPassword";
	//New Password
	public static String newpasswordbyid ="newPassword";
	//confirmPassword
	public static String confirmpasswordbyid ="rePassword";
	//save button
	public static String savebuttonbyid="proceed";
	//pswd updated frame
	public static String pswdupdatedframebyXpath="//*[@id='tab-content-3']/div/md-content/iframe";
	//click no 												
	public static String clickingnobyid="Proceed2";
	//"+" icon
	public static String plusiconbyxpath ="//li[@class='last']/div";
	//Enter Pincode
	public static String pincodebyname ="Pincode";
	//Enter Full name
	public static String Fullnamebyxpath ="//label[contains(text(),'Full Name')]/following::input";	
	//Address line 1
	public static String Addressline1byXpath ="//label[contains(text(),'Address Line 1')]/following::textarea";
	//Address line 2
	public static String Addressline2byXpath ="//label[contains(text(),'Address Line 2')]/following::textarea";
	//City
	public static String CitybyXpath ="//label[contains(text(),'City')]/following::input";
	//State
	public static String StatebyXpath = "//label[contains(text(),'State')]/following::input";
	//Mobilenumber
	public static String MobilenumberbyXpath = "//label[contains(text(),'Mobile Number')]/following::input";
	//Save Address
	public static String SavebyXpath = "//span[contains(text(),'Save address')]";
	//Change Password
	public static String changepasswordbyXpath ="//span[contains(text(),'Change Password')]";
	//Old password
	public static String oldpasswordbyXpath ="//input[@name='oldPassword']";
	//new password
	public static String newpasswordbyXpath ="//input[@name='newPassword']";
	//Confirm password
	public static String confirmpasswordbyXpath ="//label[contains(text(),'Confirm Password')]";
	//save
	public static String savebyXpath ="//button[contains(text(),'Save')]";
	//Request wallet upgrade
	public static String requestwalletbyXpath ="//span[contains (text(), 'Request Wallet Upgrade')]";
	//public static String requestvisitagentbyXpath="//md-radio-button[@value='agent']";
	//Switching into frame to click radio
	public static String switchframeradiobyXpath ="//iframe[@src='https://accounts.paytm.com/view/upgrade?theme=mp-web']";
	//request visit from our agent
	public static String requestvisitagentbyXpath ="//*[@id='radio_0']/div[1]/div[1]";
	//PaytmKYCcentre
	public static String PaytmKYCcentreByXpath ="//*[@id='radio_1']/div[1]/div[1]";
	//*[@id="radio_1"]
	//Settingsprofileclick
	public static String settingprofileclick="//a[@class='name']";
	//Logout
	public static String Logoutbylinktext ="Log Out";
	
	
	
}
