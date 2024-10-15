package elementRepository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.GeneralUtilities;



public class DeductionPage {
	
	public DeductionPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	GeneralUtilities gu = new GeneralUtilities();

	WebDriver driver;
	
	@FindBy(xpath = "//a[text()='Add Deduction']")
	WebElement addDeduction;
	
	@FindBy(xpath = "//button[@class='btn btn-success']")
	WebElement deductionSaveButton;
	
	@FindBy(xpath = "//p[text()='Worker cannot be blank.']")
	WebElement workerWarningMessage;
	
	@FindBy(xpath = "//p[text()='Type cannot be blank.']")
	WebElement typeWarningMessage;
	
	@FindBy(xpath = "//p[text()='Amount cannot be blank.']")
	WebElement amountWarningMessage;
	
	public void addDeduction() {
		addDeduction.click();
	}
	
	public void deductionSaveButton() {
		deductionSaveButton.click();
	}
	
	public String verifyWorkerWarning() {
		return gu.getElementText(workerWarningMessage);
	}
	
	public String verifyTypeWorkerWarning() {
		return gu.getElementText(typeWarningMessage);
	}
	
	public String verifyAmountWarning() {
		return gu.getElementText(amountWarningMessage);
	}

}
