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
import java.security.SecureRandom;
import java.util.List;
import java.util.Map;

import static pages.RegistrationPage.*;
import static utility.BaseDriver.driver;
import static utility.BaseDriver.options;

public class Registration {
    private static final String CHARACTERS = "abcdefghijklmnopqrstuvwxyz0123456789_";
    private static final SecureRandom random = new SecureRandom();

    public static String generateID(int length) {
        StringBuilder sb = new StringBuilder(length);
        sb.append(CHARACTERS.charAt(random.nextInt(26)));
        for (int i = 1; i < length; i++) {
            sb.append(CHARACTERS.charAt(random.nextInt(CHARACTERS.length())));
        }
        return sb.toString();
    }


    public static void main(String[] args) {
        // Example usage:
        String generatedID = generateID(8);
        System.out.println("Generated ID: " + generatedID);
    }
    private static final String JSON_FILE_PATH = "C:/Users/Admin/Desktop/Test/TestingCode/SeleniumTetsingCode/src/test/resources/data.json";
    @Given("Launch the Individual Registration page")
    public void launchIndividualRegistrationPage() throws InterruptedException {
        options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        System.setProperty("webdriver.chrome.driver",
                System.getProperty("user.dir")+"/src/test/resources/drivers/chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://metaflyer.io/register");
        clickIndividualMemberSelection();
    }
    @Given("Launch the Group Registration page")
    public void launchGroupRegistrationPage() throws InterruptedException {
        options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        System.setProperty("webdriver.chrome.driver",
                System.getProperty("user.dir")+"/src/test/resources/drivers/chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://metaflyer.io/register");
        clickGrouprSelection();
    }
    @Then("Individual member registration for {string}")
    public void inputInformationForUser(String userNumber, DataTable dataTable) throws IOException {
        JsonObject jsonObject = readJsonFile(JSON_FILE_PATH);
        JsonObject userData = jsonObject.getAsJsonObject(userNumber);

        List<Map<String, String>> rows = dataTable.asMaps(String.class, String.class);
        Map<String, String> userDataa = rows.get(0);

        String name = userData.get("name").getAsString();
        String id = generateID(8);
        System.out.println("ID" + id);
        String password = userData.get("password").getAsString();
        String verify_password = userData.get("verify_password").getAsString();
        String email = generateID(5)+"@example.com";
        String phone_number = userData.get("phone_number").getAsString();
        String Terms_number = userData.get("Terms_number").getAsString();
        try {
            in_FillInformations(name,
                    id,
                    password,
                    verify_password,
                    email,
                    phone_number,
                    Terms_number);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
    @Then("Group member registration for {string}")
    public void inputInformationForUser_Group(String userNumber, DataTable dataTable) throws IOException {
        JsonObject jsonObject = readJsonFile(JSON_FILE_PATH);
        JsonObject userData = jsonObject.getAsJsonObject(userNumber);

        List<Map<String, String>> rows = dataTable.asMaps(String.class, String.class);
        Map<String, String> userDataa = rows.get(0);

        String name = userData.get("name").getAsString();
        String id = userData.get("id").getAsString();
        String password = userData.get("password").getAsString();
        String verify_password = userData.get("verify_password").getAsString();
        String email = userData.get("email").getAsString();
        String phone_number = userData.get("phone_number").getAsString();
        String mutual = userData.get("mutual").getAsString();
        String representative_name = userData.get("representative_name").getAsString();
        String bussiness_registration = userData.get("bussiness_registration").getAsString();

        try {
            gr_FillInformations(name,
                    id,
                    password,
                    verify_password,
                    email,
                    phone_number,
                    mutual,
                    representative_name,
                    bussiness_registration);
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
