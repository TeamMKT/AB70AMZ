package learning.Ab70Maven;

import java.time.Duration;
import java.util.NoSuchElementException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Amz_LoginPage 
{
	WebDriver driver;
	//  WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(10));
	  FluentWait<WebDriver> wait=new FluentWait<WebDriver>(driver).withTimeout(Duration.ofSeconds(10)).pollingEvery(Duration.ofSeconds(1)).ignoring(NoSuchElementException.class).ignoring(NullPointerException.class);

	@FindBy(name="email")
	WebElement username;
	
	@FindBy(id="continue")
	WebElement continueButton;
	
	@FindBy(name="password")
	WebElement password;
	
	@FindBy(id="signInSubmit")
	WebElement signin;
	
	@FindBy(xpath="//div[@id='claim-collection-container']/h1")
	WebElement TextForAssertion;
	//step 2
	public void EnterUsername()
	{
        wait.until(ExpectedConditions.visibilityOf(username));
		username.sendKeys("sibani4bk@gmail.com");
	}
	public void EnterPassword()
	{
        wait.until(ExpectedConditions.visibilityOf(password));

		password.sendKeys("Welcome*123");
	}
	public void ClickOnContinue()
	{
        wait.until(ExpectedConditions.elementToBeClickable(continueButton));

		continueButton.click();
	}
	public void ClickOnSign()
	{
        wait.until(ExpectedConditions.elementToBeClickable(signin));

		signin.click();
	}
	public String VerifyTheAssertion()
	{
		String text=	TextForAssertion.getText();
		return text;
	}
	public Amz_LoginPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
}
