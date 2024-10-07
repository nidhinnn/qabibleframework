package utilities;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class GeneralUtilities {

	public String getElementText(WebElement element) {
		String text = element.getText();
		return text;
	}
	
	public String getSelectedValueFromDropDown(WebElement element, String valueToSelect) {
		Select select = new Select(element);
		select.selectByValue(valueToSelect);
		WebElement selectedValue = select.getFirstSelectedOption();
		String text = selectedValue.getText();
		return text;
	}
	
	public String getElementStyleProperties(WebElement element, String propertyValue) {
		String text = element.getCssValue(propertyValue);
		return text;
	}
	
	public String getToolTipValue(WebElement element, String titleValue) {
		String value = element.getAttribute(titleValue);
		return value;
	}
	
	public String clickOkButtonOfAlerts(WebDriver driver) {
		String text = driver.switchTo().alert().getText();
		driver.switchTo().alert().accept();
		return text;
	}
	
	public String clickCancelButtonOfAlerts(WebDriver driver) {
		String text = driver.switchTo().alert().getText();
		driver.switchTo().alert().dismiss();
		return text;
	}

}

