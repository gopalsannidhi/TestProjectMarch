package day4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Guru99Project {

ChromeDriver driver;
	
	
	public void invokeBrowser(){
		
		System.setProperty("webdriver.chrome.driver",
				"D:/gopal/workspace/chromedriver_win32/chromedriver.exe");
		driver = new ChromeDriver();
driver.manage().window().maximize();

driver.manage().deleteAllCookies();

driver.get("http://demo.guru99.com/v4/");
	}

	public void login(String userId, String password)
	{
		
		
	WebElement userIdbox = driver.findElement(By.name("uid"));
	
	userIdbox.sendKeys(userId);
	
	WebElement password1 = driver.findElement(By.name("password"));
	password1.sendKeys(password);
	
	driver.findElement(By.name("btnLogin")).click();
	
	
	}
	}
	
