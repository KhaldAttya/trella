package com.trella.pages.home;

import com.trella.pages.TrellaWebBasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage extends TrellaWebBasePage {
    //Web elements
    @FindBy(xpath = "//*[@id='wrapper']//h2[.='Banking']")
    WebElement bankingButton;
    @FindBy(xpath = "//*[@class='logo']")
    WebElement logo;

    public HomePage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
        fluentWaitForElement(logo);
    }

    public void goToBanking() {
        actions.moveToElement(bankingButton).build().perform();
        bankingButton.click();
    }
}