package elementRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.GeneralUtilities;

public class ClientsPage {
	
	public ClientsPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	GeneralUtilities gu = new GeneralUtilities();

	WebDriver driver;
	
	@FindBy(id = "clientsearch-client_name")
	WebElement clientName;
	
	@FindBy(id = "clientsearch-id")
	WebElement clientId;
	
	@FindBy(xpath = "//button[@class='btn btn-primary']")
	WebElement searchButton;
	
	@FindBy(xpath = "//button[text()='Reset']")
	WebElement resetButton;
	
	public String enterClientName() {
		clientName.sendKeys("Haritha");
		return "Haritha";
	}
	
	public void enterClientId() {
		clientId.sendKeys("5");
	}
	
	public void clickOnSearchButton() {
		searchButton.click();
	}
	
	public String verifyTextOfResetButton() {
		return gu.getElementText(resetButton);
	}

}
