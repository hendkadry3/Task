import com.opencsv.CSVReader;
import com.opencsv.exceptions.CsvValidationException;
import org.testng.annotations.Test;

import java.io.FileReader;
import java.io.IOException;
import java.util.concurrent.TimeoutException;

public class SignUpCSVTest extends BaseTest{
    SignUpPage signUpPage;
    SignoutPage signoutPage;
    @Test
    public  void SignupCSV() throws IOException, CsvValidationException, TimeoutException {
        homePage.SignupClicking();
        CSVReader reader = new CSVReader(new FileReader("src/Resources/FullFormData.csv"));
        String[] csvCell;
        while ((csvCell = reader.readNext()) != null) {
            String name = csvCell[0];
            String email = csvCell[1];
            String password = csvCell[2];
            String day = csvCell[3];
            String month = csvCell[4];
            String year = csvCell[5];
            String firstname = csvCell[6];
            String lastname = csvCell[7];
            String company = csvCell[8];
            String address = csvCell[9];
            String address2 = csvCell[10];
            String country = csvCell[11];
            String city = csvCell[12];
            String state = csvCell[13];
            String zipcode = csvCell[14];
            String mobilenumber = csvCell[15];
            signUpPage = homePage.SubSignUpFrom(name, email);
            signUpPage.FullsignUpForm(password,day,month,year,firstname,lastname,company,
                    address,address2,country,city,state,zipcode,mobilenumber);
        try {
            signoutPage = signUpPage.ContinueButtonClicking();
            signoutPage.Logout();
            homePage.SignupClicking();
        }catch (Exception e){

        }

        }
    }
}
