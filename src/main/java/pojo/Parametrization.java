package pojo;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;

import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Parametrization {

	public static String getData(String sheetName, int row, int cell) throws EncryptedDocumentException, IOException {

		FileInputStream file = new FileInputStream("C:\\Software Testing Arise\\Automation Projects\\Calculator\\src\\test\\resources\\TestCaseData.xlsx");
		return WorkbookFactory.create(file).getSheet(sheetName).getRow(row).getCell(cell).getStringCellValue();
	}

}
