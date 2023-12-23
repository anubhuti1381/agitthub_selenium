package bike;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class testcase4 {
	@Test(groups="smoke")
	public void bike1() {
		WebDriver driver=new ChromeDriver();
		driver.get("https://store.royalenfield.com/en");

}

}
