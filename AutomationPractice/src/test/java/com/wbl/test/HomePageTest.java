package com.wbl.test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.wbl.base.BaseTest;
import com.wbl.pages.HomePage;
import com.wbl.pages.SearchResultsPage;
import com.wbl.utils.ExcelHelper;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.io.File;
import java.io.IOException;

public class HomePageTest extends BaseTest {
    HomePage hm;

    @Test
    public void heroImagesTest() throws IOException {
        ExtentHtmlReporter htmlReporter = new ExtentHtmlReporter("extentReport.html");

        ExtentReports extent = new ExtentReports();
        extent.attachReporter(htmlReporter);

        ExtentTest test = extent.createTest("heroImagesTest","Easha's test");

        hm = PageFactory.initElements(driver,HomePage.class);
        Assert.assertEquals(hm.heroImages(),5);


        test.log(Status.INFO, "This step shows usage of log(status, details)");

        // info(details)
        test.info("This step shows usage of info(details)");

        // log with snapshot
        test.fail("details", MediaEntityBuilder.createScreenCaptureFromPath("screenshot.png").build());

        // test with snapshot
        test.addScreenCaptureFromPath("screenshot.png");

        // calling flush writes everything to the log file
        extent.flush();
    }

}
