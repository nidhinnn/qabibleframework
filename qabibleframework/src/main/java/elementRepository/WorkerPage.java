package elementRepository;

import javax.security.auth.x500.X500Principal;
import javax.xml.xpath.XPath;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import utilities.GeneralUtilities;

public class WorkerPage {
	GeneralUtilities gu = new GeneralUtilities();

	public WorkerPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	WebDriver driver;

	@FindBy(xpath = "//a[text()='Create Worker']")
	WebElement createWorker;
	
	@FindBy(xpath = "//button[@class='btn btn-primary']")
	WebElement searchButton;
	
	@FindBy(id = "worker-title")
	WebElement titleDropDown;
	
	@FindBy(id = "worker-gender")
	WebElement genderDropdown;

	public void clickCreateWorkerMenu() {
		createWorker.click();
	}
	
	public String verifyTextOfSearchButton() {
		return gu.getElementText(searchButton);	
	}
	
	public String verifyFontSizeOfSearchButton() {
		return gu.getElementStyleProperties(searchButton, "font-size");	
	}
	
	public String selectValueFromTitleDropDown() {
		return gu.getSelectedValueFromDropDown(titleDropDown, "Mr");
	}
	
	public String selectValueFromGenderDropdown() {
		return gu.getSelectedValueFromDropDown(genderDropdown, "Male");
		
	}

}
