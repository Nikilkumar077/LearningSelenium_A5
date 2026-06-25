package learningwebelement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class webelementvalidation {

	
	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://automationexercise.com/");
		
		
		//home page
		WebElement loginlink = driver.findElement(By.xpath("//a[contains(text(),' Signup / Login')]"));
		loginlink.click();
		
		
		//login page
		WebElement untxtfld =driver.findElement(By.xpath("//input[@name='name']"));
		untxtfld.sendKeys("nikil");
		
		WebElement email=driver.findElement(By.xpath("//input[@data-qa='signup-email']"));
		email.sendKeys("nikilpm27@gmail.com");
		
		WebElement login=driver.findElement(By.xpath("//button[contains(text(),'Signup')]"));
		login.click();
		
	    //account page
		WebElement radiobtn=driver.findElement(By.xpath("//input[@id='id_gender1']"));
		radiobtn.click();
		
		WebElement mailfld=driver.findElement(By.xpath("//input[@id='email']"));
		
		//validate mail display status
		boolean displaystatus=mailfld.isDisplayed();
		
		if(displaystatus)
		{
			System.out.println("mailfld displayed status:"+displaystatus);
		}
		else {
			System.out.println("mailfld displayed status:"+displaystatus);
		}
		
		//validate mail enable status
		boolean enabledstatus=mailfld.isEnabled();
		
		if(enabledstatus)
		{
			System.out.println("mailfld enabled status:" + enabledstatus);
		}
		else {
			System.out.println("mailfld enabled status:" + enabledstatus);
		}
		
		driver.close();
		
		
	}
}
