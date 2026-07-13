package LearndataDrivenTesting;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingpropertiesFile {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		
		// 1: 
		FileInputStream fis = new FileInputStream("./src/test/resources/commondataSD.properties");
		
		// 2:
		Properties prop_obj = new Properties();
		
		// 3:
		prop_obj.load(fis);
		
		// 4:
		String data1 = prop_obj.getProperty("url");
		
		//steps to write
		
		// 5:
		prop_obj.put("browser", "chrome");
		
		// 6:
		FileOutputStream fos = new FileOutputStream("./src/test/resources/commondataSD.properties");
		
		// 7:
		prop_obj.store(fos, "browser added ... !");
		
		
		// open the browser
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		//navigating to the webpage
		
		driver.get(data1);
		
		// login using credentials
		
		String userdata = prop_obj.getProperty("username");
		driver.findElement(By.id("user-name")).sendKeys(userdata);
		
		String passdata = prop_obj.getProperty("password");
		driver.findElement(By.id("password")).sendKeys(passdata);
		
		driver.findElement(By.id("login-button")).click();		
		
	}

}
