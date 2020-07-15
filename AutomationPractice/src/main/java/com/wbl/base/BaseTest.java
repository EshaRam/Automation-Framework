package com.wbl.base;

import com.wbl.utils.ConfigUtil;
import com.wbl.utils.Constants;
import com.wbl.utils.ScreenshotUtil;
import com.wbl.utils.WebDriverUtil;
import org.openqa.selenium.WebDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

public class BaseTest {

   protected WebDriver driver;
   protected static String url;
   protected static String browser;

   @BeforeSuite

   public void beforeSuite() {
       ConfigUtil configUtil = new ConfigUtil("/Users/easwarimuthu/IdeaProjects/AutomationPractice/src/main/Resources/Config.Properties");

       url = ConfigUtil.prop.getProperty("stageUrl");
       browser= ConfigUtil.prop.getProperty("browser");


   }
    @BeforeMethod

    public void setUp(){

        driver = WebDriverUtil.getDriver(browser);
        driver.get(url);
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();

    }
    @AfterMethod
    public void tearDown(ITestResult rs){
       if(ITestResult.FAILURE==rs.getStatus()){
           ScreenshotUtil.takescreenshot(rs.getName(),driver);
       }
        driver.quit();
    }

}
