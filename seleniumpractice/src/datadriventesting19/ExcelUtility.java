package datadriventesting19;

import java.io.FileInputStream;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Row;

public class ExcelUtility {
	private HSSFWorkbook workBook;
	private HSSFSheet workSheet;

	// Set the File path and open Excel file
	public ExcelUtility(String path, String sheetName) {
		// Open the Excel file
		try (FileInputStream ExcelFile = new FileInputStream(path)) {
			// Access the excel data sheet
			workBook = new HSSFWorkbook(ExcelFile);
			workSheet = workBook.getSheet(sheetName);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

	public HSSFCell[] findBoundryCells(String tableName) {
		DataFormatter formatter = new DataFormatter();
		// Declare begin position
		String pos = "begin";
		HSSFCell[] boundaryCells = new HSSFCell[2];

		for (Row row : workSheet) {
			for (Cell cell : row) {
				// if (tableName.equals(cell.getStringCellValue())) {
				if (tableName.equals(formatter.formatCellValue(cell))) {
					if (pos.equalsIgnoreCase("begin")) {
						// Find the begin cell, this is used for boundary cells
						boundaryCells[0] = (HSSFCell) cell;
						pos = "end";
					} else {
						// Find the end cell, this is used for boundary cells
						boundaryCells[1] = (HSSFCell) cell;
					}
				}
			}
		}
		// Return the cells array
		return boundaryCells;
	}

	public String[][] getTestData(String tableName) {
		String[][] testData = null;

		try {
			// Handle numbers and strings
			DataFormatter formatter = new DataFormatter();
			// BoundaryCells are the first and the last column
			// We need to find first and last column, so that we know which rows
			// to read for the data
			HSSFCell[] boundaryCells = findBoundryCells(tableName);
			// First cell to start with
			HSSFCell startCell = boundaryCells[0];
			// Last cell where data reading should stop
			HSSFCell endCell = boundaryCells[1];

			// Find the start row based on the start cell
			int startRow = startCell.getRowIndex() + 1;
			// Find the end row based on end cell
			int endRow = endCell.getRowIndex() - 1;
			// Find the start column based on the start cell
			int startCol = startCell.getColumnIndex() + 1;
			// Find the end column based on end cell
			int endCol = endCell.getColumnIndex() - 1;

			// Instantiate multi-dimensional array to capture the data from the
			// table
			testData = new String[endRow - startRow + 1][endCol - startCol + 1];

			for (int i = startRow; i <= endRow; i++) {
				for (int j = startCol; j <= endCol; j++) {
					// testData[i-startRow][j-startCol] =
					// ExcelWSheet.getRow(i).getCell(j).getStringCellValue();
					// For every column in every row, fetch the value of the
					// cell
					Cell cell = workSheet.getRow(i).getCell(j);
					// Capture the value of the cell in the multi-dimensional
					// array
					testData[i - startRow][j - startCol] = formatter.formatCellValue(cell);
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		// Return the multi-dimensional array
		return testData;
	}
}
