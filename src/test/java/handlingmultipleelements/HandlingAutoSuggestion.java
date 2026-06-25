 package handlingmultipleelements;

import java.time.Duration;
import java.util.List;
import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingAutoSuggestion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//take input  from user
		Scanner sc=new Scanner(System.in);
		System.out.println("enter dynamic input:");
		String searchdata=sc.next();
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20l));
		driver.get("https://www.amazon.in/");
		
		
		
		
		WebElement searchbox = driver.findElement(By.id("twotabsearchtextbox"));
		
		searchbox.sendKeys(searchdata);
		
		//handle Auto suggestion
		
		List<WebElement> allsuggestion = driver.findElements(By.xpath("//div[text()='" + searchdata + "']"));
		
		//print the text value
		
		for(int i=0; i<allsuggestion.size(); i++)
		{
			System.out.println(allsuggestion.get(i).getText());
		}
		
		driver.close();
		

	}

}
