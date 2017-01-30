package Model;

public class ViewProfile {
	
	//Address tab
	public static String AddressbyXpath ="//span[contains(text(),'Address')]";
	//"+" icon
	public static String plusiconbyClassname ="text";
	//Enter Pincode
	public static String pincodebyname ="Pincode";
	//Enter Full name
	public static String Fullnamebyname ="firstName";
	//Address line 1
	public static String Addressline1byXpath ="//label[contains(text(),'Address Line 1')]";
	//Address line 2
	public static String Addressline2byXpath ="//label[contains(text(),'Address Line 2')]";
	//City
	public static String CitybyXpath ="//label[contains(text(),'City')]";
	//State
	public static String StatebyXpath = "//label[contains(text(),'State')]";
	//Mobilenumber
	public static String MobilenumberbyXpath = "//label[contains(text(),'Mobile Number')]";
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
	//request visit from our agent
	public static String requestvisitagentbyXpath ="//span[contains  (text(), 'Request a visit from our agent')]";
	//PaytmKYCcentre
	public static String PaytmKYCcentreByXpath ="//span[contains(text(),'Visit nearest Paytm KYC center')]";
	//Logout
	public static String Logoutbylinktext ="Log Out";
	
	public static String profileclickbyclass ="_3ac-";
	
}
