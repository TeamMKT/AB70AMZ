package utility;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class ListenersLogic implements ITestListener
{
    public static  WebDriver driver;

    @Override
    public void onTestSuccess(ITestResult result) {
            // TODO Auto-generated method stub
            ITestListener.super.onTestSuccess(result);
            
            TakesScreenshot ts=        (TakesScreenshot) driver;
            File source=        ts.getScreenshotAs(OutputType.FILE);
            
            //File destination=new File("C:\\Users\\MKT\\eclipse-workspace\\Ab70\\test-output\\screenshot\\photo"+Math.random()+".png");//
            File destination=new File("C:\\Users\\MKT\\eclipse-workspace\\Ab70Maven\\test-output\\Screenshot\\Pass\\"+result.getName()+".png");

            try {
                    FileHandler.copy(source, destination);
            } catch (IOException e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
            }
    }

    @Override
    public void onTestFailure(ITestResult result) {
            // TODO Auto-generated method stub
            ITestListener.super.onTestFailure(result);
            
            TakesScreenshot ts=        (TakesScreenshot) driver;
            File source=        ts.getScreenshotAs(OutputType.FILE);
            
            //File destination=new File("C:\\Users\\MKT\\eclipse-workspace\\Ab70\\test-output\\screenshot\\photo"+Math.random()+".png");//
            File destination=new File("C:\\Users\\MKT\\eclipse-workspace\\Ab70Maven\\test-output\\Screenshot\\Fail\\"+result.getName()+".png");

            try {
                    FileHandler.copy(source, destination);
            } catch (IOException e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
            }
    }

}
