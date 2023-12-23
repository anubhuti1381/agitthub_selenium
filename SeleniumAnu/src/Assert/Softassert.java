package Assert;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Softassert {
	@Test
	public void testcase() {
		ChromeDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		String Expected="https://demowebshop.tricentis.com/";
		String Beforereg=driver.findElement(By.linkText("Register")).getText();
		driver.findElement(By.linkText("Register")).click();
		driver.findElement(By.id("gender-male")).click();
		driver.findElement(By.id("FirstName")).sendKeys("ayan");
		driver.findElement(By.id("LastName")).sendKeys("sur");
		driver.findElement(By.id("Email")).sendKeys("ayansur321@gmail.com");
		driver.findElement(By.id("Password")).sendKeys("ayansur");
		driver.findElement(By.id("ConfirmPassword")).sendKeys("ayansur");
		driver.findElement(By.id("register-button")).click();
		String Afterreg=driver.findElement(By.xpath("//a[text()='ayansur321@gmail.com']")).getText();
		Assert.assertNotEquals(Beforereg,Afterreg);
		
		
	}

}
