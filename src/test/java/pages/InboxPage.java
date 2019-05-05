package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class InboxPage {


    WebDriver driver;



    By inboxIndicator = By.className("mail-ComposeButton-Text");


    public InboxPage(WebDriver driver) {

        this.driver = driver;

    }

    public void registerUser() {

    }
    public int checkInboxes(){

        return    driver.findElements(inboxIndicator).size();

    }
}