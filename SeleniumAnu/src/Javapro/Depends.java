package Javapro;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Depends {
	@Test(dependsOnMethods="register")
	 public void login() {
		 ChromeDriver driver=new ChromeDriver();
			driver.get("https://www.amazon.in/");
			
	 }
	 @Test(priority=1)
		public void register() {
			ChromeDriver driver=new ChromeDriver();
			driver.get("https://demowebshop.tricentis.com/");
			driver.findElement(By.linkText("Registerabcd")).click();
	}
	 @Test(priority=3)
		public void logout() {
			ChromeDriver driver=new ChromeDriver();
			driver.get("https://www.ajio.com/");
	}

}
