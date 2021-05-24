package com.trella.pages;

import com.trella.pages.banking.*;
import com.trella.pages.home.HomePage;
import org.openqa.selenium.WebDriver;

public class PageFactory {
    private final WebDriver driver;

    public PageFactory(WebDriver driver) {
        this.driver = driver;
    }

    public HomePage homePage() {
        return new HomePage(driver);
    }

    public BankingMainPage bankingMainPage() {
        return new BankingMainPage(driver);
    }

    public BankManagerPage bankManagerPage() {
        return new BankManagerPage(driver);
    }

    public AddCustomerPage addCustomerPage() { return new AddCustomerPage(driver); }

    public CustomersPage customersPage() {return new CustomersPage(driver); }
    public OpenAccountPage openAccountPage() {return new OpenAccountPage(driver); }
}
