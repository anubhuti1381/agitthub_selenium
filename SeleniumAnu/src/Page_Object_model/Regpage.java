package Page_Object_model;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Regpage {
	Regpage(WebDriver driver){
		PageFactory.initElements(driver,this);
	}
    @FindBy(id = "gender-male")
    private WebElement gender;
    
    @FindBy(id ="FirstName")
    private WebElement firstnametext;
    
    @FindBy(id="LastName")
    private WebElement lastname;
    
    @FindBy(id = "Email")
    private WebElement emailtext;
    
    @FindBy(id="Password")
    private WebElement passwordtext;
    
    @FindBy(id="ConfirmPassword")
    private WebElement confirmpasswordtext;
    
    @FindBy(id="register-button")
    private WebElement registrationbutton;

	public WebElement getGender() {
		return gender;
	}

	public WebElement getFirstnametext() {
		return firstnametext;
	}

	public WebElement getLastname() {
		return lastname;
	}

	public WebElement getEmailtext() {
		return emailtext;
	}

	public WebElement getPasswordtext() {
		return passwordtext;
	}

	public WebElement getConfirmpasswordtext() {
		return confirmpasswordtext;
	}

	public WebElement getRegistrationbutton() {
		return registrationbutton;
	}

	

	
}

    

