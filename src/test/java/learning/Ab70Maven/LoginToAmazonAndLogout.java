package learning.Ab70Maven;

import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import utility.BaseTest;
import utility.ListenersLogic;
import utility.RetryLogic;
@Listeners(ListenersLogic.class)

public class LoginToAmazonAndLogout extends BaseTest
{
	@Test//(retryAnalyzer=RetryLogic.class)
	public void loginandLogout() throws InterruptedException
	{
		Reporter.log("Browser is launched Successfully");
		Amz_HomePage homepage=new Amz_HomePage(driver);
		homepage.HoverOverAccountandList(driver);
	
		Reporter.log("Hoverover On Account and List");

		homepage.ClickOnSign();
		Reporter.log("Click on Signin");

		//Thread.sleep(3000);
		Amz_LoginPage loginpage=new Amz_LoginPage(driver);
		loginpage.EnterUsername();
		//Thread.sleep(3000);
		Reporter.log("Enter the Username");
		loginpage.ClickOnContinue();
		Reporter.log("Click on Contonue BUtton");
		loginpage.EnterPassword();
	//	Thread.sleep(3000);
		Reporter.log("Enter the Password");

		loginpage.ClickOnSign();
		Reporter.log("Click on signin Button");

		homepage.HoverOverAccountandList(driver);
		Reporter.log("Hoverover On Account and List");
		homepage.ClickOnSignout();
		
		Reporter.log("Click on signout Button");
		SoftAssert s1=new SoftAssert();
		s1.assertEquals(loginpage.VerifyTheAssertion(), "Sign in or create account","Sorry assertion failed");
		s1.assertAll();
		Reporter.log("TestCase is Pass");

	}

}
