package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

//xpaths and  Page objects methods are in this class
public class GoogleSearchPageObjects {
	WebDriver driver = null;
	By text_box = By.xpath("//input[@name='q']");

	public GoogleSearchPageObjects(WebDriver driver) {

		this.driver = driver;
	}

	public void searTextInSearchBox(String text) {
		driver.findElement(text_box).sendKeys(text);
		;

	}

	public void clickEnterButton() {
		driver.findElement(text_box).sendKeys(Keys.RETURN);
	}
}
