import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpaths {

    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://google.com");
        WebElement input_box=driver.findElement(By.xpath("//input[@title='Search']"));
        input_box.sendKeys("Siddharth");
        driver.close();
        driver.quit();


    }
}
