package com.trella.pages.banking;

import com.trella.pages.TrellaWebBasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BankManagerPage extends TrellaWebBasePage {
    //Web elements
    @FindBy(xpath = "//*[@ng-click='addCust()']")
    private WebElement addCustomer;

    @FindBy(xpath = "//*[@ng-click='openAccount()']")
    private WebElement openAccount;

    @FindBy(xpath = "//*[@ng-click='showCust()']")
    private WebElement showCustomer;

    public BankManagerPage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
        fluentWaitForElement(addCustomer);
    }

    public void clickOnAddCustomerButton() {
        actions.moveToElement(addCustomer).build().perform();
        addCustomer.click();
    }
    public void clickOnOpenAccountButton() {
        actions.moveToElement(openAccount).build().perform();
        openAccount.click();
    }
    public void clickOnCustomersButton() {
        actions.moveToElement(showCustomer).build().perform();
        showCustomer.click();
    }
}