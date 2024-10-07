package elementRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.GeneralUtilities;

public class DashboardPage {
	public DashboardPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	GeneralUtilities gu = new GeneralUtilities();

	WebDriver driver;
	
	@FindBy(xpath = "//h1[text()='Payroll Application']")
	WebElement payrollApplicationTitle;

	@FindBy(xpath = "//a[text()='Workers']")
	WebElement worker;
	
	@FindBy(xpath = "//a[text()='Clients']")
	WebElement clients;
	
	@FindBy(xpath = "//a[text()='Deduction']")
	WebElement deduction;
	
	@FindBy(xpath = "//a[text()='TimeSheet']")
	WebElement TimeSheetPage;

	public String getTextFromTitle() {
		return gu.getElementText(payrollApplicationTitle);
	}
	
	public String getToolTipValue() {
		return gu.getToolTipValue(payrollApplicationTitle, getToolTipValue());
	}

	public WorkerPage clickOnWorkerMenu() {
		worker.click();
		return new WorkerPage(driver);
	}
	
	public ClientsPage clickonClientsMenu() {
		clients.click();
		return new ClientsPage(driver);
	}
	
	public DeductionPage clickOnDeductionMenu() {
		deduction.click();
		return new DeductionPage(driver);
	}
	
	public TimeSheet clickOnTimeSheetMenu() {
		TimeSheetPage.click();
		return new TimeSheet(driver);
	}

}
