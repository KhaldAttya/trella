package com.trella.test.customers;

import com.trella.models.Customer;
import com.trella.test.TrellaWebBaseTest;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;
@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class CustomersTest extends TrellaWebBaseTest {

    Customer customer = new Customer().firstName("Khaled").lastName("Attia").postalName("12345").build();

    @Test
    public void TC_01_addCustomer() {
        page.homePage().goToBanking();
        page.bankingMainPage().goToBankManagerLogin();
        page.bankManagerPage().clickOnAddCustomerButton();
        page.addCustomerPage().populateCustomerData(customer);
        page.addCustomerPage().clickAddCustomerButton();
        int addedCustomerId = page.addCustomerPage().getAddedCustomerId();
        customer.id(addedCustomerId);
        page.bankManagerPage().clickOnCustomersButton();
        page.customersPage().verifyCustomerOrder(customer);

    }

    @Test
    public void TC_02_viewCustomer() {
        page.bankManagerPage().clickOnOpenAccountButton();
        page.openAccountPage().selectCustomer(customer);
        //TODO
    }

    @Test
    public void TC_03_deleteCustomer() {
        //TODO
    }
}
