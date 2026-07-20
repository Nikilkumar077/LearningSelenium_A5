package GenericLibrary;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

public class BaseConfig {
	public WebDriver driver;
	public static WebDriver stdriver;
	
	@BeforeClass
	public void BrowserSetup() {
			
		Reporter.log("Browser Opened",true);
		driver=new ChromeDriver();
		
		Reporter.log("Browser Maximized",true);
		driver.manage().window().maximize();
		
		Reporter.log("Nav to app via URL",true);
		driver.get("http://49.249.29.4:8888/");
	}
	
	@BeforeMethod
	public void login() {
		Reporter.log("Entered un in Untxtfld",true);
		driver.findElement(By.xpath("//input[@name='user_name']")).sendKeys("admin");
		
		Reporter.log("Entered pswd in pswdtxtfld",true);
		driver.findElement(By.xpath("//input[@name='user_password']")).sendKeys("admin");
		
		Reporter.log("Click on thr login btn",true);
		driver.findElement(By.xpath("//input[@type='submit']")).click();
	}
	@AfterMethod
	public void logout() {
		Reporter.log("click on sign up button-signout",true);
		WebElement signout_img = driver.findElement(By.xpath("//img[@style='padding: 0px;padding-left:5px']"));
		signout_img.click();
		
		WebElement signout = driver.findElement(By.xpath("//a[text()='Sign Out']"));
		signout.click();
	}
	
	@AfterClass
	public void BrowserTerminate() {
		Reporter.log("Browser closed",true);
		driver.close();
	}
}
