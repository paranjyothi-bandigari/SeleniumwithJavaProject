package com.thetestingacadamy.test.VWOWebsite;

import com.thetestingacadamy.Listners.RetryAnalyzer;
import com.thetestingacadamy.base.commonToAllTest;
import com.thetestingacadamy.driver.DriverManager;
import com.thetestingacadamy.pages.LoginPage_PF;
import com.thetestingacadamy.utils.PropertyReader;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import static org.assertj.core.api.Assertions.assertThat;

@Test(retryAnalyzer = RetryAnalyzer.class)
public class TestVWOLoginPF extends commonToAllTest {
    private static final Logger logger = LogManager.getLogger(TestVWOLoginPOM.class);

    @Test
    public void VWONegativeLogin(){
        logger.info("Starting Testcase");
        WebDriver driver = DriverManager.getDriver();

        LoginPage_PF loginPagePf= new LoginPage_PF(driver);
        logger.info("Browser opened");
        String Error_Msg_Text=loginPagePf.LogintoVWOInvalidCredentialsPF();
        logger.info("Verify Username and password");
        //Assertj
        assertThat(Error_Msg_Text).isNotNull().isNotEmpty().isNotBlank();

        Assert.assertEquals(Error_Msg_Text,PropertyReader.readKey("error_message"));

    }
}
