package testCases;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import pageObjects.HomePage;
import pageObjects.LoginPage;

public class Tc003_DataDriven_LoginTest extends Baseclass
{
	@Test(dataProvider="LoginTestData")
	public void testUsingCreditionals(String userName,String pwd) throws InterruptedException
	{
		HomePage hp = new HomePage(driver);
		hp.clickMyAccount();
		hp.clickLogin();
		
		LoginPage lp = new LoginPage(driver);
		lp.setEmail(userName);
		lp.setPassword(pwd);
		Thread.sleep(3000);
		lp.clickLogin();
	}
	
	@DataProvider(name="LoginTestData")
	public Object readData()
	{
		Object data[][]= {{"srikgmail.com","123456"},{"laksi@yahoo.com","laxmi"}};
		return data;
	}

}
