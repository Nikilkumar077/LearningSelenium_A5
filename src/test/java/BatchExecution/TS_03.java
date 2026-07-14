package BatchExecution;

import org.openqa.selenium.By;
import org.testng.Reporter;
import org.testng.annotations.Test;

import GenericLibrary.BaseConfig;

public class TS_03 extends BaseConfig {

	
	@Test
	public void createproduct() {
		Reporter.log("createproduct",true);
		driver.findElement(By.xpath("//a[@href='index.php?module=Products&action=index']")).click();
	}
}
