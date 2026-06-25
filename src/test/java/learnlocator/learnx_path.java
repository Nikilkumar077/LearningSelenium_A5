package learnlocator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class learnx_path {
	
	public static void main(String[] args) {
		
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.saucedemo.com/");
		
		//identify the webelements using xpath
		
		WebElement logo= driver.findElement(By.xpath("//div[text()='Swag Labs']"));
		String text = logo.getText();
		System.out.println(text);
		

		WebElement untxtfld = driver.findElement(By.xpath("//input[@placeholder='Username']"));
		WebElement pswdtxtfld = driver.findElement(By.xpath("//input[contains(@id,'pass')]"));
		WebElement loginbtn = driver.findElement(By.xpath("//input[@value='Login']"));
		
		untxtfld.sendKeys("standard_user");
		pswdtxtfld.sendKeys("secret_sauce");
		loginbtn.click();
		
		System.out.println("Execution done by Nikil");
	}

}
