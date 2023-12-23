package FetchingDataExcel;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataDriverTesting {
	@DataProvider(name="exceldata")
	public Object[][]data(){
		Object [][]d=new Object[2][2];
		d[0][0]="Anubhuti";
	    d[0][1]="Aman@321";
	    d[1][0]="Nikki";
	    d[1][1]="Nikki@456";		
		return d;
	}
	@Test(dataProvider="exceldata")
	public void m1(String user,String password) {
     System.out.println(user);
     System.out.println(password);
}
}