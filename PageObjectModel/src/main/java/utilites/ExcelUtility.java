package utilites;

import java.io.File;
import java.io.FileInputStream;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelUtility {
	
	
	XSSFSheet sheet;
	XSSFWorkbook workbook;
	
	XSSFRow row;
	XSSFCell cell;
	
		
public void printData(String sheetName,int rowNo,int columnNo) {
	
 	String path="C:\\Users\\Win10\\Desktop\\Excel\\Automation.xlsx";
	
	try {
		File src = new File(path);
		FileInputStream fi = new FileInputStream(src);	
		workbook = new XSSFWorkbook(fi);
		sheet = workbook.getSheet(sheetName);
		row = sheet.getRow(rowNo);
		cell = row.getCell(columnNo);
		System.out.println(cell.getStringCellValue());
		
	} catch (Exception e) {
		e.printStackTrace();
	}
	
}
public static void main(String args[]) {
	ExcelUtility obj=new ExcelUtility() ;
	obj.printData("Names", 0, 1);
}
}

