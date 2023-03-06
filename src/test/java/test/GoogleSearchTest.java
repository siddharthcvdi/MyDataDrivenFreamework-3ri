package test;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.GoogleSearchPage;

public class GoogleSearchTest {

    public static void main(String[] args) {
        googleSearch();
    }

    public static void googleSearch() {
        String project_path = System.getProperty("user.dir");
        System.setProperty("www.chrome.driver", project_path + "drivers\\chromerdriver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        
        driver.get("https://www.google.com");
        GoogleSearchPage.textbox_search(driver).sendKeys("Automation Step by Step");
        GoogleSearchPage.textbox_search(driver).sendKeys(Keys.RETURN);
        driver.close();
        System.out.println("Test is Completed Successfully");


    }
}
