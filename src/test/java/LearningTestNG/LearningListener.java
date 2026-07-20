package LearningTestNG;

import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import GenericLibrary.BaseConfig;

@Listeners(GenericLibrary.ListenerImplementation.class)
public class LearningListener extends BaseConfig {
	@Test
	public void demo() {
		String exptitle="";
		String acttitle=driver.getTitle();
		Assert.assertEquals(acttitle, exptitle);
	}

}
