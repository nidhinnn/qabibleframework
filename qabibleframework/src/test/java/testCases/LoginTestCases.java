package testCases;
import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import base.BaseClass;
import elementRepository.DashboardPage;
import elementRepository.LoginPage;
import utilities.ExcelReadUtility;

public class LoginTestCases extends BaseClass {
	
  @Test
  public void verifyLoginisWorkingWithValidCredentials() throws IOException
  {
	  LoginPage lp = new LoginPage(driver);
	  lp.inputUsername(ExcelReadUtility.readStringData(0, 1));
	  lp.inputPassword(ExcelReadUtility.readStringData(1, 1));
	  lp.clickLoginButton();
	  
	  DashboardPage dp = lp.clickLoginButton();
	  
	  String actual = dp.getTextFromTitle();
	  String expected = "PAYROLL APPLICATION";
	  Assert.assertEquals(actual, expected,"Login feature is not working");
  }


  
}