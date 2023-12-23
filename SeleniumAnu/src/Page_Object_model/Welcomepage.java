package Page_Object_model;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Welcomepage {
	Welcomepage(WebDriver driver){
     PageFactory.initElements(driver,this);
	}
    @FindBy(linkText = "Register")
    private WebElement registrationlink;
    
    @FindBy(linkText = "Log in")
    private WebElement loginlink;
    
    @FindBy(linkText="Log out")
    private WebElement logoutlink;

	public WebElement getRegistrationlink() {
		return registrationlink;
	}

	public WebElement getLoginlink() {
		return loginlink;
	}
    public WebElement getLogoutlink() {
		return logoutlink;
	}


	
	}