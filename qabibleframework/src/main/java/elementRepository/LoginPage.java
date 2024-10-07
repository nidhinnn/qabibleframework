package elementRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	public LoginPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	WebDriver driver;
	@FindBy(id = "loginform-username")
	WebElement usernameElement;

	@FindBy(id = "loginform-password")
	WebElement passwordElement;

	@FindBy(xpath = "//button[@class='btn btn-default']")
	WebElement loginButton;

	public void inputUsername(String username) {
		usernameElement.sendKeys(username);
	}

	public void inputPassword(String password) {
		passwordElement.sendKeys(password);
	}

	public DashboardPage clickLoginButton() {
		loginButton.click();
		return new DashboardPage(driver);
	}

}
