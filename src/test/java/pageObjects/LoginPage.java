package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage 
{
	public WebDriver driver;

	public LoginPage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath="//input[@id='input-email']")
	WebElement emailAddress;

	@FindBy(xpath="//input[@id='input-password']")
	WebElement Password;

	@FindBy(xpath="//input[@class='btn btn-primary']")
	WebElement Login;

	@FindBy(xpath="//ul[@class='list-unstyled']//li//a[text()='Edit your account information']")
	WebElement confirmationMsg;
	
	public void setEmail(String em)
	{
		emailAddress.sendKeys(em);
	}

	public void setPassword(String pwd)
	{
		Password.sendKeys(pwd);
	}

	public void clickLogin()
	{
		Login.click();
	}
	
	public String getConfirmationMsg()
	{
		return confirmationMsg.getText();
	}

}
