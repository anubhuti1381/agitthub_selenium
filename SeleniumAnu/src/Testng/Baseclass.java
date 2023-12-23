package Testng;

import java.sql.Driver;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

public class Baseclass {
	WebDriver driver;
	@BeforeSuite
	public void connectServer() {
		Reporter.log("connecting the server",true);
	}
    @BeforeTest
    public void connectdatabase() {
    	Reporter.log("connecting the database",true);
    }
    @BeforeClass
    public void openbrowser() {
    	Reporter.log("opening the browser",true);
        driver=new ChromeDriver();
    	driver.manage().window().maximize();
    	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    	driver.get("https://demowebshop.tricentis.com/login");
    }
    @BeforeMethod
    public void login() {
    	Reporter.log("login the website",true);
    	driver.findElement(By.linkText("Log in")).click();
    	driver.findElement(By.id("Email")).sendKeys("anukl123@gmail.com");
    	driver.findElement(By.id("Password")).sendKeys("anu@123");
    	driver.findElement(By.xpath("//input[@class='button-1 login-button']")).click();
    	
    	
    }
    @AfterMethod
    public void logout() {
    	Reporter.log("logout the website",true);
    	driver.findElement(By.linkText("Log out")).click();
    }
    @AfterClass
    public void closebrowser() {
    	driver.quit();
    	Reporter.log("close the browser",true);
    }
    @AfterTest
    public void disconnectdatabase() {
    	Reporter.log("disconnecting the database",true);
    	
    }
    @AfterSuite
    public void disconnectserver() {
    	Reporter.log("disconnecting the server",true);
    }
}
