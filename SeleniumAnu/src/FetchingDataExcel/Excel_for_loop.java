package FetchingDataExcel;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Excel_for_loop {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		FileInputStream fis=new FileInputStream("C:\\Users\\anubh\\OneDrive\\Documents\\Qsp.xlsx");
        Workbook w=WorkbookFactory.create(fis);
        for(int i=0;i<=4;i++)
        {
        	for(int j=0;j<=1;j++)
        		
        	{
        		String data=w.getSheet("Qsp").getRow(i).getCell(j).getStringCellValue();
        		System.out.println(data);
        	}
        }
	}

}
