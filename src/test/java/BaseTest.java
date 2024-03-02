import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverService;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;

public class BaseTest {
    protected WebDriver driver;
    protected HomePage homePage;

    @BeforeSuite
    public void SetUp(){

      WebDriverManager.chromedriver().setup();
        driver=new ChromeDriver();
        driver.manage().window().maximize();
        homePage= new HomePage(driver);
    }

    @BeforeClass
    public void NavigateHomePage(){
        driver.get("https://automationexercise.com/");

    }

}
