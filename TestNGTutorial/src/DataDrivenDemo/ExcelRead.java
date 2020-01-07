package DataDrivenDemo;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelRead {
	

	public static void main(String[] args) throws IOException {
		HSSFWorkbook workBook;
		HSSFSheet workSheet;
		HSSFCell Cell;
		
		String path = "/Users/devkumar/Desktop/Data.xls";
		String sheetName = "Sheet1";
		FileInputStream ExcelFile = new FileInputStream(path);
		workBook = new HSSFWorkbook(ExcelFile);
		workSheet = workBook.getSheet(sheetName);
		
		Cell = workSheet.getRow(1).getCell(1);
		String cellValue = Cell.getStringCellValue();
		System.out.println("Value is: " + cellValue);
	}

}
