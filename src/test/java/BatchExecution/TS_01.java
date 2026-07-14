package BatchExecution;

import org.openqa.selenium.By;
import org.testng.Reporter;
import org.testng.annotations.Test;

import GenericLibrary.BaseConfig;

public class TS_01 extends BaseConfig{	
	
	@Test
	public void create() {
		Reporter.log("Createorg",true);
		driver.findElement(By.xpath("//a[@href='index.php?module=Accounts&action=index']")).click();
	}
}
