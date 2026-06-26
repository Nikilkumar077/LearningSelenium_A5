package HandlingKeyboardOperations;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class learnkeyboardoperations {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://demowebshop.tricentis.com/");
		
		//actions class create object
		Actions actionobj=new Actions(driver);
		
		actionobj.sendKeys(Keys.TAB,Keys.TAB,Keys.TAB,Keys.TAB,Keys.TAB,Keys.TAB,"book",Keys.ENTER).perform();
		
		
		/*
		actionobj.keyDown(Keys.TAB).keyUp(Keys.TAB).perform();
		actionobj.keyDown(Keys.TAB).keyUp(Keys.TAB).perform();
		actionobj.keyDown(Keys.TAB).keyUp(Keys.TAB).perform();
		actionobj.keyDown(Keys.TAB).keyUp(Keys.TAB).perform();
		actionobj.keyDown(Keys.TAB).keyUp(Keys.TAB).perform();
		actionobj.keyDown(Keys.TAB).keyUp(Keys.TAB).perform();
		actionobj.sendKeys("book",Keys.ENTER).perform();
		
		*/
		
		
		
		System.out.println("Execution done");
		
		//driver.close();



	}

}
