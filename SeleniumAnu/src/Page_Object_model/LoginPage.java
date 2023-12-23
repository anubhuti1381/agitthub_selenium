package Page_Object_model;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	public LoginPage(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}
	@FindBy(id="Email")
	private WebElement emailid;
	
	@FindBy(id="PassWord")
	private WebElement password;
	
	@FindBy(linkText = "Log in")
	private WebElement login;

	public WebElement getEmailid() {
		return emailid;
	}

	public WebElement getPassword() {
		return password;
	}

	public WebElement getLogin() {
		return login;
	}
    @FindBy(xpath="//input[@value='Log in']")
    private WebElement loginbutton;
	

}
