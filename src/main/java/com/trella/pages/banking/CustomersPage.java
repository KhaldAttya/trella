package com.trella.pages.banking;

import com.trella.models.Customer;
import com.trella.pages.TrellaWebBasePage;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class CustomersPage extends TrellaWebBasePage {
    //Web elements
    @FindBy(css = "tbody tr")
    private List<WebElement> customerEntries;
    @FindBy(xpath = "//*[@ng-model='searchCustomer']")
    private WebElement searchBar;

    public CustomersPage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
        fluentWaitForElement(searchBar);
    }
    public void verifyCustomerOrder(Customer customer){
       String customerEntryText = customerEntries.get(customer.getId()-1).getAttribute("innerText");
       Assert.assertTrue(customerEntryText.contains(customer.getFirstName()));
       Assert.assertTrue(customerEntryText.contains(customer.getLastName()));
       Assert.assertTrue(customerEntryText.contains(customer.getPostalCode()));
    }

}