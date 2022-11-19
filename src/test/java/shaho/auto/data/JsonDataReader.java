package shaho.auto.data;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import com.google.gson.JsonIOException;
import com.google.gson.JsonSyntaxException;

public class JsonDataReader {
    public String firstName, lastName, address, city, telephone, petName, petBirthdate, type;

    public void JsonReader() throws JsonIOException, JsonSyntaxException, IOException, ParseException {

        String filePath = System.getProperty("user.dir") + "/src/test/java/shaho/auto/data/userData.json";
        File srcFile = new File(filePath);
        JSONParser parser = new JSONParser();
        JSONArray jsonArray = (JSONArray) parser.parse(new FileReader(srcFile));

        for (Object jsonObj : jsonArray) {
            JSONObject person = (JSONObject) jsonObj;
            firstName = (String) person.get("firstname");
            lastName = (String) person.get("lastname");
            address = (String) person.get("address");
            city = (String) person.get("city");
            telephone = (String) person.get("telephone");
            petName = (String) person.get("petName");
            petBirthdate = (String) person.get("petBirthdate");
            type = (String) person.get("type");
        }
    }


}
