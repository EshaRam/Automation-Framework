package com.wbl.utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WebDriverUtil {

    public static WebDriver getDriver(String browserName) {
    WebDriver driver;
    switch (browserName){

        case "chrome":

            System.setProperty("webdriver.chrome.driver","/Users/easwarimuthu/IdeaProjects/AutomationPractice/src/main/Resources/Drivers/chromedriver");
            driver = new ChromeDriver();
            break;

        case "firefox":

            System.setProperty("webdriver.gecko.driver","/Users/easwarimuthu/IdeaProjects/AutomationPractice/src/main/Resources/Drivers/geckodriver");
            driver = new FirefoxDriver();
            break;

        default:
            System.setProperty("webdriver.chrome.driver","/Users/easwarimuthu/IdeaProjects/AutomationPractice/src/main/Resources/Drivers/chromedriver");
            driver = new ChromeDriver();

    }
    return driver;

    }


}
