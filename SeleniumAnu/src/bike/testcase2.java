package bike;

import java.sql.Driver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class testcase2 {
	@Test(groups="smoke")
	public void bike1() {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.heromotocorp.com/en-in.html");
	}

}
