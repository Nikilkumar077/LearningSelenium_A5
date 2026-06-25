package learnWebDriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class webpagevalidation_title {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.Selenium.dev/");
		
		String  exp_title="Selenium";
		String act_title=driver.getTitle();
		
		
		if(exp_title.equals(act_title))
		{
			System.out.println("title verified_pass "+ act_title);
		}
		else
		{
			System.out.println("title verified_fail "+ act_title);
		}
	}

}
