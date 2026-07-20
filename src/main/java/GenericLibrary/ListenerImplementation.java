package GenericLibrary;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.io.FileHandler;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class ListenerImplementation implements ITestListener {
	@Override
	public void onTestFailure(ITestResult result) {
		String methodname = result.getName();
		// TODO Auto-generated method stub
		//steps to capture screenshot
		
		TakesScreenshot ts=(TakesScreenshot) BaseConfig.stdriver;
		File temppath=ts.getScreenshotAs(OutputType.FILE);
		File permpath = new File("./src/test/resources/Testscreenshot/"+methodname+"screenshot.png");
		
		try {
			FileHandler.copy(temppath, permpath);
		} catch (IOException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		System.out.println("screenshot capture");
	}
}
