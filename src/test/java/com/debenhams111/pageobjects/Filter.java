package com.debenhams111.pageobjects;

import com.debenhams111.driver.DriverFactory;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

import java.io.File;
import java.io.IOException;

public class Filter extends DriverFactory {
    @FindBy(linkText = "Men")
    private WebElement menlink;
    @FindBy(linkText = "All shoes & boots")
    private WebElement sublink;
    @FindBy(css="psp-header-container")
    private WebElement pageTitleHeader;

    public void customerSelectedLink() {
        Actions actions = new Actions(driver);
        actions.moveToElement(menlink).build().perform();
    }
    public void selectedLink() {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        sublink.click();
    }
    public void sceenShot()
            throws IOException
    {
        File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(src,new File("C:\\Users\\punda\\IdeaProjects\\com.debenhams111\\src\\test\\java\\screen.png"));
    }
    public String header()
    {try {
        Thread.sleep(1000);
    } catch (InterruptedException e) {
        e.printStackTrace();
    }
        return pageTitleHeader.getText();
    }
}


