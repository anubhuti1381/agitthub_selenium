package FetchingDataExcel;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Excelforrowandcolumn {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		FileInputStream fis=new FileInputStream("C:\\Users\\anubh\\OneDrive\\Documents\\Qsp.xlsx");
		Workbook w=WorkbookFactory.create(fis);
		Sheet s=w.getSheet("Qsp");
		int rowsize=s.getPhysicalNumberOfRows();
		int coloumsize=s.getRow(0).getPhysicalNumberOfCells();
		for(int i=0;i<rowsize;i++) {
			for(int j=0;j<coloumsize;j++) {
				String data=w.getSheet("Qsp").getRow(i).getCell(j).toString();
				System.out.print(data+" ");
			}
			System.out.println();
		}
	}

}
