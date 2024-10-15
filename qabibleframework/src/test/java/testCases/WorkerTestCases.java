package testCases;

import static org.testng.Assert.assertEquals;

import org.testng.Assert;
import org.testng.annotations.Test;

import base.BaseClass;
import constant.Constant;
import elementRepository.DashboardPage;
import elementRepository.LoginPage;
import elementRepository.WorkerPage;

public class WorkerTestCases extends BaseClass {

	@Test(groups = "critical")
	public void verifyTextOfSearchButton() {

		LoginPage lp = new LoginPage(driver);
		lp.inputUsername("carol");
		lp.inputPassword("1q2w3e4r");
		lp.clickLoginButton();

		DashboardPage dp = lp.clickLoginButton();

		WorkerPage wp = dp.clickOnWorkerMenu();

		String actualSearch = wp.verifyTextOfSearchButton();
		String expectedSearch = "Search";
		Assert.assertEquals(actualSearch, expectedSearch, Constant.textMismatchError);
	}
	
	@Test(groups = "critical")
	public void checkFontSizeOfSearchButton() {
		LoginPage lp = new LoginPage(driver);
		lp.inputUsername("carol");
		lp.inputPassword("1q2w3e4r");
		lp.clickLoginButton();

		DashboardPage dp = lp.clickLoginButton();
		dp.clickOnWorkerMenu();

		WorkerPage wp = dp.clickOnWorkerMenu();
		
		String actualFontSize = wp.verifyFontSizeOfSearchButton();
		String expectedFontSize = "14px";
		Assert.assertEquals(actualFontSize, expectedFontSize, Constant.fontSizeError);
	}
	
	@Test
	public void verifyTitleFromDropdown() {
		LoginPage lp = new LoginPage(driver);
		lp.inputUsername("carol");
		lp.inputPassword("1q2w3e4r");
		lp.clickLoginButton();

		DashboardPage dp = lp.clickLoginButton();
		dp.clickOnWorkerMenu();

		WorkerPage wp = dp.clickOnWorkerMenu();
		wp.clickCreateWorkerMenu();

		String actual = wp.selectValueFromTitleDropDown();
		String expected = "Mr";
		Assert.assertEquals(actual, expected, Constant.errorMessageCheckBox);
	}

}