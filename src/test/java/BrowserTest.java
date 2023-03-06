import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserTest {
    public static void main(String[] args) {
        String project_path=System.getProperty("user.dir");
        System.setProperty("webdriver.chrome.driver", "D:\\Coding\\Workspace\\Selenium-Java-Framework\\drivers\\chromerdriver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.selenium.dev/");
        String title = driver.getTitle();
        System.out.println(title);
        driver.close();

    }

}
