package Handlingpopups;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class HandlingNotificationPopup {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		ChromeOptions co_obj = new ChromeOptions();
		
		co_obj.addArguments("--disabled-notifications");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.goibibo.com/");
		
		System.out.println("execution done");
		
		
		driver.close();
		
		
	}

}
