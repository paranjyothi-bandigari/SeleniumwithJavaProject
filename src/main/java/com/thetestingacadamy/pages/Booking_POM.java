package com.thetestingacadamy.pages;

import com.thetestingacadamy.base.commonToAllBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Booking_POM extends commonToAllBase {
    WebDriver driver;
    String Actualtextheader;

    public Booking_POM(WebDriver driver) {
        this.driver = driver;
    }

    private By Headingverification= By.xpath("//a[@aria-label='Booking.com']");
    //private By password=By.name("password");
    //private By signinButton=By.id("js-login-btn");
    //private By error_message=By.className("notification-box-description");

    public void BookingPage() {
        driver.get("https://www.booking.com/");


    }
}


