import com.opencsv.CSVReader;
import com.opencsv.exceptions.CsvValidationException;
import org.bouncycastle.pqc.crypto.util.PQCOtherInfoGenerator;
import org.json.simple.parser.ParseException;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.io.FileReader;
import java.io.IOException;

public class SignUpTests extends BaseTest{

    SignUpPage signUpPage;
    SignoutPage signoutPage;

    @Test(priority = 1)
    public void SignupClicking(){
        homePage.SignupClicking();
    }

    @Test(priority = 2)
    public void SignUpFromJson() throws IOException, ParseException {

        JsonReader jsonReaderObj=new JsonReader();
        jsonReaderObj.jsonReader();
        jsonReaderObj.jsonReader2();

        signUpPage= homePage.SubSignUpFrom(jsonReaderObj.Name, jsonReaderObj.Email);
        signUpPage.FullsignUpForm(jsonReaderObj.Password, jsonReaderObj.Day, jsonReaderObj.Month, jsonReaderObj.Year,
                jsonReaderObj.FirstName, jsonReaderObj.LastName,
                jsonReaderObj.Company,jsonReaderObj.Address, jsonReaderObj.Address2, jsonReaderObj.Country,
                jsonReaderObj.State, jsonReaderObj.City, jsonReaderObj.ZipCode , jsonReaderObj.Mobile);
        org.testng.Assert.assertEquals(driver.findElement(signUpPage.successfullMessage).getText(),"ACCOUNT CREATED!");


    }
    @Test(priority = 3)
    public void Continue(){
                signoutPage=signUpPage.ContinueButtonClicking();
      //  signoutPage.IfDisplyed();

    }

    @Test(priority = 4)
    public void SignOut(){
        signoutPage.Logout();
        Assert.assertEquals(driver.getCurrentUrl(),"https://automationexercise.com/login");
    }


}
