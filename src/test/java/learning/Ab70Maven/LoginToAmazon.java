package learning.Ab70Maven;
import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import utility.BaseTest;
import utility.ListenersLogic;
import utility.RetryLogic;
@Listeners(ListenersLogic.class)
public class LoginToAmazon extends BaseTest
{
	@Test//(retryAnalyzer=RetryLogic.class)
	public void withValidCred() throws InterruptedException
	{
		Reporter.log("Browser is launched Successfully");
		Amz_HomePage homepage=new Amz_HomePage(driver);
		homepage.HoverOverAccountandList(driver);
		Reporter.log("Hoverover On Account and List");

		homepage.ClickOnSign();
		Reporter.log("Click on Signin");

		Amz_LoginPage loginpage=new Amz_LoginPage(driver);
		loginpage.EnterUsername();
		Reporter.log("Enter the Username");
		loginpage.ClickOnContinue();
		Reporter.log("Click on Contonue BUtton");
		loginpage.EnterPassword();
		Reporter.log("Enter the Password");

		loginpage.ClickOnSign();
		Reporter.log("Click on signin Button");

		SoftAssert s1=new SoftAssert();
		s1.assertEquals(driver.getTitle(), "Online Shopping site in India: Shop Online for Mobiles, Books, Watches, Shoes and More - Amazon.in","Sorry Title is not same as Expected");
		s1.assertAll();
		Reporter.log("TestCase is Pass");

	}
}
