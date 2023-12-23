package FetchingDataExcel;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Exceltaskforlogin {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		FileInputStream fis=new FileInputStream("C:\\Users\\anubh\\OneDrive\\Documents\\Excelhm.xlsx");
		Workbook w=WorkbookFactory.create(fis);
		Sheet s=w.getSheet("login");
		int row=s.getPhysicalNumberOfRows();
		int coloum=s.getRow(0).getPhysicalNumberOfCells();
	}

}
