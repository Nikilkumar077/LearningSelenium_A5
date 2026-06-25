package handlingmultipleelements;

import java.util.List;
import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingWebTable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//nth value
				Scanner sc=new Scanner(System.in);
				System.out.println("enter the row number:");
				int n=sc.nextInt();
		
		
		//open the browser
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		
		//navigating 
		driver.get("https://vinothqaacademy.com/webtable/");
		
		
		//identifying 
		WebElement tabledls = driver.findElement(By.xpath("//table[@id='myTable']//tr[3]/td[2]"));
		System.out.println(tabledls.getText());
		
		
		//all the names
		List<WebElement> allnames = driver.findElements(By.xpath("//table[@id='myTable']//tr/td[2]"));
		//print the text value
		for(int i=0;i<allnames.size();i++)
		{
			System.out.println(allnames.get(i).getText());
		}
		
		
		List<WebElement> alldata = driver.findElements(By.xpath("//table[@id='myTable']//tr["+n+"]/td[2]"));
		
		//vinoth details
		List<WebElement> vdetails = driver.findElements(By.xpath("//table[@id='myTable']//tr[3]/td"));
		//print the text value
		for(int i=0;i<vdetails.size();i++)
		{
			System.out.println(vdetails.get(i).getText());
		}
		
		
		
		
		driver.close();
		
		
		
		

	}

}
