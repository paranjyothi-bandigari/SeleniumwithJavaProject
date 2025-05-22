package com.thetestingacadamy.pages;

import com.thetestingacadamy.utils.PropertyReader;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import com.thetestingacadamy.base.commonToAllBase;
import org.openqa.selenium.support.PageFactory;

import static com.thetestingacadamy.driver.DriverManager.driver;

public class LoginPage_PF extends commonToAllBase{
    WebDriver driver;

    public LoginPage_PF(WebDriver driver) {
        this.driver = driver;
    }

    @FindBy(id="login-username")
    private WebElement username;
    @FindBy(name="password")
    private WebElement password;
    @FindBy(id="js-login-btn")
    private WebElement signinButton;
    @FindBy(className="notification-box-description")
    private WebElement error_message;



    public String LogintoVWOInvalidCredentialsPF() {
        driver.get("https://app.vwo.com/#/login");
        driver.findElement((By) username).sendKeys(PropertyReader.readKey("invalid_username"));
        driver.findElement((By) password).sendKeys(PropertyReader.readKey("invalid_password"));
        driver.findElement((By) signinButton).click();
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        return error_message.getText();
    }


}
