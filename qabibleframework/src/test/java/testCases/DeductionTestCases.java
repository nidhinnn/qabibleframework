package testCases;

import org.testng.annotations.Test;

import base.BaseClass;
import elementRepository.DashboardPage;
import elementRepository.DeductionPage;
import elementRepository.LoginPage;

public class DeductionTestCases extends BaseClass {
	
	@Test
	public void addDeductionDetails() {
		
		LoginPage lp = new LoginPage(driver);
		lp.inputUsername("carol");
		lp.inputPassword("1q2w3e4r");
		lp.clickLoginButton();
		
		DashboardPage dp = lp.clickLoginButton();
		
		DeductionPage dep = dp.clickOnDeductionMenu();
		dep.addDeduction();
		dep.selectWorker();
		dep.selectDeductionType();
		dep.enterDeductonAmount();
		dep.enterDate();
		dep.deductionSaveButton();
	}

}
