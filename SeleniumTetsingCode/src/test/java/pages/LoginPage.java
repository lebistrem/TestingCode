package pages;

import org.openqa.selenium.By;

import static utility.BaseDriver.driver;
public class LoginPage {
    public static String inputId ="//input[@name='id']";
    public static String inputPassword ="//input[@name='password']";
    public static String loginBtn ="//button[@type='submit']";
    public static void loginUser (String id, String password) throws InterruptedException {
        Thread.sleep(3000);
        driver.findElement(By.xpath(inputId)).sendKeys(id);
        System.out.println("Input id");
        Thread.sleep(3000);
        driver.findElement(By.xpath(inputPassword)).sendKeys(password);
        System.out.println("Input password");
        Thread.sleep(3000);
        driver.findElement(By.xpath(loginBtn)).click();
    }
}