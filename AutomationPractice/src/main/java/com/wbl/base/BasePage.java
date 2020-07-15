package com.wbl.base;

import com.wbl.pages.SearchResultsPage;
import com.wbl.utils.WebDriverUtil;
import com.wbl.utils.WebdriverWaitUtil;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import java.util.concurrent.TimeUnit;

public class BasePage{

    protected WebDriver driver;
    @FindBy(how = How.ID,using = "global-search-input")
    WebElement searchBox;

    @FindBy(how = How.ID,using = "global-search-submit")
    WebElement searchButton;
    //constructor
    public BasePage(WebDriver driver){

        this.driver = driver;
    }



    public SearchResultsPage search (String searchData) throws InterruptedException {
      //  WebdriverWaitUtil.implicitWait(driver,30, TimeUnit.SECONDS);
      searchBox.sendKeys(searchData);
      searchButton.click();

        Thread.sleep(2000);
       return PageFactory.initElements(driver,SearchResultsPage.class);
    }


}
