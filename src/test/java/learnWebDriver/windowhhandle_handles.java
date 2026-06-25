package learnWebDriver;

import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class windowhhandle_handles {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.selenium.dev/");
		
		String parentaddress=driver.getWindowHandle();
		System.out.println("parentaddress");
		
		driver.navigate().refresh();
		
		driver.switchTo().newWindow(WindowType.WINDOW);
		driver.navigate().to("https://chatgpt.com/");
		
		Set<String>alladdress=driver.getWindowHandles();
		System.out.println(alladdress);
		
		driver.quit();
		

	}

}
