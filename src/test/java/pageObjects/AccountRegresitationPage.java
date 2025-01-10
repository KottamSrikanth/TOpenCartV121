package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AccountRegresitationPage 
{
	public WebDriver driver;
	//Constructor
	public AccountRegresitationPage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}

	//Locators
	@FindBy(xpath="//input[@id='input-firstname']")
	WebElement fstName;

	@FindBy(xpath="//input[@id='input-lastname']")
	WebElement lstName;

	@FindBy(xpath="//input[@id='input-email']")
	WebElement email;

	@FindBy(xpath="//input[@id='input-telephone']")
	WebElement telephone;

	@FindBy(xpath="//input[@id='input-password']")
	WebElement password;

	@FindBy(xpath="//input[@id='input-confirm']")
	WebElement confirmpassword;

	@FindBy(xpath="//input[@type='checkbox']")
	WebElement privacyPolicy;

	@FindBy(xpath="//input[@value='Continue']")
	WebElement Continue;
	
	@FindBy(xpath="//div[@id='content']//h1")
	WebElement confirmMsg;

	//Actions

	public void txtfstName(String fname)
	{
		fstName.sendKeys(fname);
	}

	public void txtlstName(String lname)
	{
		lstName.sendKeys(lname);
	}

	public void txtemail(String em)
	{
		email.sendKeys(em);
	}

	public void txttelephone(String tel)
	{
		telephone.sendKeys(tel);
	}

	public void txtpassword(String pwd)
	{
		password.sendKeys(pwd);
	}

	public void txtconfirmpassword(String cpwd)
	{
		confirmpassword.sendKeys(cpwd);
	}

	public void txtprivacyPolicy()
	{
		privacyPolicy.click();
	}

	public void clickContinue()
	{
		Continue.click();
	}
	
	public String confirmationMsg()
	{
		return confirmMsg.getText();
	}
}
