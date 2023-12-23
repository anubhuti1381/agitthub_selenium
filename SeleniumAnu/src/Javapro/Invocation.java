package Javapro;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Invocation {
 @Test(priority=1,invocationCount=3)
 public void login() {
	 ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");
 }
 @Test(priority=2)
	public void register() {
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.myntra.com/");
}
 @Test(priority=3)
	public void logout() {
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.ajio.com/");
}
}