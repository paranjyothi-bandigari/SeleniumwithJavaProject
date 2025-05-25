package com.thetestingacadamy.test.VWOWebsite;

import com.thetestingacadamy.base.commonToAllTest;
import com.thetestingacadamy.driver.DriverManager;
import com.thetestingacadamy.pages.LoginPage_POM;
import com.thetestingacadamy.utils.PropertyReader;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.Test;
import static org.assertj.core.api.Assertions.*;

public class TestVWOLoginPOM extends commonToAllTest {

    private static final Logger logger = LogManager.getLogger(TestVWOLoginPOM.class);
@Test
    public void VWONegativeLogin(){
    logger.info("Starting Testcase");
    LoginPage_POM loginPagePom=new LoginPage_POM(DriverManager.getDriver());
    logger.info("Browser opened");
    String Error_Msg_Text=loginPagePom.LogintoVWOInvalidCredentials(PropertyReader.readKey("invalid_username"),PropertyReader.readKey("invalid_password"));
    logger.info("Verify Username and password");
    //Assertj
    assertThat(Error_Msg_Text).isNotNull().isNotEmpty().isNotBlank();

    Assert.assertEquals(Error_Msg_Text,PropertyReader.readKey("error_message"));

}


}
