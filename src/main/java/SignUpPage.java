import com.opencsv.CSVReader;
import com.opencsv.exceptions.CsvValidationException;
import dev.failsafe.internal.util.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.io.FileReader;
import java.io.IOException;
import java.util.List;
import java.util.Random;

public class SignUpPage extends BasePage{
    public SignUpPage(WebDriver driver) {

        super(driver);
    }

    public By Password = By.id("password");
    public By Day = By.id("days");
    public By Month = By.id("months");
    public By Year = By.id("years");
    public By FirstName = By.id("first_name");
    public By LastName = By.id("last_name");
    public By Company = By.id("company");
    public By Address = By.id("address1");
    public By Address2 = By.id("address2");
    public By Country = By.id("country");
    public By State = By.id("state");
    public By City = By.id("city");
    public By ZipCode = By.id("zipcode");
    public By MobileNumber = By.id("mobile_number");
    public By Gender1 = By.id("uniform-id_gender1");
    public By Gender2 = By.id("uniform-id_gender2");
    public By Gender = By.cssSelector(".clearfix .top ");
    public By Checkbox = By.cssSelector(".checkbox ");
    public By CreateAccount = By.xpath("//button[@data-qa='create-account'] ");

    public  By ContinueButton=By.xpath("//a[@data-qa='continue-button']");
    public  By successfullMessage=By.xpath("//h2[@data-qa='account-created']");



public void FullsignUpForm(String password, String day ,String month, String year ,String firstname
        ,String lastname ,String company, String address ,String address2 ,String country
        ,String state ,String city, String zipcode ,String mobilenumber){

    List<WebElement> Genders= driver.findElements(Gender);
    int size = Genders.size();
    Random random = new Random();
    int randomGender = random.nextInt(size);
    Genders.get(randomGender).click();
    driver.findElement(Password).sendKeys(password);
    Select objSelect =new Select(driver.findElement(Day));
    objSelect.selectByValue(day);
    Select objSelect1 =new Select(driver.findElement(Month));
    objSelect1.selectByValue(month);
    Select objSelect2 =new Select(driver.findElement(Year));
    objSelect2.selectByValue(year);

    List<WebElement> Checkboxs= driver.findElements(Checkbox);
    int Checkboxsize = Genders.size();
    Random random1 = new Random();
    int randomCheckbox = random1.nextInt(Checkboxsize);
    Checkboxs.get(randomCheckbox).click();

    driver.findElement(FirstName).sendKeys(firstname);
    driver.findElement(LastName).sendKeys(lastname);
    driver.findElement(Company).sendKeys(company);
    driver.findElement(Address).sendKeys(address);
    driver.findElement(Address2).sendKeys(address2);
    Select objSelect3 =new Select(driver.findElement(Country));
    objSelect3.selectByValue(country);
    driver.findElement(City).sendKeys(city);
    driver.findElement(State).sendKeys(state);
    driver.findElement(ZipCode).sendKeys(zipcode);
    driver.findElement(MobileNumber).sendKeys(mobilenumber);
    driver.findElement(CreateAccount).click();

}

public SignoutPage ContinueButtonClicking(){
    driver.findElement(ContinueButton).click();
    return new SignoutPage(driver);
    }

}
