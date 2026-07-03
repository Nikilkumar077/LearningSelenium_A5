package Handlingpopups;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class HandlingHiddenDivisionPopup {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ChromeOptions co_obj = new ChromeOptions();
		
		co_obj.addArguments("--disabled-notifications");
		
		WebDriver driver=new ChromeDriver(co_obj);
		
		driver.manage().window().maximize();
		
		driver.get("https://www.goibibo.com/");
		
		WebElement closeicon = driver.findElement(By.xpath("//span[@role='presentation']"));
		
		closeicon.click();
		
		System.out.println("execution done");
		
		driver.close();
	}

}
