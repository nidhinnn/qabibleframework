package utilities;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
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

	public static void uploadFile(WebDriver driver, WebElement uploadButton, String filePath) throws AWTException {

		// put path to your image in a clipboard
		StringSelection ss = new StringSelection("C://Users//Alvin//Desktop//Desktop//tutorial.pptx");
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss, null);

		//WebElement uploadButton = driver.findElement(By.xpath("//input[@id='uploadfile_0']"));

		Actions action = new Actions(driver);
		action.moveToElement(uploadButton).click().perform();

		Robot robot = new Robot();
		robot.delay(1000);

        //Keyboard actions
		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_V);

		robot.delay(1000);

		robot.keyRelease(KeyEvent.VK_CONTROL);
		robot.keyRelease(KeyEvent.VK_V);

		robot.delay(1000);

		robot.keyPress(KeyEvent.VK_ENTER);
		robot.delay(1000);
		robot.keyRelease(KeyEvent.VK_ENTER);
		
	}
	
}

