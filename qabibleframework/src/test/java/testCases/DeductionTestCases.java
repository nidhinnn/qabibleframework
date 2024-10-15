package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import base.BaseClass;
import constant.Constant;
import elementRepository.DashboardPage;
import elementRepository.DeductionPage;
import elementRepository.LoginPage;

public class DeductionTestCases extends BaseClass {
	
	@Test
	public void verifyWorkerNotSelectedWarningMessage() {
		
		LoginPage lp = new LoginPage(driver);
		lp.inputUsername("carol");
		lp.inputPassword("1q2w3e4r");
		lp.clickLoginButton();
		
		DashboardPage dp = lp.clickLoginButton();
		
		DeductionPage dep = dp.clickOnDeductionMenu();
		dep.addDeduction();
		dep.deductionSaveButton();
		
		String actual = dep.verifyWorkerWarning();
		String expected = "Worker cannot be blank.";
		Assert.assertEquals(actual, expected, Constant.warningMessageError);
	}
	
	@Test
	public void verifyTypeNotSelectedWarningMessage() {
		
		LoginPage lp = new LoginPage(driver);
		lp.inputUsername("carol");
		lp.inputPassword("1q2w3e4r");
		lp.clickLoginButton();
		
		DashboardPage dp = lp.clickLoginButton();
		
		DeductionPage dep = dp.clickOnDeductionMenu();
		dep.addDeduction();
		dep.deductionSaveButton();
		
		String actual = dep.verifyTypeWorkerWarning();
		String expected = "Type cannot be blank.";
		Assert.assertEquals(actual, expected, Constant.warningMessageError);
	}
	
	@Test
	public void verifyAmountNotEnteredWarningMessage() {
		
		LoginPage lp = new LoginPage(driver);
		lp.inputUsername("carol");
		lp.inputPassword("1q2w3e4r");
		lp.clickLoginButton();
		
		DashboardPage dp = lp.clickLoginButton();
		
		DeductionPage dep = dp.clickOnDeductionMenu();
		dep.addDeduction();
		dep.deductionSaveButton();
		
		String actual = dep.verifyAmountWarning();
		String expected = "Amount cannot be blank.";
		Assert.assertEquals(actual, expected, Constant.warningMessageError);
	}

}
