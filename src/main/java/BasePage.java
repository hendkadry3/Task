import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BasePage {
    //protected WebDriver driver;
    ChromeDriver driver;
    public BasePage(WebDriver driver)
    {

        this.driver= (ChromeDriver) driver;
    }
}
