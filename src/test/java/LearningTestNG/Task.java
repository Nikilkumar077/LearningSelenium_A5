package LearningTestNG;

import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Task {
	
	@BeforeClass
	public void BrowserSetup() {
		Reporter.log("Browser Opened",true);
		Reporter.log("Browser Maximized",true);
		Reporter.log("Nav to app via URL",true);
	}
	
	@BeforeMethod
	public void login() {
		Reporter.log("Entered un in Untxtfld",true);
		Reporter.log("Entered pswd in pswdtxtfld",true);
		Reporter.log("Click on thr login btn",true);
	}
	
	@Test
	public void CreateOrg(){
		Reporter.log("Create Org",true);
		//steps to Automate
	}
	
	@Test
	public void UpdateOrg() {
		Reporter.log("update Org",true);
		//steps to automate
	}
	
	@AfterMethod
	public void logout() {
		Reporter.log("click on sign up button-signout",true);
	}
	
	@AfterClass
	public void BrowserTerminate() {
		Reporter.log("Browser closed",true);
	}
	
	
}
