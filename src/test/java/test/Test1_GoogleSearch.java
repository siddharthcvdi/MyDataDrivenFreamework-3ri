package test;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test1_GoogleSearch {
	public static void main(String[] args) throws InterruptedException {
		googleSearch();

	}

	public static void googleSearch() throws InterruptedException {
		String projectPath = System.getProperty("user.dir");
		System.setProperty("www.chrome.driver", projectPath + "drivers\\chromerdriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://google.com");
		WebElement googleSearch = driver.findElement(By.name("q"));
		googleSearch.sendKeys("Automation Step By Step");
		WebElement search_bttn = driver.findElement(By.xpath("//div[@class='CcAdNb']"));
		search_bttn.click();
		googleSearch.sendKeys(Keys.RETURN);
		System.out.println("Test is completed");

	}
}
