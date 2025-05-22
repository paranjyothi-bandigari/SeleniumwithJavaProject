package com.thetestingacadamy.base;

import com.thetestingacadamy.utils.PropertyReader;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import static com.thetestingacadamy.driver.DriverManager.getDriver;

public class commonToAllBase {

public void openVWOLoginUrl(){
        getDriver().get(PropertyReader.readKey("url"));
}
public void clickElement(By by){
        getDriver().findElement(by).click();
}
public void clickElement(WebElement by){
        by.click();
}
public void enterInput(By by, String keys){
        getDriver().findElement(by).sendKeys(keys);
}

public void enterInput(WebElement element, String key) {
        element.sendKeys(key);

}
public WebElement presenceOfElement(By elementLocation){
        return new WebDriverWait(getDriver(), Duration.ofSeconds(20)).until(ExpectedConditions.presenceOfElementLocated(elementLocation));
}
public WebElement visibilityOfElement(By elementLocation){
        return new WebDriverWait(getDriver(), Duration.ofSeconds(20)).until(ExpectedConditions.presenceOfElementLocated(elementLocation));

}
public WebElement getElement(By key){
         return getDriver().findElement(key);
}

}
