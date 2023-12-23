package TestngLisner;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
@Listeners(ListnerImplementation.class)
public class Testcase {
	@Test
	public void testcase() {
	
	ChromeDriver driver=new ChromeDriver();
	driver.get("https://demowebshop.tricentis.com/");
	driver.findElement(By.linkText("Log in")).click();
	driver.findElement(By.id("Email")).sendKeys("ayansur321@gmail.com");
	driver.findElement(By.id("Password")).sendKeys("ayansur");
	driver.findElement(By.xpath("//input[@class='button-1 login-button']")).click();
	driver.findElement(By.xpath("//a[text()='Log out']")).click();
	
    
     
   
     
     
     
}
}