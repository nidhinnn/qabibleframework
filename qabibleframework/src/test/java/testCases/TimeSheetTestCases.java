package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import base.BaseClass;
import elementRepository.DashboardPage;
import elementRepository.LoginPage;
import elementRepository.TimeSheet;
import net.bytebuddy.implementation.bind.annotation.RuntimeType;

public class TimeSheetTestCases extends BaseClass {

	@Test
	public void verifyOkAlertButtonOfGeneratePlaySlip() {

		LoginPage lp = new LoginPage(driver);
		lp.inputUsername("carol");
		lp.inputPassword("1q2w3e4r");
		lp.clickLoginButton();

		DashboardPage dp = lp.clickLoginButton();
		dp.clickOnTimeSheetMenu();

		TimeSheet ts = dp.clickOnTimeSheetMenu();
		String actual = ts.clickOkOnAlertOfGeneratePlayslipButton();
		String expected = "Are you sure you want to generate payslip?";
		Assert.assertEquals(actual, expected, "Error in alerts");

	}

	@Test
	public void verifyCancelAlertButtonOfGeneratePlaySlip() {

		LoginPage lp = new LoginPage(driver);
		lp.inputUsername("carol");
		lp.inputPassword("1q2w3e4r");
		lp.clickLoginButton();

		DashboardPage dp = lp.clickLoginButton();
		dp.clickOnTimeSheetMenu();

		TimeSheet ts = dp.clickOnTimeSheetMenu();
		String actual = ts.clickCancelOnAlertOfGeneratePlayslipButton();
		String expected = "Are you sure you want to generate payslip?";
		Assert.assertEquals(actual, expected, "Error in alerts");

	}
	
	@Test
	public void verifyOkAlertButtonOfGenerateInvoiceButton() {

		LoginPage lp = new LoginPage(driver);
		lp.inputUsername("carol");
		lp.inputPassword("1q2w3e4r");
		lp.clickLoginButton();

		DashboardPage dp = lp.clickLoginButton();
		dp.clickOnTimeSheetMenu();

		TimeSheet ts = dp.clickOnTimeSheetMenu();
		String actual = ts.clickOkOnAlertOfgenerateInvoiceButton();
		String expected = "Are you sure you want to generate invoice?";
		Assert.assertEquals(actual, expected, "Error in alerts");
		
	}
	
	@Test
	public void verifyCancelAlertButtonOfGenerateInvoiceButton() {

		LoginPage lp = new LoginPage(driver);
		lp.inputUsername("carol");
		lp.inputPassword("1q2w3e4r");
		lp.clickLoginButton();

		DashboardPage dp = lp.clickLoginButton();
		dp.clickOnTimeSheetMenu();

		TimeSheet ts = dp.clickOnTimeSheetMenu();
		String actual = ts.clickCancelOnAlertOfgenerateInvoiceButton();
		String expected = "Are you sure you want to generate invoice?";
		Assert.assertEquals(actual, expected, "Error in alerts");
		
	}

}
