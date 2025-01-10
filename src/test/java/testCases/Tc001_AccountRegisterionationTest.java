package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.AccountRegresitationPage;
import pageObjects.HomePage;

public class Tc001_AccountRegisterionationTest extends Baseclass
{
	
	@Test
	public void verify_AccountRegrestion()
	{
		HomePage hp = new HomePage(driver);
		hp.clickMyAccount();
		hp.clickRegister();
		
		AccountRegresitationPage arp = new AccountRegresitationPage(driver);
		arp.txtfstName(RandomString());
		arp.txtlstName(RandomString());
		arp.txtemail(RandomString()+"@gmail.com");
		arp.txttelephone("9687954790");
		arp.txtpassword("xyz123456");
		arp.txtconfirmpassword("xyz123456");
		arp.txtprivacyPolicy();
		arp.clickContinue();
		
		String msg=arp.confirmationMsg();
		Assert.assertEquals(msg, "Your Account Has Been Created!");
		

	}
	

}
