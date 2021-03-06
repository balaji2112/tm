package wrappers;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;

import utils.DataInputProvider;

public class LeaftapsWrappers extends GenericWrappers {
	
	public String browserName;
	public String dataSheetName;
	
	

	@BeforeSuite
	public void beforeSuite(){
		startResult();
	}

	@BeforeTest
	public void beforeTest(){
		loadObjects();
	}
	
	@BeforeMethod
	public void beforeMethod(){
		test = startTestCase(testCaseName, testDescription);
		test.assignCategory(category);
		test.assignAuthor(authors);
		invokeApp(browserName);
	}
		
	@AfterSuite
	public void afterSuite(){
		endResult();
	}

	@AfterTest
	public void afterTest(){
		unloadObjects();
	}
	
	@AfterMethod
	public void afterMethod(){
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
		   e.printStackTrace();
		}
		endTestcase();
		quitBrowser();
		
	}
	
	@DataProvider(name="fetchData")
	public Object[][] getData(){
		
		//return new Object[][]{{"DemoSalesManager","crmsfa","GSR","j","h","Media","Partnership"},{"DemoSalesManager","crmsfa","GSR","nnn","mmmm","Media","Partnership"}};
		return DataInputProvider.getSheet(dataSheetName);		
	}	
	
	
}






