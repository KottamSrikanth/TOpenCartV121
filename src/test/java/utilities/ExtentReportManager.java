package utilities;

import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class ExtentReportManager 
{
	@Test
	public void extentReport()
	{
		ExtentReports extent = new ExtentReports();
		ExtentSparkReporter sparkReporter = new ExtentSparkReporter("./reports/Test1.html");
		extent.attachReporter(sparkReporter);
		extent.flush();
		
	}

}
