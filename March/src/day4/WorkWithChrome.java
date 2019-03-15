package day4;

import org.openqa.selenium.chrome.ChromeDriver;

public class WorkWithChrome {
	
	ChromeDriver driver;
	
	
	public void invokeBrowser(){
		
		System.setProperty("webdriver.chrome.driver",
				"D:/gopal/workspace/chromedriver_win32/chromedriver.exe");
		driver = new ChromeDriver();
driver.manage().window().maximize();

driver.manage().deleteAllCookies();

driver.get("http://facebook.com");
	}

	public String getTitle()
	{
		
		return driver.getTitle();
	}

public void navigateCommands()
{
	
	driver.navigate().to("http://qatechhub.com");
	driver.navigate().back();
	driver.navigate().forward();
	driver.navigate().refresh();
}
	
public void closeBrowser()
{
//driver.close();
// will 	close current active window

driver.quit();
// will quit all the windows opened by selenium

}		

	}

