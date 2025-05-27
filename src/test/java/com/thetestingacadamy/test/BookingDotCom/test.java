package com.thetestingacadamy.test.BookingDotCom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import java.util.List;

public class test {
  @Test
  public void tester() {
      WebDriver driver = new ChromeDriver();
      driver.get("https://www.booking.com/");
      driver.manage().window().maximize();
      WebElement Flights=driver.findElement(By.xpath("//a[@id='flights']"));
        Flights.click();
        WebElement ToFlightSearchBox=driver.findElement(By.xpath("//span[text()='Where to?']"));
        WebElement ToFlightTextBox=driver.findElement(By.xpath("//input[@placeholder='Airport or city']"));

      try {
          Thread.sleep(3000);
      } catch (InterruptedException e) {
          throw new RuntimeException(e);
      }
     ToFlightSearchBox.click();
      try {
          Thread.sleep(3000);
      } catch (InterruptedException e) {
          throw new RuntimeException(e);
      }
      Actions actions=new Actions(driver);
        actions.moveToElement(ToFlightTextBox).sendKeys("India").build().perform();
      try {
          Thread.sleep(3000);
      } catch (InterruptedException e) {
          throw new RuntimeException(e);
      }
     List<WebElement> fromList=driver.findElements(By.xpath("//ul[@id='flights-searchbox_suggestions']/li"));
     for(WebElement f:fromList){
         if(f.getText().contains("Calgary")){
             f.click();
             break;
         }
     }



     //WebElement oneway=driver.findElement(By.xpath("//span[@class='InputRadio-module__field___VJGJp']"));
    //oneway.click();


      /*WebElement StayButton=driver.findElement(By.xpath("//a[@id='accommodations']"));
      StayButton.click();
      WebElement whereRUGoing=driver.findElement(By.xpath("//input[@placeholder='Where are you going?']"));
      whereRUGoing.sendKeys("Calgary");
      try {
          Thread.sleep(10000);
      } catch (InterruptedException e) {
          throw new RuntimeException(e);
      }
      WebElement selectCalgaryInternationalAirportOption=driver.findElement(By.xpath("//div[contains(text(),'Calgary International')]"));
      selectCalgaryInternationalAirportOption.click();
      WebElement FromDatesSelection=driver.findElement(By.xpath("//span[@data-testid='date-display-field-start']"));
      FromDatesSelection.click();

      WebElement selectFromDate=driver.findElement(By.xpath("//span[@data-date='2025-06-01'][@aria-pressed='false']"));
        selectFromDate.click();

      WebElement selectToDate=driver.findElement(By.xpath("//span[@data-date='2025-06-30'][@aria-pressed='false']"));
      selectFromDate.click();
     WebElement Searchbutton=driver.findElement(By.xpath("//span[contains(text(),'Search')]"));
      Searchbutton.click();

     // }*/



  }
}
