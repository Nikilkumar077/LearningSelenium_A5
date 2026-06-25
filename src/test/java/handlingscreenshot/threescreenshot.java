package handlingscreenshot;

import java.io.File;
		import java.io.IOException;
		import java.text.SimpleDateFormat;
		import java.util.Date;

		import org.openqa.selenium.By;
		import org.openqa.selenium.OutputType;
		import org.openqa.selenium.TakesScreenshot;
		import org.openqa.selenium.WebDriver;
		import org.openqa.selenium.WebElement;
		import org.openqa.selenium.chrome.ChromeDriver;
		import org.openqa.selenium.io.FileHandler;

		public class threescreenshot {
			
			
			public static void main(String[] args) throws InterruptedException,IOException {
				
				WebDriver driver=new ChromeDriver();
				driver.manage().window().maximize();
				driver.get("https://automationexercise.com/");
				
				
				//home page
				
				System.out.println("Home page title name: "+driver.getTitle());
				
                //custom time stamp
				
				SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd-hh-mm-ss");
				String Customtime=sdf.format(new Date());
				
				//Screenshot
				
				TakesScreenshot ts=(TakesScreenshot) driver;
				File temppath=ts.getScreenshotAs(OutputType.FILE);
				File permpath = new File("./src/test/resources/Testscreenshot/screenshot1"+Customtime+".png");
				FileHandler.copy(temppath, permpath);
				
				
				WebElement loginlink = driver.findElement(By.xpath("//a[contains(text(),' Signup / Login')]"));
				if(loginlink.isDisplayed() && loginlink.isEnabled())
				{
					System.out.println("displayed and enabled");
				}
				else {
					System.out.println("not displayed and not enabled");
				}
				loginlink.click(); 
				
				
				
				//login page
				System.out.println("login page title name: "+driver.getTitle());
				
				//identify username
				WebElement untxtfld =driver.findElement(By.xpath("//input[@name='name']"));
				//validate username
				if(untxtfld.isDisplayed() && untxtfld.isEnabled())
				{
					System.out.println("displayed and enabled");
				}
				else {
					System.out.println("not displayed and not enabled");
				}
				untxtfld.sendKeys("nikil");
				
				//identify email
				WebElement email=driver.findElement(By.xpath("//input[@data-qa='signup-email']"));
				//validate email
				if(email.isDisplayed() && email.isEnabled())
				{
					System.out.println("displayed and enabled");
				}
				else {
					System.out.println("not displayed and not enabled");
				}
				email.sendKeys("nikilpm27@gmail.com");
				
				//identify login
				WebElement login=driver.findElement(By.xpath("//button[contains(text(),'Signup')]"));
				//validate login
				if(login.isDisplayed() && login.isEnabled())
				{
					System.out.println("displayed and enabled");
				}
				else {
					System.out.println("not displayed and not enabled");
				}
				login.click();
				
                 //custom time stamp
				
				SimpleDateFormat sdf1=new SimpleDateFormat("yyyy-MM-dd-hh-mm-ss");
				String Customtime1=sdf1.format(new Date());
				
				//Screenshot
				
				TakesScreenshot ts1=(TakesScreenshot) driver;
				File temppath1=ts1.getScreenshotAs(OutputType.FILE);
				File permpath1 = new File("./src/test/resources/Testscreenshot/screenshot2"+Customtime1+".png");
				FileHandler.copy(temppath, permpath);
				
				
				//Account page
				System.out.println("Account page title name: "+driver.getTitle());
				
				//identify radiobtn
				WebElement radiobtn=driver.findElement(By.xpath("//input[@id='id_gender1']"));
				radiobtn.click();
				//validate radiobtn
				if(radiobtn.isDisplayed() && radiobtn.isEnabled())
				{
					System.out.println("displayed and enabled");
				}
				else {
					System.out.println("not displayed and not enabled");
				}
				
				if(radiobtn.isSelected())
				{
					System.out.println("radiobtn selected");
				}
				else {
					System.out.println("radiobtn not selected");
				}
				
				
				
				//identify name
				WebElement ausername=driver.findElement(By.xpath("//input[@id='name']"));
				//validate 
				if(ausername.isDisplayed() && ausername.isEnabled())
				{
					System.out.println("displayed and enabled");
				}
				else {
					System.out.println("not displayed and not enabled");
				}
				ausername.sendKeys("nikil");
				
				
						
				//identify mail
				WebElement mailfld=driver.findElement(By.xpath("//input[@id='email']"));
				//validate mail
				if(mailfld.isDisplayed() && mailfld.isEnabled())
				{
					System.out.println("displayed and enabled");
				}
				else {
					System.out.println("not displayed and not enabled");
				}
				
				//identify password
				WebElement apassword=driver.findElement(By.xpath("//input[@data-qa='password']"));
				//validate
				if(apassword.isDisplayed() && apassword.isEnabled())
				{
					System.out.println("displayed and enabled");
				}
				else {
					System.out.println("not displayed and not enabled");
				}
				apassword.sendKeys("1234567");
				
				
				//custom time stamp
				
				SimpleDateFormat sdf2=new SimpleDateFormat("yyyy-MM-dd-hh-mm-ss");
				String Customtime2=sdf1.format(new Date());
				
				//Screenshot
				
				TakesScreenshot ts2=(TakesScreenshot) driver;
				File temppath2=ts1.getScreenshotAs(OutputType.FILE);
				File permpath2 = new File("./src/test/resources/Testscreenshot/screenshot1"+Customtime2+".png");
				FileHandler.copy(temppath1, permpath1);
				
				driver.close();
				
				
				
			}
			



	}


