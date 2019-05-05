package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.util.concurrent.TimeUnit;

import static java.lang.Thread.sleep;


public class SendPage {


    WebDriver driver;



    By sendFieldIndicator = By.className("ns-view-compose-fields-box");
    By recepientField  = new By.ByXPath("//div[contains(text(),\"Кому\")]/following::div");


    By countMails = By.className("ns-view-messages-item-wrap");


    public SendPage(WebDriver driver) {

        this.driver = driver;

    }

    public void sendMail() {
//        recepientField.findElement(driver).sendKeys("alex7851@yandex.ru");

        driver.navigate().refresh();

    }
    public boolean checkSendForm(){

        return     driver.findElements(sendFieldIndicator).size()==1;

    }
}