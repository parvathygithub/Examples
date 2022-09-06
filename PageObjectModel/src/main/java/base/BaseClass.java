package base;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	public WebDriver driver;
	
	
	@BeforeMethod
	public void Beforemethod()	{
				
	      WebDriverManager.chromedriver().setup();
		  driver=new ChromeDriver();
		  driver.get("https://selenium.obsqurazone.com/index.php");
		  driver.manage().window().maximize();
		  driver.manage().timeouts().implicitlyWait(3,TimeUnit.SECONDS);
				     
		}
	@AfterMethod
public void afterMethod() {
		
	}
	

}
