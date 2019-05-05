package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.annotations.Test;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.WebDriverWait;

import org.openqa.selenium.By;

public class RegistrationPage {


    WebDriver driver;
    By loginField = By.id("passp-field-login");
    By passwordField = By.id("passp-field-passwd");


    By buttonSubmit = new By.ByXPath("//button[@type='submit']");


    public RegistrationPage(WebDriver driver) {

        this.driver = driver;

    }

    public void registerUser() {
        WebDriverWait wait = new WebDriverWait(driver,2000);
        driver.findElement(loginField).sendKeys("alx.test@yandex.ru");
        driver.findElement(buttonSubmit).click();

        wait.until(ExpectedConditions.visibilityOfElementLocated(passwordField));
        wait.until(ExpectedConditions.visibilityOfElementLocated(buttonSubmit));

        driver.findElement(passwordField).sendKeys("Test123");
        driver.findElement(buttonSubmit).click();
    }
}