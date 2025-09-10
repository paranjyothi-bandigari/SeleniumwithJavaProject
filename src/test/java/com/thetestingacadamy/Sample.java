package com.thetestingacadamy;
import java.util.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class Sample {

    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("http://madhank93.github.io/");
        driver.get("https://www.google.com/");
        driver.navigate().back();
    }
}
