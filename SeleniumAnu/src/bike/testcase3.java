package bike;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class testcase3 {
	@Test(dependsOnGroups = "smoke")
	public void bike1() {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.honda2wheelersindia.com/");

}
}