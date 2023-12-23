package Assert;

import static org.testng.Assert.assertEquals;

import java.time.Duration;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

import dev.failsafe.internal.util.Assert;

public class Assertpract {
	@Test
	public void Testcase() {
		String Expected="https://demowebshop.tricentis.com/";
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://demowebshop.tricentis.com/");
		String actual=driver.getCurrentUrl();
        assertEquals( Expected,actual);
		Reporter.log("Assertpract completed",true);
	}

}
