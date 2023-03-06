package test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ExtentreportsBasicDemo {
    private static WebDriver driver = null;

    public static void main(String[] args) {
        ExtentHtmlReporter htmlReporter = new ExtentHtmlReporter("extentReports.html");
        ExtentReports extent = new ExtentReports();
        extent.attachReporter(htmlReporter);
        ;
        ExtentTest test1 = extent.createTest("Google Search test", "This is the Search to validate Google Search");
        String projectPath = System.getProperty("user.dir");
        System.setProperty("www.chrome.driver", projectPath + "drivers\\chromerdriver\\chromedriver.exe");
        driver = new ChromeDriver();
        test1.log(Status.INFO, "Starting Test case");

        driver.get("https://google.com");
        test1.pass("Navigated to google.com");
        driver.findElement(By.xpath("//input[@name='q']")).sendKeys("Siddharth");
        test1.pass("Searched  in the Search Box");
        driver.findElement(By.xpath("//input[@name='q']")).sendKeys(Keys.RETURN);
        test1.pass("Entered from Keyboard");

        driver.close();
        driver.quit();
        test1.info("Test Completed");
        // calling flush writes everything to the log file
        extent.flush();
    }


}


