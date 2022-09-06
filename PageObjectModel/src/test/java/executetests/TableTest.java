package executetests;

import org.testng.annotations.Test;

import base.BaseClass;
import pages.TablePage;

public class TableTest extends BaseClass {

		TablePage tablepage;

		@Test
		public void verifyPersonsOffice()
		{ 
			tablepage=new TablePage(driver);
			tablepage.clicktable();
		String text=tablepage.getPersonsOffice("Cedric Kelly");
		System.out.println(text);
		}
			
		@Test
		public void verifyTextNames()
		{
			tablepage=new TablePage(driver);
			tablepage.clicktable();
			String text=tablepage.getPersonsData("Rhona Davidson",3);
			System.out.println(text);	
		}
		}


