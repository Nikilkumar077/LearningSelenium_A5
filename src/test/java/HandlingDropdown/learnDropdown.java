package HandlingDropdown;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


public class learnDropdown {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//open the browser
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		//navigating
		driver.get("https://www.amazon.in/");
		
		//identifying the element Drop down
		WebElement dropdown = driver.findElement(By.cssSelector("#searchDropdownBox"));
		
		Select selectobj = new  Select(dropdown);
		
		boolean status = selectobj.isMultiple();
		
		if (status) {
			System.out.println("it is multiple select dropdown");
		}
		else
		{
			System.out.println("it is single select dropdown");
			
		}
		
		//selection using index
		
		selectobj.selectByIndex(20);
		
		selectobj.selectByValue("search-alias=mi");
		
		//fetch all options
		List<WebElement> alloptions = selectobj.getOptions();
		
		//print the count
		System.out.println(alloptions.size());
		
		//print all options text value
		for(int i=0;i< alloptions.size();i++)
		{
			System.out.println(alloptions.get(i).getText());
		}
		
		driver.close();
		
		}
		
		
		
		
		}


