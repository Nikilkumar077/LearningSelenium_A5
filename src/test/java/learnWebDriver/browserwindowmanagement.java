package learnWebDriver;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class browserwindowmanagement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().window().minimize();
		driver.manage().window().fullscreen();
		System.out.println(driver.manage().window().getSize());
		driver.manage().window().setSize(new Dimension(300,300));
		System.out.println(driver.manage().window().getPosition());
		driver.manage().window().setPosition(new Point(0,200));


		
	}

}
