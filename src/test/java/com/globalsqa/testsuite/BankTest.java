package com.globalsqa.testsuite;

import com.globalsqa.pages.*;
import com.globalsqa.testbase.TestBase;
import org.testng.Assert;
import org.testng.annotations.Test;

public class BankTest extends TestBase {


    HomePage homePage = new HomePage();
    CustomerLoginPage customerLoginPage = new CustomerLoginPage();
    BankManagerLoginPage bankManagerLoginPage = new BankManagerLoginPage();
    AddCustomerPage addCustomerPage = new AddCustomerPage();
    OpenAccountPage openAccountPage = new OpenAccountPage();
    CustomersPage customersPage = new CustomersPage();
    AccountPage accountPage = new AccountPage();


    @Test(groups = {"sanity", "regression"})
    public void loginlink() {
        homePage.clickmanagerloginbutton();
        homePage.clickoncustomerloginbutton();
        customerLoginPage.clicknamedropdown();
        customerLoginPage.clickloginbutton();
        customerLoginPage.verifywelcomeMessage();
    }

    @Test(groups = {"smoke", "regression"})
    public void bankmanagershouldAddCustomerSuccessfully() {
        bankManagerLoginPage.clickmanagerloginbutton();
        bankManagerLoginPage.addcustomer();
        bankManagerLoginPage.firstname();
        bankManagerLoginPage.lastname();
        bankManagerLoginPage.postcode();
        bankManagerLoginPage.addcustomerbutton();
        bankManagerLoginPage.verifymessage2();


    }

    @Test(groups = {"smoke", "sanity", "regression"})
    public void bankmanagerShouldOpenAccountSuccessfully() {
        openAccountPage.clickmanagerloginbutton();
        openAccountPage.openaccount();
        openAccountPage.customertab();
        openAccountPage.currencytab();
        openAccountPage.processbutton();
        //openAccountPage.popuphandle();
        String expectedMessage = "Account created successfully with account Number :1016";
        String actualMessage = driver.switchTo().alert().getText();
        Assert.assertEquals(expectedMessage, actualMessage);
        driver.switchTo().alert().accept();
    }

    @Test(groups = {"smoke", "regression"})
    public void customershouldLohinAndLogoutSuccessfully() {
        customerLoginPage.clickoncustomerloginbutton();
        customerLoginPage.clicknamedropdown();
        customerLoginPage.clickloginbutton();
        customerLoginPage.verifywelcomeMessage();
        customerLoginPage.logout();
        customerLoginPage.yournametextdisplay();
    }

    @Test(groups = {"regression"})
    public void customershouldDepositeAmountSuccessfully() {
        accountPage.clickoncustomerloginbutton();
        accountPage.clicknamedropdown();
        accountPage.clickloginbutton();
        accountPage.verifywelcomeMessage();
        accountPage.clickondepositelink();
        accountPage.amountdeposite();
        accountPage.clickdepositebutton();
        accountPage.veriftdepositemessage();
    }

    @Test(groups = {"regression"})
    public void customershouldWithdrawAmountSuccessfully() {
        accountPage.clickoncustomerloginbutton();
        accountPage.clicknamedropdown();
        accountPage.clickloginbutton();
        accountPage.clickondepositelink();
        accountPage.amountdeposite();
        accountPage.clickdepositebutton();
        accountPage.clickwithdrawl();
        accountPage.withdrawlamount();
        accountPage.withdrawbutton();
        // accountPage.verifywithdrawmessage();
    }
}


