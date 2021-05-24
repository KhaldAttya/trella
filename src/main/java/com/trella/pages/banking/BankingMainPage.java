package com.trella.pages.banking;

import com.trella.pages.TrellaWebBasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BankingMainPage extends TrellaWebBasePage {
    //Web elements
    @FindBy(xpath = "//*[@class='mainHeading']")
    private WebElement mainHeading;

    @FindBy(xpath = "//*[@ng-click='manager()']")
    private WebElement bankManagerLogin;

    public BankingMainPage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
        switchToWindowByTitle("Banking App");
        fluentWaitForElement(mainHeading);
    }

    public void goToBankManagerLogin() {
        actions.moveToElement(bankManagerLogin).build().perform();
        bankManagerLogin.click();
    }
}