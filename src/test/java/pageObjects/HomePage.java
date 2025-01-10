package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage 
{
	public WebDriver driver;
	public HomePage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	//locators
	@FindBy(xpath="//ul[@class='list-inline']//li[@class='dropdown']")
	WebElement MyAccount;
	
	@FindBy(linkText="Register")
	WebElement Register;
	
	@FindBy(xpath="//ul[contains(@class,'dropdown-menu d')]//li//a[text()='Login']")
	WebElement Login;
	
	//Actions
	public void clickMyAccount()
	{
		MyAccount.click();
	}
	
	public void clickRegister()
	{
		Register.click();
	}
	
	public void clickLogin()
	{
		Login.click();
	}

}
