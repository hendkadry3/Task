import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class SignoutPage extends BasePage{

    public SignoutPage(WebDriver driver) {

        super(driver);
    }

    public By Logoutbutton= By.xpath("//a[@href='/logout']");
    public By DissmissButton= By.id("dismiss-button");
    public By Card= By.id("card");
    public By Border= By.id("ad_position_box");

    public void Logout(){
        driver.findElement(Logoutbutton).click();

    }

    public void IfDisplyed(){

            driver.findElement(Border).click();



    }
}
