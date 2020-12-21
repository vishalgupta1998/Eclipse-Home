package rahulshettyacademy.Extentreports;
/*import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;

import org.testng.Assert;

import org.testng.annotations.BeforeTest;

import org.testng.annotations.Test;



import com.aventstack.extentreports.ExtentReports;

import com.aventstack.extentreports.ExtentTest;

import com.aventstack.extentreports.reporter.ExtentSparkReporter;



public class ExtentReportDemo {

ExtentReports extent;



@BeforeTest

public void config()

{

// ExtentReports , ExtentSparkReporter

String path =System.getProperty("user.dir")+"\\reports\\index.html";

ExtentSparkReporter reporter = new ExtentSparkReporter(path);

reporter.config().setReportName("Web Automation Results");

reporter.config().setDocumentTitle("Test Results");

extent =new ExtentReports();

extent.attachReporter(reporter);

extent.setSystemInfo("Tester", "Rahul Shetty");

}

@Test

public void initialDemo()

{

ExtentTest test= extent.createTest("Initial Demo");

System.setProperty("webdriver.chrome.driver", "C:\\Users\\pc\\Documents\\chromedriver.exe");

WebDriver driver =new ChromeDriver();

driver.get("https://rahulshettyacademy.com");

System.out.println(driver.getTitle());

driver.close();

//test.fail("Result do not match");

extent.flush();

}

}*/



import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;

import org.testng.Assert;

import org.testng.annotations.BeforeTest;

import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;

import com.aventstack.extentreports.ExtentTest;

import com.aventstack.extentreports.reporter.*;

public class ExtentReportDemo  {
     // ExtentSparkReporter
	
	private static ExtentReports extent;
	//String path;
	//try{

	@BeforeTest

	public void config()

	{

		// ExtentReports , ExtentSparkReporter

		 String path = System.getProperty("user.dir") + "\\reports\\index.html";
 
		ExtentSparkReporter reporter = new ExtentSparkReporter(path);

		reporter.config().setReportName("Web Automation Results");

		reporter.config().setDocumentTitle("Test Results");
		
		extent = new ExtentReports();

		extent.attachReporter(reporter);

		extent.setSystemInfo("Tester", "Rahul Shetty");

	}

	@Test

	public void initialDemo()

	{

		ExtentTest test = extent.createTest("Initial Demo");

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\pc\\Documents\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("https://rahulshettyacademy.com");
		//test.addScreenCaptureFromBase64String(path);

		System.out.println(driver.getTitle());

		driver.close();

		 //test.fail("Result do not match");

		extent.flush();

	}

	
}
	

// public class ExtentReportDemo {
//
// public void config()
// {
// String path=System.getProperty("user.dir") + "\\reports\\index.html";
// ExtentSparkReporter reporter = new ExtentSparkReporter(path);
// reporter.config().setReportName("Web Automation Results");
// reporter.config().setDocumentTitle("Test Result");
//
//
//
//
// ExtentReports extent = new ExtentReports();
// extent
//
//
// }
//
