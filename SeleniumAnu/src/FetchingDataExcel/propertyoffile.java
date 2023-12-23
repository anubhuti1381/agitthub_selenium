package FetchingDataExcel;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class propertyoffile {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
          FileInputStream fis=new FileInputStream("C:\\Users\\anubh\\eclipse-workspace\\SeleniumAnu\\anuexcel\\Excel.property\\data.properties");
          Properties p=new Properties();
          p.load(fis);
          String url=p.getProperty("url");
          System.out.println(url);
          
	}

}
