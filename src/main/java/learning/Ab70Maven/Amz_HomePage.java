package learning.Ab70Maven;

import java.time.Duration;
import java.util.NoSuchElementException;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Amz_HomePage 
{
	WebDriver driver;
	//  WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(10));
	  FluentWait<WebDriver> wait=new FluentWait<WebDriver>(driver).withTimeout(Duration.ofSeconds(10)).pollingEvery(Duration.ofSeconds(1)).ignoring(NoSuchElementException.class);
	@FindBy(xpath="//span[@class='nav-line-2 ']")
	WebElement accountandList;
	
	@FindBy(xpath="//a[@class='nav-action-signin-button']")
	WebElement signin;
	
	@FindBy(id="twotabsearchtextbox")
	WebElement search;
	
	@FindBy(xpath="//span[text()='Sign Out']")
	WebElement signout;
	
	public void HoverOverAccountandList(WebDriver driver)
	{
        wait.until(ExpectedConditions.visibilityOf(accountandList));
		Actions a1=new Actions(driver);
		a1.moveToElement(accountandList).perform();

	}
	public void ClickOnSign()
	{
        wait.until(ExpectedConditions.elementToBeClickable(signin));

		signin.click();
		
	}
	public void ClickOnSignout()
	{
        wait.until(ExpectedConditions.elementToBeClickable(signout));

		signout.click();
	}
	public void searchProduct()
	{
        wait.until(ExpectedConditions.visibilityOf(search));
		search.sendKeys("shoe"+Keys.ENTER);
	}
	public Amz_HomePage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
}
