package testpackage;

import java.io.FileInputStream;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;

public class ExcelRead {
	public static void main(String[] args) {
	HSSFWorkbook ExcelWBook;
	HSSFSheet ExcelWSheet;
	HSSFCell Cell;
	
	String path = "//Users//devkumar//Documents//ExcelRead.xls";
	String sheetName = "Sheet1";

	try {
		FileInputStream ExcelFile = new FileInputStream(path);
		ExcelWBook = new HSSFWorkbook(ExcelFile);
		ExcelWSheet = ExcelWBook.getSheet(sheetName);
		
		Cell = ExcelWSheet.getRow(2).getCell(2);
		String cellData = Cell.getStringCellValue();
		System.out.println("Cell Data: " + cellData);
	
	}catch (Exception e) {
		e.printStackTrace();
	
	}
}
}