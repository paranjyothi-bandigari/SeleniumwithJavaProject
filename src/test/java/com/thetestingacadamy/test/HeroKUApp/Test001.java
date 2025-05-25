package com.thetestingacadamy.test.HeroKUApp;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.util.List;

public class Test001 {
    WebDriver driver;

    @BeforeMethod
    public void init() {
        driver = new ChromeDriver();
        driver.navigate().to("https://the-internet.herokuapp.com/");

    }

    //@Test
    public void PrintAllList() {
        List<WebElement> listOfElements = driver.findElements(By.xpath("//li"));

        for (WebElement element : listOfElements) {
            System.out.println(element.getText());

        }

    }

   // @Test
    public void ABTesting() {
        WebElement ABTesting = driver.findElement(By.xpath("//a[@href='/abtest']"));
        ABTesting.click();
        WebElement getABTestingText = driver.findElement(By.xpath("//div[@id='content']"));
        getABTestingText.getText();
        System.out.println(getABTestingText.getText());
        // String currentHandle= driver.getWindowHandle();
        //System.out.println(currentHandle);
        //driver.switchTo().defaultContent();
    }

    //@Test
    public void addRemoveElemets() {
        WebElement ABTesting = driver.findElement(By.xpath("//a[@href='/add_remove_elements/']"));
        ABTesting.click();
        WebElement AddElement = driver.findElement(By.xpath("//button[@onclick='addElement()']"));
        AddElement.click();
        WebElement DeleteElement = driver.findElement(By.xpath("//button[@onclick='deleteElement()']"));
        DeleteElement.click();
        driver.navigate().back();

    }

    @Test
    public void BasicAuthUserPass() {

        WebElement BasicAuthUserPass = driver.findElement(By.xpath("//a[@href='/basic_auth']"));
        BasicAuthUserPass.click();

        //https://admin:admin@the-internet.herokuapp.com/basic_auth
        String username = "admin";
        String password = "admin";
        String domain = "the-internet.herokuapp.com/basic_auth";
        String url = "https://" + username + ":" + password + "@" + domain;
        driver.get(url);

        String text = driver.findElement(By.cssSelector("div.example p")).getText().trim();

        Assert.assertEquals(text, "Congratulations! You must have the proper credentials.");


}
    @Test
    public void BrokenImages(){
        WebElement BrokenImages = driver.findElement(By.xpath("//a[@href='/broken_images']"));
        BrokenImages.click();
    }
    @Test
    public void ChallengingDOM(){
        WebElement ChallengingDOM = driver.findElement(By.xpath("//a[@href='/challenging_dom']"));
        ChallengingDOM.click();
    }
    @Test
    public void Checkboxes(){
        WebElement Checkboxes = driver.findElement(By.xpath("//a[@href='/checkboxes']"));
        Checkboxes.click();
    }
    @Test
    public void ContextMenu(){
        WebElement ContextMenu = driver.findElement(By.xpath("//a[@href='/context_menu']"));
        ContextMenu.click();
    }
    @Test
    public void DigestAuthentication(){
        WebElement DigestAuthentication = driver.findElement(By.xpath("//a[@href='/digest_auth']"));
        DigestAuthentication.click();
    }




}
