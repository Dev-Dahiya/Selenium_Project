package DataDrivenDemo;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadingExcelFile {

	public static void main(String[] args) throws IOException {
		HSSFWorkbook workBook;
		HSSFSheet workSheet;
		HSSFCell cell;

		String path = "/Users/devkumar/Documents/workspace/TestNGTutorial/src/utilities/ExcelRead.xls";
		String sheetName = "sheet1";
		
		FileInputStream excelFile = new FileInputStream(path);
		workBook = new HSSFWorkbook(excelFile);
		workSheet = workBook.getSheet(sheetName);
		
		cell = workSheet.getRow(2).getCell(2);
		String cellValue = cell.getStringCellValue();
		System.out.println("Cell Data: " + cellValue);
	}

}
