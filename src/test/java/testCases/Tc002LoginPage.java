package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.HomePage;
import pageObjects.LoginPage;
import pageObjects.MyAccountPage;


public class Tc002LoginPage extends Baseclass
{
	@Test
	public void TestLoginPage()
	{
		HomePage hp = new HomePage(driver);
		hp.clickMyAccount();
		hp.clickLogin();

		LoginPage lp = new LoginPage(driver);
		lp.setEmail(p.getProperty("email"));
		lp.setPassword(p.getProperty("password"));
		lp.clickLogin();
		
		MyAccountPage my = new MyAccountPage(driver);
		boolean targetPage=my.MyAccount();
		Assert.assertEquals(targetPage,true);


	}


}
