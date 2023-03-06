package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import pages.GoogleSearchPageObjects;

public class GoogleSearchPageTest {
	public static void main(String[] args) {
		googleSearchtest();

	}

	public static void googleSearchtest() {
		String projectpath = System.getProperty("user.dir");
		System.setProperty("www.chrome.driver", projectpath + "drivers\\chromerdriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com");
		GoogleSearchPageObjects searchobj = new GoogleSearchPageObjects(driver);
		String text = "Automation Step by Step";
		searchobj.searTextInSearchBox(text);
		searchobj.clickEnterButton();
		driver.close();

	}



}
