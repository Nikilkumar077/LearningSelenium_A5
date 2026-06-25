package handlingscreenshot;

import java.io.File;
import java.io.IOException;


import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;




public class webpagescreenshot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://automationexercise.com/");
		
		TakesScreenshot ts=(TakesScreenshot) driver;
		File temppath=ts.getScreenshotAs(OutputType.FILE);
		File permpath = new File("./src/test/resources/Testscreenshot/screenshot1.png");
		
		try {
			FileHandler.copy(temppath, permpath);
		} catch (IOException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
		driver.close();

	}

}
