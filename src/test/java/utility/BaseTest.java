package utility;

import java.time.Duration;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

public class BaseTest extends ListenersLogic{
	@Parameters("browser")
	@BeforeMethod
	public void launchbrowser(String nameOfbrowser)
	{
		if(nameOfbrowser.equalsIgnoreCase("chrome"))
		{
		 driver=new ChromeDriver();		
		}
		if(nameOfbrowser.equals("firefox"))
		{
		 driver=new FirefoxDriver();		
		}
		if(nameOfbrowser.equals("edge"))
		{
		 driver=new EdgeDriver();		
		}
		 driver.get("https://www.amazon.in");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		//implicit wait
		
	}
	@AfterMethod
	public void quitbrowser()
	{
	//	driver.quit();
	}
}
