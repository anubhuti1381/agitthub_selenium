package car;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class testcase7 {
	@Test(groups="smoke")
	public void car3() {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.cardekho.com/");

}

}
