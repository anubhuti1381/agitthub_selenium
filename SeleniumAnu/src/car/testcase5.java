package car;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class testcase5 {
	@Test(groups="smoke")
	public void car1() {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.marutisuzuki.com/alto");

}
}