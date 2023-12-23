package FetchingDataExcel;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Exceltask {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
           FileInputStream fis=new FileInputStream("C:\\Users\\anubh\\OneDrive\\Documents\\Excelhm.xlsx");
           Workbook w=WorkbookFactory.create(fis);
           Sheet s=w.getSheet("Reg");
           int row=s.getPhysicalNumberOfRows();
           int coloum=s.getRow(0).getPhysicalNumberOfCells();
           for(int i=0;i<row;i++) {
        	   for(int j=0;j<coloum;j++) {
        		  System.out.println(s.getRow(i).getCell(j).getStringCellValue());
        	   }
        	   System.out.println();
           }
           w.close();
           fis.close();
	}

}
