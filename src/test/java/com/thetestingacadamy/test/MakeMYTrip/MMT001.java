package com.thetestingacadamy.test.MakeMYTrip;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Set;

public class MMT001 {
    WebDriver driver;
    @BeforeTest
    public void start() {
        driver = new ChromeDriver();
        driver.navigate().to("https://www.makemytrip.com/");
        driver.manage().window().maximize();
    }
    @Test
    public void test_mmt1(){
    WebElement contiGlobal=driver.findElement(By.xpath("//a[contains(text(),'Continue to Make')]"));
    contiGlobal.click();
        String ParentWindow=driver.getWindowHandle();
        System.out.println("Parent Window" +ParentWindow);
        Set<String> windowHandles = driver.getWindowHandles();
        System.out.println(windowHandles);


        for (String handle: windowHandles){
            driver.switchTo().window(handle);
            if(driver.getPageSource().contains("New Window")){
                System.out.println("Test Case Passed!");
            }
            //driver.switchTo().window(ParentWindow);
        }
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        WebElement cross=driver.findElement(By.xpath("//span[@data-cy='closeModal']"));
        cross.click();
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
       WebElement departureDate= driver.findElement(By.xpath("//p[@data-cy='departureDate']"));
       departureDate.click();
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
       // WebElement july=driver.findElement(By.xpath("//div[@class='DayPicker-Month'][2]"));
       // WebElement getprice= july.findElement(By.xpath("//div[@class='dateInnerCell']/p[2]"));
        WebElement selectDate1=driver.findElement(By.xpath("//div[@aria-label='Sat Jun 14 2025']"));
        selectDate1.click();
        WebElement returnDate= driver.findElement(By.xpath("//p[@data-cy='returnDefaultText']"));
        returnDate.click();
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        WebElement selectDate2=driver.findElement(By.xpath("//div[@aria-label='Wed Jul 16 2025']"));
        selectDate2.click();
        WebElement Search=driver.findElement(By.xpath("//a[contains(text(),'Search')]"));
        Search.click();
        //getprice.getText();
       // System.out.println( getprice.getText());

       //WebElement selectDate= driver.findElement(By.xpath("//div[@aria-label='Fri Jun 27 2025']"));
       //selectDate.click();
        //ArrayList<WebElement> ll= driver.findElements(By.xpath("//p[@class=' todayPrice']"));

       // price- //p[@class=' todayPrice']/
        // dates - //p[@class=' todayPrice']/preceding-sibling::p

    }

    @AfterTest
    public void tear(){
       // driver.close();
    }
}
