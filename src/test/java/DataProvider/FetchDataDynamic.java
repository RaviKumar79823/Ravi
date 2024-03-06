package DataProvider;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.sl.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.testng.annotations.Test;

public class FetchDataDynamic {
	@Test
public void basic() throws EncryptedDocumentException, IOException {
	File file = new File("C:\\Users\\RAVI KUMAR\\OneDrive\\Desktop\\Testing\\Book1.xlsx");
	FileInputStream fis = new FileInputStream(file);
	Workbook wb = WorkbookFactory.create(fis);
	org.apache.poi.ss.usermodel.Sheet sheet = wb.getSheet("Sheet1");
	int row = sheet.getPhysicalNumberOfRows();
	int column = sheet.getRow(0).getPhysicalNumberOfCells();
	for (int i = 0; i < row; i++) {
		for(int j = 0 ; j<column ; j++) {
			String s = sheet.getRow(i).getCell(j).toString();
			System.out.println(s);
		}
		
	}
	
	
}
}
