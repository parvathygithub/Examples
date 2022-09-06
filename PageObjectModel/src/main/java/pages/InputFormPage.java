package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class InputFormPage {
	
	WebDriver driver;
	
	@FindBy(xpath = "(//a[@href='simple-form-demo.php'])[1]")
	WebElement inputForm;
	@FindBy(xpath = "//a[@href='jquery-select.php']")
	WebElement jQuerySelect2;
	@FindBy(xpath = "//span[text()='Alaska']")
	WebElement selectClick;
	@FindBy(xpath = "//input[@class='select2-search__field']")
	WebElement send;
	
public  InputFormPage(WebDriver driver) {
	
	this.driver=driver;
	
	PageFactory.initElements(driver, this);	
	
	
}
public void clickOnInputForm() {
	
        inputForm.click();
	
	
}
public void clickOnJquerySelect2() {
	
	jQuerySelect2.click();
	
		
	
}

public void selectStates(String state) {
	
	
	selectClick.click();
	send.sendKeys("Hawaii");
	driver.findElement(By.xpath("//li[text()='"+state+"']")).click();
	
		
	}
	
	
}
	


	

