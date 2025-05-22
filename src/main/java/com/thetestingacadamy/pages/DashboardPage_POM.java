package com.thetestingacadamy.pages;
import com.thetestingacadamy.base.commonToAllBase;
import org.openqa.selenium.By;

public class DashboardPage_POM extends commonToAllBase{
    public DashboardPage_POM(){

    }


    // Page Locators
    By userNameOnDashboard = By.cssSelector("[data-qa=\"lufexuloga\"]");



    // Page Actions
    public String loggedInUserName() {
        presenceOfElement(userNameOnDashboard);
        return getElement(userNameOnDashboard).getText();
    }

}
