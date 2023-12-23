package FetchingDataExcel;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Excell {
	public static void main(String[] args) throws IOException {
		
         FileInputStream fis=new FileInputStream("C:\\Users\\anubh\\Downloads\\q_comm_anub.xls.xlsx");
         Workbook w=WorkbookFactory.create(fis);
         String data=w.getSheet("Worksheet").getRow(0).getCell(0).getStringCellValue();
         System.out.println(data);
	}
}
