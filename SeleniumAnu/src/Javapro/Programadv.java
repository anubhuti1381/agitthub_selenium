package Javapro;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Programadv {
@Test
	public static void main(String[] args) {
		// TODO Auto-generated method stub
          ChromeDriver driver=new ChromeDriver();
         // driver.manage().window().maximize();
          //driver.get("https://www.selenium.dev/downloads/");
          Reporter.log("pass",true);
	}

}
