package utility;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.chrome.ChromeOptions;

public class Hooks {
    public static BaseDriver driver;
    public static ChromeOptions options;
    @Before
    public void setUp(){
        driver = new BaseDriver();
    }
    @After
    public void tearDown(){
        driver.closeBrowser();
    }
}
