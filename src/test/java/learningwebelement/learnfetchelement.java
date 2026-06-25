package learningwebelement;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class learnfetchelement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.saucedemo.com/");
		
		//identify
		WebElement element=driver.findElement(By.xpath("//div[contains(text(),'Swag Labs')]"));
		
	
		
		if(element.isDisplayed())
		{
			System.out.println("text is displayed");
		}
		else
		{
			System.out.println("text is not displayed");
		}
		
		//validate
		
		String actualtextvalue=element.getText();
		System.out.println(actualtextvalue);
		String exptxtvalue="Swag labs";
		if(actualtextvalue.equals(exptxtvalue))
		{
			System.out.println("exptxtvalue and actualtextvalue are same");
		}else
		{
			System.out.println("exptxtvalue and actualtextvalue are not same");
		}
		
		String actualtagname=element.getTagName();
		System.out.println(actualtagname);
		String exptagname="div";
		if(actualtagname.equals(exptagname))
		{
			System.out.println("exptagname and actualtagname are same");
		}else
		{
			System.out.println("exptagname and actualtagname are not same");
		}

		String actualattribute=element.getAttribute("class");
		System.out.println(actualattribute);
		String expattribute="login_logo";
		if(actualattribute.equals(expattribute))
		{
			System.out.println("expattribute and actualattribute are same");
		}else
		{
			System.out.println("expattribute and actualattribute are not same");
		}
		
		String actualcssproperty=element.getCssValue("font-family");
		System.out.println(actualcssproperty);
		String expcssproperty=" DM Mono";
		if(actualcssproperty.equals(expcssproperty))
		{
			System.out.println("expcssproperty and actualcssproperty are same");
		}else
		{
			System.out.println("expcssproperty and actualcssproperty are not same");
		}
		
		
		Dimension actualsize=element.getSize();
		int actualwidth=actualsize.getWidth();
		int actualheight=actualsize.getHeight();
		
		int expwidth=100;
		int expheight=100;
		
		if(actualwidth==expwidth && actualheight==expheight)
		{
			System.out.println("size are saame");
		}else
		{
			System.out.println("size are not same");
		}
		
		System.out.println(actualsize);
		System.out.println(actualwidth);
		System.out.println(actualheight);
		
		Point actuallocation=element.getLocation();
		int actualx=actuallocation.getX();
		int actualy=actuallocation.getY();
		
		int expx=0;
		int expy=0;
		
		if(actualx==expx && actualy==expy)
		{
			System.out.println("location are saame");
		}else
		{
			System.out.println("location are not same");
		}
		System.out.println(actuallocation);
		System.out.println(actualx);
		System.out.println(actualy);
		
		
		driver.close();
		
		
		
		

	}

}
