import com.opencsv.CSVReader;
import com.opencsv.exceptions.CsvValidationException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class HomePage extends BasePage {

    public By SignUpButton=By.xpath("//a[@href='/login']");
    public By Name=By.xpath("//input[@data-qa='signup-name']");
    public By Email=By.xpath("//input[@data-qa='signup-email']");
    public By Submit=By.xpath("//button[@data-qa='signup-button']");
    public HomePage(WebDriver driver) {

        super(driver);
    }
    public void SignupClicking(){
        driver.findElement(SignUpButton).click();
    }

public SignUpPage SubSignUpFrom( String SubName, String SubEmail){
        driver.findElement(Name).sendKeys(SubName);
        driver.findElement(Email).sendKeys(SubEmail);
        driver.findElement(Submit).click();

    return new SignUpPage(driver);
}

  }
