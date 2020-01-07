package datadriventesting19;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;

public class ExcelRead {

	public static void main(String[] args) {
		HSSFWorkbook workBook;
		HSSFSheet workSheet;
		HSSFCell cell;
		
		String filePath = "//Users//devkumar//Documents//Workspace//ExcelRead.xls";
		
		try(FileInputStream fileInput = new FileInputStream(filePath)){
			workBook = new HSSFWorkbook(fileInput);
			workSheet = workBook.getSheet("Sheet1");
			cell = workSheet.getRow(1).getCell(2);
			String cellData = cell.getStringCellValue();
			System.out.println(cellData);	
		}
		catch(IOException e){
			System.out.println(e.getMessage());
		}
	}
}
