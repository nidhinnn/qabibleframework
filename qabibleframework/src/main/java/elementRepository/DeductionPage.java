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
	
	@FindBy(xpath = "//span[@class='select2-selection select2-selection--single']")
	WebElement selectWorker;
	
	@FindBy(id = "select2-deduction-worker_id-result-sejk-1")
	WebElement dennisBenny;
	
	@FindBy(id = "deduction-type")
	WebElement selectDeductionType;
	
	@FindBy(id = "deduction-amount")
	WebElement enterDeductonAmount;
	
	@FindBy(id = "deduction-effective_from")
	WebElement enterDate;
	
	@FindBy(xpath = "//button[@class='btn btn-success']")
	WebElement deductionSaveButton;
	
	public void addDeduction() {
		addDeduction.click();
	}
	
	public void selectWorker() {
		selectWorker.click();
		//dennisBenny.click();
	}
	
	public void dennisBenny() {
		dennisBenny.click();
	}
	
	public String selectDeductionType() {
		return gu.getSelectedValueFromDropDown(selectDeductionType, "CRB");
	}
	
	public void enterDeductonAmount() {
		enterDeductonAmount.sendKeys("25000");
	}
	
	public void enterDate() {
		enterDate.sendKeys("07-10-2024");
	}
	
	public void deductionSaveButton() {
		deductionSaveButton.click();
	}

}
