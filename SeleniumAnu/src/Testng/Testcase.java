package Testng;

import org.openqa.selenium.By;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Testcase extends Baseclass {
	@Test
	public void cart() {
		Reporter.log("testcase pass",true);
		driver.findElement(By.xpath("//a[contains text()Digitals download]"));
		driver.findElement(By.xpath("//input[@value='Add to cart'] [1]")).click();
		driver.findElement(By.xpath("//span[text()='Shopping cart']")).click();
	}

}
