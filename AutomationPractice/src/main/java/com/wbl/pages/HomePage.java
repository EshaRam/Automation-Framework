package com.wbl.pages;

import com.wbl.base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import java.util.List;

public class HomePage extends BasePage {

    @FindBy(how = How.CSS, using = ".ClickThroughImage")
    List<WebElement> images;

    public HomePage(WebDriver driver){
        super(driver);
    }


    public int heroImages(){

       return images.size();
    }
}
