package HandlingDropdown;

import java.time.Duration;
import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class LearnMultipledropdown {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		//open the browser
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		//waiting stmt
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		
		//navigating to the webpage
		driver.get("file:///C:/Users/USER/Downloads/EmbededWebpage.html");
		
		
		//identifying the dropdown
		
		
		WebElement dropdown2 = driver.findElement(By.cssSelector("select[name='country2']"));
		
		Select selectobj = new Select(dropdown2);
		
		boolean status = selectobj.isMultiple();
		
		if (status) {
			System.out.println("It is multiple dropdown");
		} else {
			System.out.println("It is single dropdown");

		}
		
		System.out.println("--------------------------------------------------------------");
		
		List<WebElement> options = selectobj.getOptions();
		
		System.out.println(options.size());
		
		
		
		for(WebElement list:options) {
			
			System.out.println(list.getText());
		}
		
		
		//performing selection
		selectobj.selectByIndex(2);
		
		selectobj.selectByValue("swiss");
		
		selectobj.selectByVisibleText("CANADA");
		
		selectobj.selectByContainsVisibleText("INDIA");
		
		
	
		
		System.out.println("-------------------------------------------------------------------");
		 
		 
		 
		 //fetching values
		 WebElement firstoption = selectobj.getFirstSelectedOption();
		 
		 System.out.println("the first option is :" + firstoption.getText());
		 
		 System.out.println("-------------------------------------------------------------------");
		  
		 List<WebElement> Alloptions = selectobj.getAllSelectedOptions();
		  
		 for(WebElement alllist:Alloptions) {
	        	
	        	System.out.println(alllist.getText());
	        	
	        }
		 
		 System.out.println("-------------------------------------------------------------------");
		 
		 WebElement wrapper = selectobj.getWrappedElement();
		 
		 System.out.println(wrapper.getText());
		 
		 System.out.println("-------------------------------------------------------------------");
		 
		 
		 //performing deselection
		 selectobj.deselectByIndex(3);
			
		 selectobj.deselectByValue("swiss");
			
		 selectobj.deselectByVisibleText("CANADA");
			
		 selectobj.deSelectByContainsVisibleText("INDIA");
		 
		 
		driver.close();
		

	}

}
