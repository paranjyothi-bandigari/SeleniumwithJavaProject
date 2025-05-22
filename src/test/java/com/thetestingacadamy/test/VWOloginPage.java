package com.thetestingacadamy.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class VWOloginPage {
    @Test
    public void testlogin(){

        WebDriver driver=new ChromeDriver();
        driver.get("https://app.vwo.com");
        System.out.println(driver.getTitle());
        Assert.assertEquals(driver.getTitle(),"Login - VWO");
        Assert.assertEquals(driver.getCurrentUrl(),"https://app.vwo.com/#/login");

        WebElement emailInputBox= driver.findElement(By.id("//input[@id='login-username']"));
        emailInputBox.sendKeys("paranjyothi@gmail.com");

        WebElement emailPasswordBox= driver.findElement(By.id("//input[@id='login-password']"));
        emailPasswordBox.sendKeys("Paran@1994");





    }


}
