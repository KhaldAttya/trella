package com.trella.pages.banking;

import com.trella.models.Customer;
import com.trella.pages.TrellaWebBasePage;
import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddCustomerPage extends TrellaWebBasePage {
    //Web elements
    @FindBy(xpath = "//*[@ng-model='fName']")
    private WebElement firstName;

    @FindBy(xpath = "//*[@ng-model='lName']")
    private WebElement lastName;

    @FindBy(xpath = "//*[@ng-model='postCd']")
    private WebElement postalCode;

    @FindBy(xpath = "//*[@type='submit']")
    private WebElement addCustomerButton;

    public AddCustomerPage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }

    public void populateCustomerData(Customer customer) {
        fluentWaitForElement(firstName);
        firstName.sendKeys(customer.getFirstName());
        lastName.sendKeys(customer.getLastName());
        postalCode.sendKeys(customer.getPostalCode());
    }

    public void clickAddCustomerButton() {
        fluentWaitForElement(addCustomerButton);
        actions.moveToElement(addCustomerButton).build().perform();
        addCustomerButton.click();
    }

    public int getAddedCustomerId(){
        Alert alert = driver.switchTo().alert();
        String alertMessage= alert.getText();
        int id = Integer.parseInt(alertMessage.replaceAll("[^0-9]", ""));
        alert.accept();
        return id;
    }
}