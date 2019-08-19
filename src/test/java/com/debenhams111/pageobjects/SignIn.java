package com.debenhams111.pageobjects;

import com.debenhams111.driver.DriverFactory;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SignIn extends DriverFactory {
    @FindBy(linkText = "Create Account/Sign In")
    private WebElement account;

    @FindBy(id = "field-1")
    private WebElement email;

    @FindBy(id="field-2")
    private WebElement pass;

    @FindBy(css=".pw-button__inner")
    private WebElement signin;

    @FindBy(css=".t-super-header--username")
    private WebElement sandeepHeader;

    public void sign(){
        account.click();
        email.sendKeys("pundarikakshareddy555@gmail.com ");
        pass.sendKeys("sandipani555");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        signin.click();
    }
    public String header(){
        return sandeepHeader.getText();
    }
}



