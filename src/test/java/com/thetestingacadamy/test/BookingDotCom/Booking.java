package com.thetestingacadamy.test.BookingDotCom;

import com.thetestingacadamy.driver.DriverManager;
import com.thetestingacadamy.pages.Booking_POM;
import com.thetestingacadamy.pages.LoginPage_POM;
import com.thetestingacadamy.test.VWOWebsite.TestVWOLoginPOM;
import com.thetestingacadamy.utils.PropertyReader;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.Test;
import com.thetestingacadamy.base.commonToAllTest;

import static org.assertj.core.api.Assertions.assertThat;

public class Booking extends commonToAllTest{
    //private static final Logger logger = LogManager.getLogger(Booking.class);
    @Test
    public void Bookingheadervalidation(){
        //logger.info("Starting Testcase");
        Booking_POM bookingPom=new Booking_POM(DriverManager.getDriver());
        // WebDriver driver=new ChromeDriver();

        //Assertj

        //assertThat(Error_Msg_Text).isNotNull().isNotEmpty().isNotBlank();

        //Assert.assertEquals(Error_Msg_Text,PropertyReader.readKey("error_message"));

    }


}