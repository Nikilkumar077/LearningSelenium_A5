package learnWebDriver;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class browsernavigaton {

	public static void main(String[] args) throws MalformedURLException {
		// TODO Auto-generated method stub
		WebDriver driver= new ChromeDriver();
		
		driver.manage().window().maximize();
		
		
		driver.navigate().to("https://online.kfc.co.in");
		driver.navigate().to(new URL("https://www.meesho.com/"));
		
		
		driver.navigate().back();
		driver.navigate().forward();
		driver.navigate().refresh();

	}

}
