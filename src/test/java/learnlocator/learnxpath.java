package learnlocator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class learnxpath {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.saucedemo.com/");
		
		WebElement untxtfld = driver.findElement(By.xpath("//input[@placeholder='Username']"));
		WebElement pswdtxtfld = driver.findElement(By.xpath("//input[contains(@id,'pass')]"));
		WebElement loginbtn = driver.findElement(By.xpath("//input[@value='Login']"));
		
		WebElement productname= driver.findElement(By.xpath("//div[text()='Sauce Labs Backpack']"));
		String text = productname.getText();
		System.out.println(text);
		
		untxtfld.sendKeys("standard_user");
		pswdtxtfld.sendKeys("secret_sauce");
		loginbtn.click();
		
		
		

	}

}
