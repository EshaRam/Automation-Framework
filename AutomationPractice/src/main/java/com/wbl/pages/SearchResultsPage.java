package com.wbl.pages;

import com.wbl.base.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class SearchResultsPage extends BasePage {


    public SearchResultsPage(WebDriver driver){
        super(driver);
       // PageFactory.initElements(driver,SearchResultsPage.class);
    }

    public String getTitle(){
        return driver.getTitle();
    }

}
