package com.thetestingacadamy;
import java.io.File;
import java.io.IOException;


import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;


public class Sample {

    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("http://madhank93.github.io/");
        driver.get("https://www.google.com/");
        driver.navigate().back();

        File screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
        File destFile = new File("resources.screenshot.png");
        try {
            FileHandler.copy(screenshot, destFile);
        } catch (IOException e) {
            e.printStackTrace();
        }

        //File screenshot1;
        //screenshot1 = ((TakesScreenshot) driver).getFullPageScreenshotAs(OutputType.FILE);


    }
}
