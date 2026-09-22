package learning.Ab70Maven;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginPage_FB
{
	WebDriver driver;//using this we can write synronization concept
	  WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(10));

//step 1
	
	@FindBy(name="email")
	WebElement username;
	

	@FindBy(name="pass")
	WebElement password;
	

	@FindBy(xpath="//span[text()='Log in']")
	WebElement login;
	
	@FindBy(xpath="//div[@id='claim-collection-container']/h1")
	WebElement TextForAssertion;
	//step 2
	
	
public void EnterValidEmailId()
{
    wait.until(ExpectedConditions.visibilityOf(username));
	username.sendKeys("stbymkt@gmail.com");
}
public void EnterValidPassword()
{
    wait.until(ExpectedConditions.visibilityOf(password));

	password.sendKeys("manish76543");
}
public void ClickOnLoginButton()
{
    wait.until(ExpectedConditions.elementToBeClickable(login));

	login.click();
}
public String VerifyTheAssertion()
{
	String text=	TextForAssertion.getText();
	return text;
}

public LoginPage_FB(WebDriver driver)
{
	PageFactory.initElements(driver, this);
}
	
}
