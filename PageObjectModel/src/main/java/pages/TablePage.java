package pages;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilites.Utility;

public class TablePage {
	
	
 WebDriver driver;
 Utility utility;
	 
	@FindBy (xpath = "(//a[@class='nav-link'])[4]")
	WebElement Tablee;


	//@FindBy(xpath = "//a[text()='Table with Pagination']")
	//WebElement Tablepagination;
	public TablePage(WebDriver driver)
	{
	this.driver=driver;
	PageFactory.initElements( driver,this);
	}

	public void clicktable()
	{
		Tablee.click();
	}
	public String getPersonsOffice(String personsName)
	{
		int i;
		utility=new Utility(driver);
		List<String>name=new ArrayList<String>();
		name=utility.getTextOfElements("//table//tbody//tr//td[1]");
		System.out.println(name);
		for(i=0;i<name.size();i++) {
		if( personsName.equals(name.get(i))){
			break;
		}
		
			//System.out.println(name.get(i));
		}
		
		return driver.findElement(By.xpath("//tr["+(i+1)+"]//td[3]")).getText();
		
	}
public String getPersonsData(String personsName,int n) {
	
	int i;
	utility=new Utility(driver);
	List<String>name=new ArrayList<String>();
	name=utility.getTextOfElements("//table//tbody//tr//td[1]");
	//System.out.println(name);
	for(i=0;i<name.size();i++) {
	if( personsName.equals(name.get(i))){
		break;
	}
	
		//System.out.println(name.get(i));
	}
	return driver.findElement(By.xpath("//tr["+(i+1)+"]//td["+n+"]")).getText();
	
}
}


