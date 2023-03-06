import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

public class DesiredCapabilitiesDemo {

    public static void main(String[] args) {
        DesiredCapabilities caps = new DesiredCapabilities();
        caps.setCapability("ignoreProtectedModeSettings",true);
        String project_path=System.getProperty("user.dir");
        System.setProperty("www.chrome.driver",project_path+"drivers\\chromerdriver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.google.com");

    }
}
