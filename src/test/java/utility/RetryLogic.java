package utility;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class RetryLogic implements IRetryAnalyzer
{
	int initialCount=0;
	int retryCount=1;
	@Override
	public boolean retry(ITestResult result) 
	{
		if(initialCount<retryCount)  //0<2
		{
			initialCount++;//2->
			return true;

		}
		
		
		return false;
	}


}
