import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebdriverManager {

    public static void main(String[] args) {
        WebDriverManager.chromedriver().browserVersion("110.0.5481.178").setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://google.com");
        driver.close();
        driver.quit();
    }
}
