package com.thetestingacadamy.test.HeroKUApp;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.openqa.selenium.JavascriptExecutor;
import java.util.Set;

import java.time.Duration;
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

   // @Test
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
    //@Test
    public void BrokenImages(){
        WebElement BrokenImages = driver.findElement(By.xpath("//a[@href='/broken_images']"));
        BrokenImages.click();



    }
    //@Test
    public void ChallengingDOM(){
        WebElement ChallengingDOM = driver.findElement(By.xpath("//a[@href='/challenging_dom']"));
        ChallengingDOM.click();

    }
    //@Test
    public void Checkboxes(){
        WebElement Checkboxes = driver.findElement(By.xpath("//a[@href='/checkboxes']"));
        Checkboxes.click();
        WebElement checkbox1=driver.findElement(By.xpath("//input[@type='checkbox'][1]"));
        if(checkbox1.isSelected()){
            System.out.println("checkbox1 Selected");
        }
        else
            checkbox1.click();

        WebElement checkbox2=driver.findElement(By.xpath("//input[@type='checkbox'][2]"));
        if(checkbox2.isSelected()){
            System.out.println("checkbox1 Selected");
        }
        else
            checkbox2.click();
        driver.navigate().back();
    }
    //@Test
    public void ContextMenu(){
        WebElement ContextMenu = driver.findElement(By.xpath("//a[@href='/context_menu']"));
        ContextMenu.click();
        WebElement cm= driver.findElement(By.xpath("//div[@id='hot-spot']"));
        Actions actions=new Actions(driver);
        actions.contextClick(cm).build().perform();
        driver.switchTo().alert().accept();
        driver.navigate().back();

    }
    //@Test
    public void DigestAuthentication(){
        WebElement DigestAuthentication = driver.findElement(By.xpath("//a[@href='/digest_auth']"));
        DigestAuthentication.click();
        //https://admin:admin@the-internet.herokuapp.com/basic_auth
        String username = "admin";
        String password = "admin";
        String domain = "the-internet.herokuapp.com/digest_auth";
        String url = "https://" + username + ":" + password + "@" + domain;
        driver.get(url);

        String text = driver.findElement(By.cssSelector("div.example p")).getText().trim();

        Assert.assertEquals(text, "Congratulations! You must have the proper credentials.");
    }
    //@Test
    public void dragAndDrop(){
        WebElement dragAndDrop = driver.findElement(By.xpath("//a[@href='/drag_and_drop']"));
        dragAndDrop.click();
        WebElement from= driver.findElement(By.xpath("//div[@id='column-a']"));
        WebElement to= driver.findElement(By.xpath("//div[@id='column-b']"));
        Actions actions=new Actions(driver);
        actions.dragAndDrop(from,to).build().perform();

    }
    //@Test
    public void disappearing_elements(){
        WebElement disappearing_elements = driver.findElement(By.xpath("//a[@href='/disappearing_elements']"));
        disappearing_elements.click();

    }
    //@Test
    public void dropdown() {
        WebElement dropdown = driver.findElement(By.xpath("//a[@href='/dropdown']"));
        dropdown.click();
        WebElement dropdownclick = driver.findElement(By.xpath("//select[@id='dropdown']"));
        Select select = new Select(dropdownclick);
        select.selectByVisibleText("Option 1");
    }
    //@Test
    public void dynamic_content(){
        WebElement dynamic_content = driver.findElement(By.xpath("//a[@href='/dynamic_content']"));
        dynamic_content.click();

    }
    //@Test
    public void dynamic_controls(){
        WebElement dynamic_controls = driver.findElement(By.xpath("//a[@href='/dynamic_controls']"));
        dynamic_controls.click();

    }
    //@Test
    public void dynamic_loading(){
        WebElement dynamic_loading = driver.findElement(By.xpath("//a[@href='/dynamic_loading']"));
        dynamic_loading.click();

    }
    //@Test
    public void entry_ad(){
        WebElement entry_ad = driver.findElement(By.xpath("//a[@href='/entry_ad']"));
        entry_ad.click();

    }
    //@Test
    public void exit_intent(){
        WebElement exit_intent = driver.findElement(By.xpath("//a[@href='/exit_intent']"));
        exit_intent.click();

    }
    //@Test
    public void download(){
        WebElement download = driver.findElement(By.xpath("//a[@href='/download']"));
        download.click();

    }
    //@Test
    public void upload(){
        WebElement upload = driver.findElement(By.xpath("//a[@href='/upload']"));
        upload.click();

    }
    //@Test
    public void floating_menu(){
        WebElement floating_menu = driver.findElement(By.xpath("//a[@href='/floating_menu']"));
        floating_menu.click();

    }
    //@Test
    public void forgot_password(){
        WebElement forgot_password = driver.findElement(By.xpath("//a[@href='/forgot_password']"));
        forgot_password.click();

    }
    //@Test
    public void login(){
        WebElement login = driver.findElement(By.xpath("//a[@href='/login']"));
        login.click();

    }
    //@Test
    public void frames(){
        WebElement frames = driver.findElement(By.xpath("//a[@href='/frames']"));
        frames.click();

    }
    //@Test
    public void geolocation(){
        WebElement geolocation = driver.findElement(By.xpath("//a[@href='/geolocation']"));
        geolocation.click();

    }
    //@Test
    public void horizontal_slider(){
        WebElement horizontal_slider = driver.findElement(By.xpath("//a[@href='/horizontal_slider']"));
        horizontal_slider.click();

    }
    //@Test
    public void hovers(){
        WebElement hovers = driver.findElement(By.xpath("//a[@href='/hovers']"));
        hovers.click();

    }
    //@Test
    public void infinite_scroll(){
        WebElement infinite_scroll = driver.findElement(By.xpath("//a[@href='/infinite_scroll']"));
        infinite_scroll.click();

    }
    //@Test
    public void inputs(){
        WebElement inputs = driver.findElement(By.xpath("//a[@href='/inputs']"));
        inputs.click();

    }
    //@Test
    public void jqueryui_menu(){
        WebElement jqueryui_menu = driver.findElement(By.xpath("//a[@href='/jqueryui/menu']"));
        jqueryui_menu.click();

    }
    //@Test
    public void javascript_alerts(){
        WebElement javascript_alerts = driver.findElement(By.xpath("//a[@href='/javascript_alerts']"));
        javascript_alerts.click();

        WebElement element= driver.findElement(By.xpath("//button[@onclick='jsAlert()']"));
        element.click();
        WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(3));
        wait.until(ExpectedConditions.alertIsPresent());
        Alert alert=driver.switchTo().alert();
        alert.accept();

        WebElement elementConfirmation=  driver.findElement(By.xpath("//button[@onclick='jsConfirm()']"));
        elementConfirmation.click();
        wait.until(ExpectedConditions.alertIsPresent());
        alert.dismiss();

        WebElement elementInput= driver.findElement(By.xpath("//button[@onclick='jsPrompt()']"));
        elementInput.click();
        wait.until(ExpectedConditions.alertIsPresent());
        alert.sendKeys("Paran");
        alert.accept();


    }
    //@Test
    public void javascript_error(){
        WebElement javascript_error = driver.findElement(By.xpath("//a[@href='/javascript_error']"));
        javascript_error.click();

    }
    //@Test
    public void key_presses(){
        WebElement key_presses = driver.findElement(By.xpath("//a[@hhref='/key_presses']"));
        key_presses.click();

    }
    //@Test
    public void large(){
        WebElement large = driver.findElement(By.xpath("//a[@href='/large']"));
        large.click();

    }
    //@Test
    public void windows(){
        WebElement windows = driver.findElement(By.xpath("//a[@href='/windows']"));
        windows.click();
        String ParentWindow=driver.getWindowHandle();
        System.out.println("Parant Window is " +ParentWindow);
        driver.findElement(By.xpath("//a[@href='/windows/new']")).click();
        Set<String> WindowHandle=driver.getWindowHandles();
        System.out.println("Window Handles" +WindowHandle);
        for (String handle: WindowHandle){
            driver.switchTo().window(handle);
            if(driver.getPageSource().contains("New Window")){
                System.out.println("Test Case Passed!");
            }
            driver.switchTo().window(ParentWindow);
        }
    }
    //@Test
    public void nested_frames(){
        WebElement nested_frames = driver.findElement(By.xpath("//a[@href='/nested_frames']"));
        nested_frames.click();

    }
    //@Test
    public void notification_message(){
        WebElement notification_message = driver.findElement(By.xpath("//a[@href='/notification_message']"));
        notification_message.click();

    }
    //@Test
    public void redirector(){
        WebElement redirector = driver.findElement(By.xpath("//a[@href='/redirector']"));
        redirector.click();

    }
    //@Test
    public void download_secure(){
        WebElement download_secure = driver.findElement(By.xpath("//a[@href='/download_secure']"));
        download_secure.click();

    }
    //@Test
    public void shadowdom(){
        WebElement shadowdom = driver.findElement(By.xpath("//a[@href='/shadowdom']"));
        shadowdom.click();
       // WebElement SD1=driver.findElement(By.xpath("//span[@slot='my-text']"));
       // SD1.getText();
       // System.out.println(SD1.getText());

        JavascriptExecutor js = (JavascriptExecutor) driver;
        WebElement inputboxPizza = (WebElement) js.executeScript("");

    }
  // @Test
    public void test_js() {
        driver.get("https://selectorshub.com/xpath-practice-page/");
        driver.manage().window().maximize();

        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        JavascriptExecutor js = (JavascriptExecutor) driver;
        WebElement scrool_o_element=driver.findElement(By.xpath("//div[@id='userName']"));
        js.executeScript("arguments[0].scrollIntoView()",scrool_o_element);
        WebElement inputboxPizza = (WebElement) js.executeScript("return document.querySelector('div#userName').shadowRoot.querySelector('div#app2').shadowRoot.querySelector('#pizza');");
        inputboxPizza.sendKeys("farmhouse");


    }
    //@Test
    public void shifting_content(){
        WebElement shifting_content = driver.findElement(By.xpath("//a[@href='/shifting_content']"));
        shifting_content.click();

    }
    //@Test
    public void slow(){
        WebElement slow = driver.findElement(By.xpath("//a[@href='/slow']"));
        slow.click();

    }
    //@Test
    public void tables(){
        WebElement tables = driver.findElement(By.xpath("//a[@href='/tables']"));
        tables.click();
        WebElement table2=driver.findElement(By.xpath("//table[@id='table2']/tbody"));
        List<WebElement> rows2=table2.findElements(By.tagName("tr"));

              for(int i=0;i<rows2.size();i++){
                  List<WebElement> column2=rows2.get(i).findElements(By.tagName("td"));
               for(WebElement c:column2) {
                   System.out.println(c.getText());
                  }
                  }
        WebElement table1=driver.findElement(By.xpath("//table[@id='table1']/tbody"));
        List<WebElement> rows1=table1.findElements(By.tagName("tr"));

        for(int i=0;i<rows1.size();i++){
            List<WebElement> column1=rows1.get(i).findElements(By.tagName("td"));
            for(WebElement c:column1) {
                System.out.println(c.getText());
            }
        }
    }
    //@Test
    public void typos(){
        WebElement typoss = driver.findElement(By.xpath("//a[@href='/typos']"));
        typoss.click();

    }
    //@Test
    public void tinymce(){
        WebElement tinymcex = driver.findElement(By.xpath("//a[@href='/tinymce']"));
        tinymcex.click();

    }
    //@Test
    public void Flipkartsearch(){
        driver.navigate().to("https://www.flipkart.com/");
        driver.manage().window().maximize();
        driver.findElement(By.name("q")).sendKeys("macmini");
        List<WebElement> svgelelements=driver.findElements(By.xpath("//*[name()='svg']"));
        svgelelements.get(0).click();

        List<WebElement> macminilist=driver.findElements(By.xpath("//div[contains(@data-id,'CPU')]/div/a[2]"));
        for(WebElement title:macminilist){
            System.out.println(title.getText());
        }


    }
    //@Test
    public void MakemyTrip() {
        driver.navigate().to("https://www.makemytrip.global/?cc=ca");
        driver.manage().window().maximize();
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        driver.findElement(By.cssSelector("span[data-cy='closeModal']")).click();
        WebElement fromFlights = driver.findElement(By.cssSelector("label[for='fromCity']"));
        fromFlights.click();
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        WebElement FromFlightSearchBox = driver.findElement(By.xpath("input[placeholder='From']"));
        Actions actions = new Actions(driver);
        actions.moveToElement(FromFlightSearchBox).sendKeys("Calgary").build().perform();


    }



}