package handlingsynchronization;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class learnsynchronizaton {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.shoppersstack.com/");
		
		WebElement welcometext = driver.findElement(By.xpath("//h3"));
		
		System.out.println(welcometext.getText());
		
		WebElement loginbtn = driver.findElement(By.xpath("//button[@name='loginBtn']"));
	
		loginbtn.click();
		driver.close();
		
		
		

	}

}
