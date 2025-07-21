package com.thetestingacadamy.test.MakeMYTrip;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.List;
import java.util.Set;

public class MMTDATESelection {
    WebDriver driver;
    @BeforeTest
    public void start() {
        driver = new ChromeDriver();
        driver.navigate().to("https://www.makemytrip.com/");
        driver.manage().window().maximize();
        WebElement contiGlobal = driver.findElement(By.xpath("//a[contains(text(),'Continue to Make')]"));
        contiGlobal.click();
        String ParentWindow = driver.getWindowHandle();
        System.out.println("Parent Window" + ParentWindow);
        Set<String> windowHandles = driver.getWindowHandles();
        System.out.println(windowHandles);


        for (String handle : windowHandles) {
            driver.switchTo().window(handle);
            if (driver.getPageSource().contains("New Window")) {
                System.out.println("Test Case Passed!");
            }
        }
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        WebElement cross=driver.findElement(By.xpath("//span[@data-cy='closeModal']"));
        cross.click();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
    }
    @Test
    public void test_mmt1(){

        WebElement departureDate= driver.findElement(By.xpath("//p[@data-cy='departureDate']"));
        departureDate.click();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        String month="June";
        WebElement Month= driver.findElement(By.xpath("//div[contains(text(),'"+month+"')]"));
        //WebElement date= driver.findElement(By.xpath("@class='DayPicker-Day DayPicker-Day--selected']/div/p"));
       WebElement dates=driver.findElement(By.xpath("//div[@class='DayPicker-Day DayPicker-Day--selected']/div/p"));
//        List<WebElement> d= (List<WebElement>) dates;
//        for(WebElement dd:d){
//            System.out.println(dd);
//
//        }
        }


    }





