package HandlingJScode;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class learnJScode {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		//steps to use js code
		
		//step 1
		JavascriptExecutor jseobj=(JavascriptExecutor) driver;
		
		//step 2 and 3
		jseobj.executeScript("window.location =arguments[0]", "https://automationexercise.com/#google_vignette");
		
		//refresh
		jseobj.executeScript("history.go(0)");
		
		//fetching title
		System.out.println(jseobj.executeScript("return document.title"));
		
		//fetching URL
		System.out.println(jseobj.executeScript("return document.URL"));
		
		
		jseobj.executeScript("arguments[0].click()",driver.findElement(By.partialLinkText("Log")));
		
		jseobj.executeScript("arguments[0].value='nikil'",driver.findElement(By.name("name")));
		
		
		jseobj.executeScript("arguments[0].value='nikil123@gmail.com'",driver.findElement(By.xpath("//input[@data-qa='signup-email']")));
		
		jseobj.executeScript("arguments[0].click()",driver.findElement(By.xpath("//button[text()='Signup']")));
		
		jseobj.executeScript("arguments[0].value='deinanba123@gmail.com'",driver.findElement(By.id("email")));
		
		jseobj.executeScript("arguments[0].ScrollIntoView(true)",driver.findElement(By.xpath("//h2/b[text()='Address Information']")));
		
		//Note:it will consider previous point for scrolling.
		jseobj.executeScript("window.ScrollBy(0,500)");
		
		//Note:it will consider origin point for scrolling.
		jseobj.executeScript("window.ScrollTo(0,500)");
		
		
		
	}

}
