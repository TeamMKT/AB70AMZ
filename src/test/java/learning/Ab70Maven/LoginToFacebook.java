package learning.Ab70Maven;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class LoginToFacebook 
{
	@Test
	public void withvalidCred()
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com");
		driver.manage().window().maximize();
		Amz_LoginPage loginpage=new Amz_LoginPage(driver);
		loginpage.EnterValidEmailId();
		loginpage.EnterValidPassword();
		loginpage.ClickOnLoginButton();
		
		
		
	}
}
