package learnlocator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class learnxpathtraversing {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");//navigate to the application
		
		//for register link
		WebElement register = driver.findElement(By.xpath("//a[contains(text(),'Register')]"));
		register.click();
		
		//for registration process
		WebElement gender = driver.findElement(By.xpath("//input[@value='M']"));
		gender.click();
		WebElement firstname = driver.findElement(By.xpath("//input[@name='FirstName']"));
		firstname.sendKeys("ronaldo");
		WebElement lastname = driver.findElement(By.xpath("//input[@name='LastName'] "));
		lastname.sendKeys("aveiro");
		WebElement email = driver.findElement(By.xpath("//input[@id='Email']"));
		email.sendKeys("nikilpm27@gmail.com");
		WebElement password = driver.findElement(By.xpath("//input[@name='Password']"));
		password.sendKeys("ronaldo7");
		WebElement cfrmpwrd = driver.findElement(By.xpath("//input[@name='ConfirmPassword']"));
		cfrmpwrd.sendKeys("ronaldo7");
		WebElement registerbtn = driver.findElement(By.xpath("//input[@value='Register']"));
		registerbtn.click();
		
		
		

	}

}
