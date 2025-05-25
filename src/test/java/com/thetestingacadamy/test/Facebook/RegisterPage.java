package com.thetestingacadamy.test.Facebook;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import java.util.List;

public class RegisterPage {

    @Test
    public void registernewuser() {
        WebDriver driver=new ChromeDriver();
        driver.navigate().to("https://www.facebook.com/");
       driver.findElement(By.xpath("//a[@data-testid='open-registration-form-button']")).click();
       driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("Lucy");
        driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("Nagi");
        driver.findElement(By.xpath("//select[@id='month'] ")).click();
        driver.findElement(By.xpath("//option[@value='1' and contains(text(), 'Jan')]")).click();
        driver.findElement(By.xpath("//select[@id='day'] ")).click();
        driver.findElement(By.xpath("//option[@value='5' and contains(text(), '5')]")).click();
        driver.findElement(By.xpath("//select[@id='year'] ")).click();
        driver.findElement(By.xpath("//option[@value='1999' and contains(text(), '1999')]")).click();
        driver.findElement(By.xpath("//input[@value='1']")).click();
        driver.findElement(By.xpath("//input[@name='reg_email__']")).sendKeys("9988776655");
        driver.findElement(By.xpath("//input[@type='password']")).sendKeys("Lucy@1999");



    }
}
