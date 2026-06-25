package learnlocator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class learnbyid {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.saucedemo.com/");
		
		WebElement untxtfld=driver.findElement(By.id("user-name"));
		untxtfld.sendKeys("standard_user");
		
		WebElement pwrdtxtfld=driver.findElement(By.id("password"));
		pwrdtxtfld.sendKeys("secret_sauce");
		
		WebElement loginbtn=driver.findElement(By.id("login-button"));
		loginbtn.click();
		
		
		
		driver.close();

	}

}
