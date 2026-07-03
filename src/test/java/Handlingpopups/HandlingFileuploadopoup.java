package Handlingpopups;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingFileuploadopoup {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://the-internet.herokuapp.com/upload");
		
		//steps to handle -->file upload popup
		
		
		// 1.identify the choosefile button
		WebElement choosefilebtn = driver.findElement(By.id("file-upload"));
		
		//choosefilebtn.click();
		
		// 2.create the file-->using file class
		File actualfile = new File("./src/test/resources/data/Notes.txt");
		
		
		// 3.pass the absolute path,inside sendkeys
		choosefilebtn.sendKeys(actualfile.getAbsolutePath());
		
		System.out.println("execution done");
		
		driver.close();
		
		

	}

}
