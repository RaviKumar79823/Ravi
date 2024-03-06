package DataProvider;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.ss.usermodel.Workbook;

public class FetchDataFromExternelFile {
public void fetch() throws FileNotFoundException {
	 File file = new File("C:\\Users\\RAVI KUMAR\\OneDrive\\Desktop\\Testing\\Book1.xlsx");
	FileInputStream fis = new FileInputStream(file);
	Workbook wb = Workbook
}
}
