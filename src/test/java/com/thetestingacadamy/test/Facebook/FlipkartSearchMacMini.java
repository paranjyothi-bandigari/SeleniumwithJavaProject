package com.thetestingacadamy.test.Facebook;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import java.util.Arrays;

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
        Integer minmumber=Integer.parseInt(mmlistprice.get(0).getText().replaceAll("[^0-9]",""));
        for(int i=0;i<minlist;i++){
            int price=Integer.parseInt(mmlistprice.get(i).getText().replaceAll("[^0-9]",""));
            if(price<minmumber){
                minmumber=price;
            }
        }
        System.out.println("Minimum price is "+minmumber);


    }
}
