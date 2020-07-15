package com.wbl.utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class WebdriverWaitUtil {

    public static WebElement waitForElementVisible(WebDriver driver, long timeInSecs, WebElement element){

        WebDriverWait wait = new WebDriverWait(driver, timeInSecs);
        element = wait.until(ExpectedConditions.visibilityOf(element));
        return element;
    }

    public static void implicitWait(WebDriver driver, long timeInSecs, TimeUnit unit){

        driver.manage().timeouts().implicitlyWait(timeInSecs,unit);
    }

}
