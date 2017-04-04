package excelReadWritePkg;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class POI_Reading_Excel_Main {

	public void readExcel(String filePath, String fileName, String sheetName)
			throws IOException {

		// Create a object of File class to open xlsx file
		File file = new File(filePath + "\\" + fileName);

		// Create an object of FileInputStream class to read excel file
		FileInputStream inputStream = new FileInputStream(file);

		Workbook ObjWorkbook = null;
		
		// Find the file extension by spliting file name in substring and
		// getting only extension name
		String fileExtensionName = fileName.substring(fileName.indexOf("."));

		// Check condition if the file is xlsx file
		if (fileExtensionName.equals(".xlsx")) {
			// If it is xlsx file then create object of XSSFWorkbook class
			ObjWorkbook = new XSSFWorkbook(inputStream);
		}

		// Check condition if the file is xls file
		else if (fileExtensionName.equals(".xls")) {
			// If it is xls file then create object of XSSFWorkbook class
			ObjWorkbook = new HSSFWorkbook(inputStream);
		}

		// Read sheet inside the workbook by its name
		Sheet OBJSheet = ObjWorkbook.getSheet(sheetName);

		// Find number of rows in excel file
		int rowCount = OBJSheet.getLastRowNum() - OBJSheet.getFirstRowNum();

		// Create a loop over all the rows of excel file to read it
		for (int i = 0; i < rowCount + 1; i++) {

			Row row = OBJSheet.getRow(i);

			// Create a loop to print cell values in a row
			for (int j = 0; j < row.getLastCellNum(); j++) {

				// Print excel data in console
				System.out.print(row.getCell(j).getStringCellValue() + "|| ");
			}

			System.out.println();
		}
	}

	// Main function is calling readExcel function to read data from excel file
	public static void main(String[] args) throws IOException {

		// Create a object of ReadGuru99ExcelFile class
		POI_Reading_Excel_Main objExcelFile = new POI_Reading_Excel_Main();

		// Prepare the path of excel file
		String filePath = System.getProperty("user.dir") + "\\src\\excelReadWritePkg";

		// Call read file method of the class to read data
		objExcelFile.readExcel(filePath, "ExportExcel.xlsx", "Sheet1");

	}

}
