package utility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class BaseDriver {
    public static WebDriver driver ;
    public static ChromeOptions options;
    public BaseDriver(){
        options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        this.driver = driver;
        System.setProperty("webdriver.chrome.driver",
                System.getProperty("user.dir")+"/src/test/resources/drivers/chromedriver.exe");
        this.driver = new ChromeDriver();
        driver.get("https://metaflyer.io/register");
    }
    public void closeBrowser(){
        this.driver.close();
    }
}
