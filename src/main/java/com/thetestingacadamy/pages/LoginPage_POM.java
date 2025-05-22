package com.thetestingacadamy.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import com.thetestingacadamy.base.commonToAllBase;

public class LoginPage_POM extends commonToAllBase{
    WebDriver driver;

    public LoginPage_POM(WebDriver driver) {
        this.driver = driver;
    }

    private By username= By.id("login-username");
    private By password=By.name("password");
    private By signinButton=By.id("js-login-btn");
    private By error_message=By.className("notification-box-description");

public String LogintoVWOInvalidCredentials(String user, String pass) {
    driver.get("https://app.vwo.com/#/login");
    driver.findElement(username).sendKeys(user);
    driver.findElement(password).sendKeys(pass);
    driver.findElement(signinButton).click();

    try {
        Thread.sleep(3000);
    } catch (InterruptedException e) {
        throw new RuntimeException(e);
    }
    WebElement error_message=driver.findElement(By.className("notification-box-description"));
String ErrorMessageText=error_message.getText();
String ErrorMessage_Attribute_dataqa=error_message.getAttribute("data-qa");
return ErrorMessageText;
}

}
