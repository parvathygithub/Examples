package utilites;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Utility {
	
	WebDriver driver;

 public Utility (WebDriver driver)
		{
			 this.driver=driver;
			 
		 }
		 public String get_title()
		 {
			 return driver.getTitle();
		 }
		 public List<String>getTextOfElements(String xpath) 
		 {
			 List<String>text=new ArrayList<String>();
			 List<WebElement>elements=driver.findElements(By.xpath(xpath));
			 for(WebElement web:elements)
			 {
				 text.add(web.getText());
			 }
			 return text;
		 }
		}

