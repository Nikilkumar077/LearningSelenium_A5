package BatchExecution;

import org.openqa.selenium.By;
import org.testng.Reporter;
import org.testng.annotations.Test;

import GenericLibrary.BaseConfig;

public class TS_02 extends BaseConfig {

	
	@Test
	public void createcontact() {
		Reporter.log("createcontact",true);
		driver.findElement(By.xpath("//a[@href='index.php?module=Contacts&action=index']")).click();
	}
	
}
