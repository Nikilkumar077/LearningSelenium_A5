package learnlocator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class learncssselector {
	
	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.saucedemo.com/");
		
		//performing using cssSelector
		
		WebElement untxtfld = driver.findElement(By.cssSelector("input[placeholder='Username']"));
		WebElement pswdtxtfld = driver.findElement(By.cssSelector("input[name='password']"));
		WebElement loginbtn = driver.findElement(By.cssSelector("input[value='Login']"));
		
		
		//performing operations
		
		
		untxtfld.sendKeys("standard_user");
		pswdtxtfld.sendKeys("secret_sauce");
		loginbtn.click();
		
		driver.close();
		
	}

}
