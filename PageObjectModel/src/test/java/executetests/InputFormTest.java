package executetests;

import org.testng.annotations.Test;

import base.BaseClass;
import pages.InputFormPage;

public class InputFormTest extends BaseClass {
	
	InputFormPage inputformpage;
	
@Test
public void verfiyInputForm() {
	
	inputformpage=new InputFormPage(driver);
	inputformpage.clickOnInputForm();
	inputformpage.clickOnJquerySelect2();
	inputformpage.selectStates("Hawaii");
}
	
	

}
