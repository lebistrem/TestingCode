package pages;

import org.openqa.selenium.By;

import static utility.BaseDriver.driver;

public class RegistrationPage {

    public static String Individual_Member_Selection2 ="//*[@id='__nuxt']/div/div[1]/div[2]/div/div/div[1]/p";
    public static String Group_Member_Selection ="//*[@id='__nuxt']/div/div[1]/div[2]/div/div/div[2]/p/font/font";
    public static String inNameInput ="name";
    public static String inPasswordInput ="password";
    public static String inIdInput ="id";
    public static String inPasswordVerifyInput ="password-verify";
    public static String inEmailInput ="email";
    public static String inPhoneInput ="phone";
    public static String in_VialidIdChecked ="//*[@id='__nuxt']/div/div[1]/div[2]/div/form/div[2]/div[3]";
    public static String inDoubleCheckBtn ="//*[@id='__nuxt']/div/div[1]/div[2]/div/form/div[2]/div[2]/button";
    //Agree to Terms of Use *
    public static String inTerm1Input ="//*[@id='__nuxt']/div/div[1]/div[2]/div/form/div[7]/div[2]/div[1]/label"; //I Agree To The Terms Of Use . (Required) - term1
    public static String inTerm2Input ="//*[@id='__nuxt']/div/div[1]/div[2]/div/form/div[7]/div[2]/div[2]/label"; //I Agree To The Personal Information Collection And Use Policy . (Required) - term2
    public static String inTerm3Input ="//*[@id='__nuxt']/div/div[1]/div[2]/div/form/div[7]/div[2]/div[3]/label"; //I Agree To Receive Events/Marketing Benefits Provided By Text/KakaoTalk/Email . (Optional) - term3
    public static String inTerm4Input ="//*[@id='__nuxt']/div/div[1]/div[2]/div/form/div[7]/div[2]/div[4]/label"; //You Must Be 14 Years Or Older. (Required) - term4
    public static String inRegistrationCompleteBtn = "//*[@id='__nuxt']/div/div[1]/div[2]/div/form/div[8]/button[2]";
    public static String grRegistrationCompleteBtn = "//*[@id='__nuxt']/div/div[1]/div[2]/div/form/div[14]/button[2]";
    public static String inBeforeBtn = "//*[@id='__nuxt']/div/div[1]/div[2]/div/form/div[8]/button[1]";
    public static String inRegisterd = "//*[@id='__nuxt']/div/div[1]/div[2]/div/h1";
    public static String grCompanyType = "companyType";
    public static String soleProprietor = "//*[@id='companyType']/option[2]";
    public static String nonProfitCorporation = "//*[@id='companyType']/option[3]";
    public static String forProfitCorporation = "//*[@id='companyType']/option[4]";
    public static String otherOrganizations = "//*[@id='companyType']/option[4]";
    public static String grMutual = "companyName";
    public static String representativeName = "ceo";
    public static String grOpeningDate = "//*[@id='__nuxt']/div/div[1]/div[2]/div/form/div[10]/div[2]/div/div/div[1]/div[1]";
    public static String may15 = "//*[@id='__nuxt']/div/div[1]/div[2]/div/form/div[10]/div[2]/div/div/div[1]/div[2]/div/div[2]/div/div[2]/div[4]/div[4]/div/font/font";
    public static String bussinessRegistration = "businessRegistration";
    public static void clickIndividualMemberSelection() throws InterruptedException {
        Thread.sleep(3000);
        driver.findElement(By.xpath(Individual_Member_Selection2)).click();
        System.out.println("Clicked to Individual Seclection");
    }
    public static void clickGrouprSelection() throws InterruptedException {
        Thread.sleep(3000);
        driver.findElement(By.xpath(Group_Member_Selection)).click();
        System.out.println("Clicked to Group Seclection");
    }
    public static void in_FillInformations (String name, String id, String password, String verify_password,String email, String phone_number, String termNumber) throws InterruptedException {
        Thread.sleep(3000);
        driver.findElement(By.id(inNameInput)).sendKeys(name);
        System.out.println("Input name");
        Thread.sleep(3000);
        driver.findElement(By.id(inIdInput)).sendKeys(id);
        System.out.println("Input id");
        Thread.sleep(3000);
        driver.findElement(By.xpath(inDoubleCheckBtn)).click();
        System.out.println("clicked DoubleCheckBtn");
        Thread.sleep(2000);
        if(driver.findElement(By.xpath(in_VialidIdChecked)).isDisplayed()) {
            driver.findElement(By.id(inPasswordInput)).sendKeys(password);
            System.out.println("Input pw");
            Thread.sleep(3000);
            driver.findElement(By.id(inPasswordVerifyInput)).sendKeys(verify_password);
            System.out.println("Input ver-pw");
            Thread.sleep(3000);
            driver.findElement(By.id(inEmailInput)).sendKeys(email);
            System.out.println("Input mail");
            Thread.sleep(3000);
            driver.findElement(By.id(inPhoneInput)).sendKeys(phone_number);
            System.out.println("Input phone number");
            Thread.sleep(3000);
            driver.findElement(By.xpath(inTerm1Input)).click();
            Thread.sleep(1000);
            System.out.println("Clicked to Term1");
            Thread.sleep(1000);
            driver.findElement(By.xpath(inTerm2Input)).click();
            System.out.println("Clicked to Term2");
            Thread.sleep(1000);
            driver.findElement(By.xpath(inTerm3Input)).click();
            System.out.println("Clicked to Term3");
            Thread.sleep(1000);
            driver.findElement(By.xpath(inTerm4Input)).click();
            System.out.println("Clicked to Term4");
            Thread.sleep(3000);
            driver.findElement(By.xpath(inRegistrationCompleteBtn)).click();
            System.out.println("Clicked to RegistrationCompleteBtn");
        }
    }
       public static void gr_FillInformations (String name, String id, String password, String verify_password,String email, String phone_number, String mutual, String representative_name, String bussiness_registration) throws InterruptedException {
        Thread.sleep(3000);
        driver.findElement(By.id(inNameInput)).sendKeys(name);
        System.out.println("Input name");
        Thread.sleep(3000);
        driver.findElement(By.id(inIdInput)).sendKeys(id);
        System.out.println("Input id");
        Thread.sleep(3000);
        driver.findElement(By.xpath(inDoubleCheckBtn)).click();
        System.out.println("clicked DoubleCheckBtn");
        Thread.sleep(2000);
        if(driver.findElement(By.xpath(in_VialidIdChecked)).isDisplayed()) {
            driver.findElement(By.id(inPasswordInput)).sendKeys(password);
            System.out.println("Input pw");
            Thread.sleep(3000);
            driver.findElement(By.id(inPasswordVerifyInput)).sendKeys(verify_password);
            System.out.println("Input ver-pw");
            Thread.sleep(3000);
            driver.findElement(By.id(inEmailInput)).sendKeys(email);
            System.out.println("Input mail");
            Thread.sleep(3000);
            driver.findElement(By.id(inPhoneInput)).sendKeys(phone_number);
            System.out.println("Input phone number");
            Thread.sleep(3000);
            driver.findElement(By.id(grCompanyType)).click();
            System.out.println("Clicked Group Company type");
            Thread.sleep(3000);
            driver.findElement(By.xpath(otherOrganizations)).click();
            System.out.println("Clicked otherOrganizations");
            Thread.sleep(1000);
            driver.findElement(By.id(grMutual)).sendKeys(mutual);
            System.out.println("Input mutual");
            Thread.sleep(1000);
            driver.findElement(By.id(representativeName)).sendKeys(representative_name);
            System.out.println("Input representativeName");
            Thread.sleep(1000);
            driver.findElement(By.xpath(inTerm1Input)).click();
            Thread.sleep(1000);
            System.out.println("Clicked to Term1");
            Thread.sleep(1000);
            driver.findElement(By.xpath(inTerm2Input)).click();
            System.out.println("Clicked to Term2");
            Thread.sleep(1000);
            driver.findElement(By.xpath(inTerm3Input)).click();
            System.out.println("Clicked to Term3");
            Thread.sleep(1000);
            driver.findElement(By.xpath(inTerm4Input)).click();
            System.out.println("Clicked to Term4");
            Thread.sleep(3000);
            driver.findElement(By.xpath(grRegistrationCompleteBtn)).click();
            System.out.println("Clicked to RegistrationCompleteBtn");
        }

    }

}

