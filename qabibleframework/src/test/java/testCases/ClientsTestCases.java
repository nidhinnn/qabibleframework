package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import base.BaseClass;
import elementRepository.ClientsPage;
import elementRepository.DashboardPage;
import elementRepository.LoginPage;

public class ClientsTestCases extends BaseClass {
	
	@Test
	public void findClientsThroughSearch() {
		LoginPage lp = new LoginPage(driver);
		lp.inputUsername("carol");
		lp.inputPassword("1q2w3e4r");
		lp.clickLoginButton();
		
		DashboardPage dp = new DashboardPage(driver);
		dp.clickonClientsMenu();
		
		ClientsPage cp = new ClientsPage(driver);
		//cp.enterClientName();
		cp.enterClientId();
		cp.clickOnSearchButton();
		
		String actual = cp.enterClientName();
		String expected = "Haritha";
		Assert.assertEquals(actual, expected, "Entered client not found");
	}
	
	@Test
	public void verifyTextOfResetButton() {
		
		LoginPage lp = new LoginPage(driver);
		lp.inputUsername("carol");
		lp.inputPassword("1q2w3e4r");
		lp.clickLoginButton();
		
		DashboardPage dp = new DashboardPage(driver);
		dp.clickonClientsMenu();
		
		ClientsPage cp = new ClientsPage(driver);
		String actual = cp.verifyTextOfResetButton();	
		String expected = "Reset";
		Assert.assertEquals(actual, expected, "Text mismatch");
	}

}
