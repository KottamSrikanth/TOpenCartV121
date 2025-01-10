package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MyAccountPage 
{
	//Constructors
	//Locators
	//Actions
	
	public WebDriver driver;
	
	public MyAccountPage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//div[@id='content']//h2[text()='My Account']")
	WebElement MyAccount;
	
	@FindBy(xpath ="//ul[@class='list-unstyled']//a[text()='Edit your account information']")
	WebElement EditAccount;
	
	public boolean MyAccount()
	{
		try {
		return (MyAccount.isDisplayed());
		}
		catch(Exception e)
		{
			return false;
		}
	}

}
