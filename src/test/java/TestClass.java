
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pages.InboxPage;
import pages.RegistrationPage;
import pages.SendPage;
import pages.SendingPage;
import org.openqa.selenium.By;


import java.util.concurrent.TimeUnit;

import static java.lang.Thread.sleep;


public class TestClass {

//    @FindBy(id="passp-field-login")
//    public WebElement loginField;


    WebDriver driver;

    @BeforeTest

    public void setup() {

        driver = new ChromeDriver();

        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        driver.get("https://yandex.ru");
        By enterField = new By.ByXPath("//a[@class='home-link home-link_black_yes']");
        driver.findElement(enterField).click();
    }


    RegistrationPage regPage;
    InboxPage inboxPage;
    SendPage sendPage;
    SendingPage sendingPage;


    @Test


    public void CheckSomething() {


        regPage = new RegistrationPage(driver);
        inboxPage = new InboxPage(driver);
        regPage.registerUser();
        inboxPage.countMails();
        sendingPage.sendMail();


    }


}
