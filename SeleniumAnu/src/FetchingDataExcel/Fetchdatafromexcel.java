package FetchingDataExcel;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Fetchdatafromexcel {
      @DataProvider(name="exceldata")
      public Object[][]data() throws EncryptedDocumentException, IOException{
  	FileInputStream fis=new FileInputStream("C:\\Users\\anubh\\OneDrive\\Documents\\Qsp.xlsx");
		Workbook w=WorkbookFactory.create(fis);	
		Sheet s=w.getSheet("Qsp");
		int row=s.getPhysicalNumberOfRows();
		int coloum=s.getRow(0).getPhysicalNumberOfCells();
		Object[][]d=new Object[row-1][coloum];
		for(int i=0;i<row-1;i++) {
			for(int j=0;j<coloum;j++) {
				d[i][j]=s.getRow(i+1).getCell(j).toString();
			}
		}
		return d;
	}


@Test(dataProvider = "exceldata")
public void reciever(String s1,String s2)
{
	System.out.println(s1);
	System.out.println(s2);
}
	
}
