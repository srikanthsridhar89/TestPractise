package com.agilea.ta.test;
import java.io.File;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import com.relevantcodes.extentreports.DisplayOrder;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.utils.DateTimeUtil;

public class ExtentReport extends DateTimeUtil{

	public static WebDriver driver;
	public static WebElement element;
	public static ExtentReports reporter;
	ExtentTest logger; 

	public static ExtentReports Instance()
	{
		try{

		if (reporter == null) {
			String Path = System.getProperty("user.dir") + "/Reports/testAssureReport.html";
			reporter = new ExtentReports(Path, false, DisplayOrder.OLDEST_FIRST);
			reporter.loadConfig(new File(System.getProperty("user.dir") +"/xxx/extent-config.xml"));
		}
	
		}catch(Exception e){
			
		}
		return reporter;
	}
	
	
	public static String get_Logsfilepath()
	{
		String path=System.getProperty("user.dir")+File.separator+"Reports"+File.separator+"RequestResponseLog.txt";
		return path;
	}
	
	
	public static void writeLogsToReport(String status,String message)
	{

		status=status.toUpperCase();
		switch(status)
		{
		case "PASS":
	//		SeleniumMethods.getLogger().log(LogStatus.PASS, message);  
			break;
		case "FAIL":
	//		SeleniumMethods.getLogger().log(LogStatus.FAIL, message);  
			break;
		case "INFO":
	//		SeleniumMethods.getLogger().log(LogStatus.INFO, message);  
			break;
		}
	}


}
