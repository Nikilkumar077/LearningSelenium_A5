package LearningTestNG;

import org.jspecify.annotations.Nullable;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class learnAssertion {
	
	
	@Test
	public void task1() {
		
		String exptitle ="selenium";
		String acttitle ="selenium";
		
		int expwidth =0;
		int actwidth =0;
		
		boolean expdisplaysts =true;
		boolean actdisplaysts =true;
		
		Assert.assertEquals(exptitle, acttitle);
		Assert.assertEquals(expwidth, actwidth);
		Assert.assertEquals(expdisplaysts, actdisplaysts);
		
		
	}
	
	@Test
	public void task2() {
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://saucedemo.com/");
		
		String exptitle="Swag Labs";
		String acttitle = driver.getTitle();
		
		Assert.assertEquals(exptitle, acttitle);
		
		WebElement ele = driver.findElement(By.xpath("//div[contains(text(),'Swag Labs')]"));
		boolean displaysts= ele.isDisplayed();
		
		Assert.assertEquals(displaysts, true);
		Assert.assertTrue(displaysts);
		
		
		int actwidth = ele.getSize().getWidth();
		System.out.println(actwidth);
		int expwidth = actwidth;
		
		Assert.assertEquals(actwidth, expwidth);
		
	}
	
	@Test
	public void task3() {
		
		
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://saucedemo.com/");
		
		SoftAssert asobj = new SoftAssert();
		
		String exptitle="Swag Labs";
		String acttitle = driver.getTitle();
		
		asobj.assertEquals(exptitle, acttitle);
		
		WebElement ele = driver.findElement(By.xpath("//div[contains(text(),'Swag Labs')]"));
		boolean displaysts= ele.isDisplayed();
		
		asobj.assertEquals(displaysts, true);
		asobj.assertTrue(displaysts);
		
		
		int actwidth = ele.getSize().getWidth();
		//System.out.println(actwidth);
		int expwidth = 120;
		
		asobj.assertEquals(actwidth, expwidth);
		
		asobj.assertAll();
	}

}
