package com.trella.pages.banking;

import com.trella.models.Customer;
import com.trella.pages.TrellaWebBasePage;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class OpenAccountPage extends TrellaWebBasePage {
    //Web elements
    @FindBy(id = "userSelect")
    private WebElement userSelect;

    public OpenAccountPage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
        fluentWaitForElement(userSelect);
    }
    public void selectCustomer(Customer customer){
        Select customerName = new Select(userSelect);
        customerName.selectByValue(customer.getFirstName()+" "+customer.getLastName());
    }

}