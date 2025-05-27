package com.thetestingacadamy.test.Facebook;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.util.List;

public class FlipkartSearchMacMini {
    @Test
    public void SearchMM() {
        WebDriver driver = new ChromeDriver();
        driver.navigate().to("https://www.flipkart.com/");
        WebElement mm= driver.findElement(By.xpath("//input[@name='q']"));
        mm.sendKeys("MacMini");
        driver.findElement(By.xpath("//button[@type='submit']")).click();
        List<WebElement> mmlist=driver.findElements(By.cssSelector("a.wjcEIp"));
        List<WebElement> mmlistprice=driver.findElements(By.cssSelector("div.Nx9bqj"));
        int minlist=Math.min(mmlistprice.size(),mmlist.size());
        for(int i=0;i<minlist;i++){
            System.out.println("Header " +mmlist.get(i).getText()+ "Price " +mmlistprice.get(i).getText());
        }



    }
}
