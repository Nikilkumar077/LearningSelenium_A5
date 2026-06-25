package HandlingMouseActions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class HandleHiddenElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://demowebshop.tricentis.com/");
		
		//steps to perform mouse operations
		//1.create an object for actions
		Actions actionobj = new Actions(driver);
		
		WebElement ele1 = driver.findElement(By.xpath("//ul[@class='top-menu']//a[contains(text(),'Com')]"));
		
		actionobj.moveToElement(ele1).perform();
		
		//2.using reff,call res non static method
		//3.call the mandatory method
		
		WebElement ele2 = driver.findElement(By.xpath("//ul[@class='top-menu']//a[contains(text(),'Des')]"));
		
		//actionobj.click(ele2).perform();
		
		//actionobj.doubleClick(driver.findElement(By.xpath("//ul[@class='top-menu']//a[contains(text(),'Note')]"))).perform();
		
		actionobj.contextClick(driver.findElement(By.xpath("//ul[@class='top-menu']//a[contains(text(),'Acc')]"))).perform();
		System.out.println("Execution done");
		
		driver.close();
		
		

	}

}
