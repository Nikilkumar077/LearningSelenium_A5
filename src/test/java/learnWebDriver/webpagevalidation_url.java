package learnWebDriver;

import java.net.http.WebSocket;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class webpagevalidation_url {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//step1:open the browser
	WebDriver driver= new ChromeDriver();
	
		//step2:nav to app via url
	driver.get("https://www.Selenium.dev/");
	
		//step3:give expected url
	String exp_url="https://www.selenium.dev/";
	
		//step4:give actual url
	String act_url=driver.getCurrentUrl();
	
		//step5:compare the exp_url with act_url
	if(exp_url.equals(act_url))
	{
		System.out.println("url verified_pass "+act_url);
		}
	else
	{
		System.out.println("url verified_fail "+act_url);
	}
	
		//step 6:close the browser
	driver.close();
	}
}
