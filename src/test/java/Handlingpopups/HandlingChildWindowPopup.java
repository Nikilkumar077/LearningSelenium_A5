package Handlingpopups;

import java.time.Duration;
import java.util.Set;

import org.jspecify.annotations.Nullable;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingChildWindowPopup {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		WebDriver driver =new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.shoppersstack.com/products_page/51");
		
		
		//click the compare button
		
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30l));
		
		WebElement cpmbtn = driver.findElement(By.xpath("//button[@name='compare']"));
		
		cpmbtn.click();
		
		
		String parentaddress = driver.getWindowHandle();
		System.out.println(parentaddress);
		
		Set<String> allwindows = driver.getWindowHandles();
		System.out.println(allwindows);
		
		
		for (String win : allwindows) {

		//switch to driver focus
        driver.switchTo().window(win);
                
        //fetching the title 
		String title = driver.getTitle();
		System.out.println(title);
		
				
		//close only child window
		if (!win.equals(parentaddress)) {
				driver.close();
				 }		
    
		//close only one window
		/*if (title.contains("amazon")) {
			driver.close();
			 }	*/	
		
		
		
		
        }
		 System.out.println("Child window closed successfully.");	
		
		
		 //closing all the windows
		// driver.close();
			
		}
	}


