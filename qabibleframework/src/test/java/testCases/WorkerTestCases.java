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
		Assert.assertEquals(actualSearch, expectedSearch);
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
		Assert.assertEquals(actualFontSize, expectedFontSize, "Font size is diffrent");
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
		String expected = "M";
		Assert.assertEquals(actual, expected, Constant.errorMessageCheckBox);
	}
	
	
	@Test
	public void verifyGenderFromDropdown() {
		LoginPage lp = new LoginPage(driver);
		lp.inputUsername("carol");
		lp.inputPassword("1q2w3e4r");
		lp.clickLoginButton();

		DashboardPage dp = lp.clickLoginButton();
		dp.clickOnWorkerMenu();

		WorkerPage wp = dp.clickOnWorkerMenu();
		wp.clickCreateWorkerMenu();
		wp.selectValueFromGenderDropdown();
		
	}
}