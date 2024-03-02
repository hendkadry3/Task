import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import java.io.FileReader;
import java.io.IOException;

public class JsonReader {

    String Name, Email,Password ,Day,Month,Year,FirstName,LastName,
            Company,Address,Address2,Country,State,City,ZipCode,Mobile;

    public void jsonReader() throws IOException, ParseException {
        FileReader reader = new FileReader("src/Resources/FormData.Json");
        JSONParser jsonparser = new JSONParser();
        Object obj = jsonparser.parse(reader);
     //   JSONObject jsonObj = (JSONObject) obj;
        JSONArray usersList = (JSONArray) obj;
        for(int i=0;i<usersList.size();i++)
        {
            JSONObject users = (JSONObject) usersList.get(i);
            JSONObject jsonObj = (JSONObject) users.get("users");

        Password = (String) jsonObj.get("password");
        Day = (String) jsonObj.get("day");
        Month = (String) jsonObj.get("month");
        Year = (String) jsonObj.get("year");
        FirstName = (String) jsonObj.get("firstname");
        LastName = (String) jsonObj.get("lastname");
        Company = (String) jsonObj.get("company");
        Address = (String) jsonObj.get("address");
        Address2 = (String) jsonObj.get("address2");
        Country = (String) jsonObj.get("country");
        State = (String) jsonObj.get("state");
        City = (String) jsonObj.get("city");
        ZipCode = (String) jsonObj.get("zipcode");
        Mobile = (String) jsonObj.get("mobilenumber");
    }
}
    public void jsonReader2() throws IOException, ParseException {
        FileReader reader = new FileReader("src/Resources/SubFormData.Json");
        JSONParser jsonparser = new JSONParser();
        Object obj = jsonparser.parse(reader);
        //   JSONObject jsonObj = (JSONObject) obj;
        JSONArray usersList = (JSONArray) obj;
        for(int i=0;i<usersList.size();i++) {
            JSONObject users = (JSONObject) usersList.get(i);
            JSONObject jsonObj = (JSONObject) users.get("users");

            Name = (String) jsonObj.get("name");
            Email = (String) jsonObj.get("email");
        }
    }
}