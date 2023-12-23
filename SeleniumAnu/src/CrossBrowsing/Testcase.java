package CrossBrowsing;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class Testcase extends Baseclass {
	@Test
	public void Testcase1() {
		driver.findElement(By.linkText("Log in")).click();
		driver.findElement(By.id("Email")).sendKeys("ayansur321@gmail.com");
		driver.findElement(By.id("Password")).sendKeys("ayansur");
		driver.findElement(By.xpath("//input[@class='button-1 login-button']")).click();
		driver.findElement(By.xpath("//a[text()='Log out']")).click();

	}

}
