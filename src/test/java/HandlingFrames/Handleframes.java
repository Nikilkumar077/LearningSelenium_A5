package HandlingFrames;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Handleframes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("file:///C:/Users/USER/Downloads/EmbededWebpage.html");
		
		//Switching the frame
		driver.switchTo().frame(0);
		
		WebElement searchbar = driver.findElement(By.xpath("//input[@name='q']"));
		
		searchbar.sendKeys("computer");
		
		//back to the main page
		driver.switchTo().defaultContent();
		
		
		WebElement nametxtfld = driver.findElement(By.id("name"));
		
		nametxtfld.clear();
		
		nametxtfld.sendKeys("Nikil");
		
		WebElement frametwo = driver.findElement(By.xpath("//iframe[@name='frame2']"));
		
		driver.switchTo().frame(frametwo);
		
		WebElement searchbar1 = driver.findElement(By.xpath("//input[@name='q']"));
		
		searchbar1.sendKeys("book");
		
		
		driver.switchTo().defaultContent();
		
		WebElement mailtxtfld = driver.findElement(By.id("email"));
		
		mailtxtfld.sendKeys("ronaldo@gmail.com");
		
		
		//switching from main page to frame 1
		driver.switchTo().frame("frame1");
		
		searchbar.clear();
		
		searchbar.sendKeys("electronics");
		
		System.out.println("execution done");
		
		//driver.close();

	}

}
