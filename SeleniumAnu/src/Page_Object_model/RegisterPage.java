package Page_Object_model;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RegisterPage {
         RegisterPage(WebDriver driver){
        	PageFactory.initElements( driver,this); 
         }
         @FindBy(linkText="Register")
         private WebElement registerlink;
         public WebElement getRegisterlink() {
        	 return registerlink;
         }
}
