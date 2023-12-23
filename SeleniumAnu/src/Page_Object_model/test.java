package Page_Object_model;

import java.io.FileInputStream;
import java.time.Duration;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class test {
	@Test(dataProvider="data")
	public void testcase(String fn,String ln,String em,String ps ) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://demowebshop.tricentis.com/");
		RegisterPage r=new RegisterPage(driver);
		r.getRegisterlink().click();
		Regpage r1= new Regpage(driver);
		r1.getGender().click();
		r1.getFirstnametext().sendKeys(fn);
		r1.getLastname().sendKeys(ln);
		r1.getEmailtext().sendKeys(em);
		r1.getPasswordtext().sendKeys(ps);
		r1.getConfirmpasswordtext().sendKeys(ps);
		r1.getRegistrationbutton().click();
		LoginPage l=new LoginPage(driver);
		l.getLogin();
		l.getEmailid().sendKeys(em);
		l.getPassword().sendKeys(ps);
	}
	@DataProvider(name="data")
	public Object[][]testData(){
	FileInputStream f=new FileInputStream("C:\\Users\\anubh\\OneDrive\\Documents\\Excelhm.xlsx");
	Workbook w=WorkbookFactory.create(f);
	Sheet s=w.getSheet("log");
	int row=s.getPhysicalNumberOfRows();
	int coloumn=s.getRow(0).getPhysicalNumberOfCells();
	Object[][]d=new Object[row][coloumn];
	for(int i=0;i<row;i++) {
		for(int j=0;j<coloumn;j++) {
			d[i][j]=s.getRow(i).getCell(j).toString();
		}
	}
		
		
	

}
