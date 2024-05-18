package StepDefintion;

import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.io.FileReader;
import java.io.IOException;
import java.util.List;
import java.util.Map;

import static pages.LoginPage.*;
import static utility.BaseDriver.driver;
import static utility.BaseDriver.options;

public class Login {
    private static final String JSON_FILE_PATH = "C:/Users/Admin/Desktop/Test/TestingCode/SeleniumTetsingCode/src/test/resources/data.json";
    @Given("Launch the Login page")
    public void launchRegistrationPage() throws InterruptedException {
        options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        System.setProperty("webdriver.chrome.driver",
                System.getProperty("user.dir")+"/src/test/resources/drivers/chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://metaflyer.io/login");
    }
    @Then("Login {string}")
    public void inputInformationForUser(String userNumber, DataTable dataTable) throws IOException {
        JsonObject jsonObject = readJsonFile(JSON_FILE_PATH);
        JsonObject userData = jsonObject.getAsJsonObject(userNumber);

        List<Map<String, String>> rows = dataTable.asMaps(String.class, String.class);
        Map<String, String> userDataa = rows.get(0);

        String name = userData.get("name").getAsString();
        String id = userData.get("id").getAsString();
        String password = userData.get("password").getAsString();
        try {
            loginUser(id,password);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
    private JsonObject readJsonFile(String filePath) throws IOException {
        FileReader reader = new FileReader(filePath);
        JsonParser jsonParser = new JsonParser();
        return (JsonObject) jsonParser.parse(reader);
    }


}
