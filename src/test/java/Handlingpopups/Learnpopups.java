package Handlingpopups;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Learnpopups {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");
	
		WebElement smplalert = driver.findElement(By.xpath("//button[text()='Click for JS Alert']"));
		smplalert.click();
		driver.switchTo().alert().accept();
		
		WebElement cfrmalert = driver.findElement(By.xpath("//button[text()='Click for JS Confirm']"));
		cfrmalert.click();
		driver.switchTo().alert().dismiss();
		
		
		WebElement prmtalert = driver.findElement(By.xpath("//button[text()='Click for JS Prompt']"));
		prmtalert.click();
		driver.switchTo().alert().sendKeys("hello");
		driver.switchTo().alert().accept();
		
		
		
		System.out.println("execution done");
		
		
		
		driver.close();

	}

}
