package base;

import org.testng.annotations.Test;

import com.beust.jcommander.Parameter;

import utilities.CaptureScreenshotForFailedTestCases;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;

public class BaseClass {
	public WebDriver driver;
	
	public static Properties prop;//prop is the ref variable of class Properties
	
	public static void testBasic() throws IOException {
		prop = new Properties();
		FileInputStream ip = new FileInputStream(
		System.getProperty("user.dir") + "//src//test//resources//Config.properties");
		prop.load(ip);
	}
	
	@BeforeMethod(alwaysRun = true)
	@Parameters("browser")
	public void beforeMethod(String a) throws IOException {
		testBasic();
		
		if(a.equals("chrome"))
		  {
			  driver = new ChromeDriver();
		  }
		  else if(a.equals("edge"))
		  {
			  driver = new EdgeDriver();
		  }
		  else if(a.equals("firefox"))
		  {
			  driver = new FirefoxDriver();
		  }
		
		driver.get(prop.getProperty("Baseurl"));
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}

	@AfterMethod(alwaysRun = true)
	public void afterMethod(ITestResult iTestResult) throws IOException { // ItestResult listener interface and listener
																			// ref variable
		if (iTestResult.getStatus() == ITestResult.FAILURE) 
		{
			CaptureScreenshotForFailedTestCases cs = new CaptureScreenshotForFailedTestCases();
			cs.captureScreenShotForFailedTestcase(driver, iTestResult.getName());
		}
		
		//driver.close();
	}

}
