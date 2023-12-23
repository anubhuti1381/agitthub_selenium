package Javapro;

import java.sql.Driver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Taskdemo {
	@Test()
	public void register() {
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://demowebshop.tricentis.com/");
		driver.findElement(By.linkText("Register")).click();
		WebElement gender=driver.findElement(By.id("gender-female"));
		gender.click();
	    
		WebElement firstname=driver.findElement(By.id("FirstName"));
		firstname.sendKeys("Anubhuti");
		WebElement lastname=driver.findElement(By.id("LastName"));
		lastname.sendKeys("Kumari");
		WebElement email=driver.findElement(By.id("Email"));
		email.sendKeys("anu3241@gmail.com");
		WebElement password=driver.findElement(By.name("Password"));
		password.sendKeys("75499900");
		WebElement confirm=driver.findElement(By.id("ConfirmPassword"));
		confirm.sendKeys("75499900");
		WebElement regbutton=driver.findElement(By.id("register-button"));
		regbutton.click();
		driver.findElement(By.linkText("anu3241@gmail.com")).isDisplayed();
		}
	@Test(dependsOnMethods="register",priority=2)
	public void login() throws InterruptedException{
		driver.findElement(By.linkText("Log in")).click();
		Thread.sleep(1000);
		driver.findElement(By.id("Email")).sendkeys("anu3241@gmail.com");
		Thread.sleep(1000);
		confirm.sendKeys("75499900");
		driver.findElement(By.ByXPath())
		
	
		
			
		
		
	
	
}
}
