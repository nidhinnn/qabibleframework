package elementRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.GeneralUtilities;

public class TimeSheet {
	public TimeSheet(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	GeneralUtilities gu = new GeneralUtilities();
	WebDriver driver;
	
	@FindBy(xpath = "//button[@class='btn btn-warning btn-responsive playslip']")
	WebElement generatePlayslipButton;
	
	@FindBy(xpath = "//button[@class='btn btn-warning btn-responsive invoice']")
	WebElement generateInvoiceButton;
	
	public String clickOkOnAlertOfGeneratePlayslipButton() {
		generatePlayslipButton.click();
		return gu.clickOkButtonOfAlerts(driver);
	}
	
	public String clickCancelOnAlertOfGeneratePlayslipButton() {
		generatePlayslipButton.click();
		return gu.clickCancelButtonOfAlerts(driver);
	}
	
	public String clickOkOnAlertOfgenerateInvoiceButton() {
		generateInvoiceButton.click();
		return gu.clickOkButtonOfAlerts(driver);
	}
	
	public String clickCancelOnAlertOfgenerateInvoiceButton() {
		generateInvoiceButton.click();
		return gu.clickCancelButtonOfAlerts(driver);
	}

}
