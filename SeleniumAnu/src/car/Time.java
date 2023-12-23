package car;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Time {
@Test(timeOut=20000)
public void amazon() {
	ChromeDriver driver=new ChromeDriver();
			driver.get("https://www.amazon.in/");

	
}
}
