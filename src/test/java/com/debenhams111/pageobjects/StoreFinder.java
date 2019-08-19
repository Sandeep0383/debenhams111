package com.debenhams111.pageobjects;

import com.debenhams111.driver.DriverFactory;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class StoreFinder extends DriverFactory {
    @FindBy(linkText = "Store Finder")
    private WebElement StoreFinderLink;

    @FindBy(css="[type='text']")
    private WebElement City;

    @FindBy(linkText = "Find Stores")
    private WebElement FindStoreButton;

    public void storeFinder(String city){
        StoreFinderLink.click();
        City.sendKeys(city);
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        FindStoreButton.click();
    }
}



