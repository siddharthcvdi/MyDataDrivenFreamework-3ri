package test;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNGDemo2 {
    WebDriver driver = null;

    @BeforeTest
    public void setUpTest() {
        String projectPath = System.getProperty("user.dir");
        System.setProperty("www.chrome.driver", projectPath + "drivers\\chromerdriver\\chromedriver.exe");
        driver = new ChromeDriver();
    }

    @Test
    public void googleSearch3() {

        driver.get("https://google.com");
        WebElement googleSearch = driver.findElement(By.name("q"));
        googleSearch.sendKeys("Automation Step By Step");
        WebElement search_bttn = driver.findElement(By.xpath("//div[@class='CcAdNb']"));
        search_bttn.click();
        googleSearch.sendKeys(Keys.RETURN);


    }
    @Test
    public void googleSearch2() {

        driver.get("https://google.com");
        WebElement googleSearch = driver.findElement(By.name("q"));
        googleSearch.sendKeys("Automation Step By Step");
        WebElement search_bttn = driver.findElement(By.xpath("//div[@class='CcAdNb']"));
        search_bttn.click();
        googleSearch.sendKeys(Keys.RETURN);


    }


    @AfterTest
    public void tearDowntest() {

        driver.close();
        driver.quit();
        System.out.println("Test is completed");
    }
}
