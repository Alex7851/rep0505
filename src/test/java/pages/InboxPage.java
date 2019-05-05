package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.util.concurrent.TimeUnit;

import static java.lang.Thread.sleep;

public class InboxPage {


    WebDriver driver;



    By inboxIndicator = By.className("mail-ComposeButton-Text");
    By searchField = By.className("textinput__control");
    By enterIco  = new By.ByXPath("//div[@class='mail-SearchContainer has-left-gap']/button");


    By countMails = By.className("ns-view-messages-item-wrap");


    public InboxPage(WebDriver driver) {

        this.driver = driver;

    }

    public void countMails() {
        driver.findElement(searchField).sendKeys("alex7851@yandex.ru");

        driver.findElement(enterIco).click();
        Thread.sleep(1000);
        driver.manage().timeouts().implicitlyWait(3000, TimeUnit.SECONDS);
        int cntMails= driver.findElements(countMails).size();
        System.out.println("Количество писем " + cntMails);
    }
    public boolean checkInboxes(){

        return     driver.findElements(inboxIndicator).size()==1;

    }
}