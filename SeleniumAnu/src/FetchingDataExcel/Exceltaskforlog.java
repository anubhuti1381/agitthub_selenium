package FetchingDataExcel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Exceltaskforlog {
         @Test(dataProvider="loginTest")
	public void TestLogin() throws Exception {
		// TODO Auto-generated method stub
        	 WebDriver driver=new ChromeDriver();
        	 driver.manage().window().maximize();
        	 driver.get("https://demowebshop.tricentis.com/");
        	 driver.findElement(By.id("Email'")).sendKeys("Login");
        	 driver.findElement(By.id("Password")).sendKeys("Password");
        	 driver.findElement(By.className("button-1 login-button")).click();
        	 Thread.sleep(3000);
        	 driver.quit();
         
          
	}
         @DataProvider(name="TestLogin")
         public Object[][]loginData(){
        	 Object[][]data=new Object[10][2];
        	 data[0][0]="Email";
        	 data[0][1]="Password";
        	 
        	 data[1][0]="ayansur321@gmail.com";
        	 data[1][1]="ayansur";
        	 
        	 data[2][0]="aman20@gmail.com";
        	 data[2][1]="amankumar";
        	 
        	 data[3][0]="anu78@gmail.com";
        	 data[3][1]="anukumari";
        	 
        	 data[4][0]="nikki754@gmail.com";
        	 data[4][1]="nikkikumari";
        	 
        	 data[5][0]="neelugcw34@gmail.com";
        	 data[5][1]="neelugcw";
        	 
        	 data[6][0]="rajesh901@gmail.com";
        	 data[6][1]="rajeshkr";
        	 
        	 data[7][0]="nikki301@gmail.com";
        	 data[7][1]="nikitaba";
        	 
        	 data[8][0]="rohit54@gmail.com";
        	 data[8][1]="rohits";
        	 
        	 data[9][0]="umabharti121@gmail.com";
        	 data[9][1]="umacol";
        	 		
			return data;
         

}
}