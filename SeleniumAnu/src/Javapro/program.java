package Javapro;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class program {
	
	@Test(priority=1)
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
