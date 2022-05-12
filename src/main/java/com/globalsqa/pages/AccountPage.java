package com.globalsqa.pages;

import com.globalsqa.utility.Utility;
import org.openqa.selenium.By;
import org.testng.Reporter;

public class AccountPage extends Utility {

    By loginbutton = By.xpath("//button[contains(text(),'Customer Login')]");
    By yourname = By.name("userSelect");
    By clickloginbutton = By.xpath("//button[contains(text(),'Login')]");
    By verifymessage = By.xpath("//body[1]/div[1]/div[1]/div[2]/div[1]/div[1]/strong[1]");

    By deposit = By.xpath("//body/div[1]/div[1]/div[2]/div[1]/div[3]/button[2]");
    By amountdeposite = By.xpath("//body/div[1]/div[1]/div[2]/div[1]/div[4]/div[1]/form[1]/div[1]/input[1]");
    By clickdepositebutton = By.xpath("//body/div[1]/div[1]/div[2]/div[1]/div[4]/div[1]/form[1]/button[1]");
    By depositesuccessfull = By.xpath("//span[contains(text(),'Deposit Successful')]");

    By withdrawl = By.xpath("//body/div[1]/div[1]/div[2]/div[1]/div[3]/button[3]");
    By withdrawnamount = By.xpath("//body/div[1]/div[1]/div[2]/div[1]/div[4]/div[1]/form[1]/div[1]/input[1]");
    By clickwithdrawlbutton = By.xpath("//body/div[1]/div[1]/div[2]/div[1]/div[4]/div[1]/form[1]/button[1]");
    By transactionsuccessfull = By.xpath("//span[contains(text(),'Transaction successful')]");

    public void clickoncustomerloginbutton() {
        Reporter.log("click customer login button " + "<br>");
        clickOnElement(loginbutton);
    }

    public void clicknamedropdown() {
        Reporter.log("click name dropdown " + "<br>");
        clickOnElement(yourname);
        selectByValueFromDropDown(yourname, "2");
    }

    public void clickloginbutton() {
        Reporter.log("click login button" + "<br>");
        clickOnElement(clickloginbutton);
    }

    public void verifywelcomeMessage() {
        Reporter.log("verify welcome message " + "<br>");
        verifyThatTextIsDisplayed(verifymessage, "Welcome Harry Potter !!");
    }

    public void clickondepositelink() {
        Reporter.log("click deopsite link" + "<br>");
        clickOnElement(deposit);
    }

    public void amountdeposite() {
        Reporter.log("amount deposite" + "<br>");
        clickOnElement(amountdeposite);
        sendTextToElement(amountdeposite, "5000");
    }

    public void clickdepositebutton() {
        Reporter.log("click deposite button "+ "<br>");
        clickOnElement(clickdepositebutton);
    }

    public void veriftdepositemessage() {
        Reporter.log("verify deposite message" + "<br>");
        clickOnElement(depositesuccessfull);
    }

    public void clickwithdrawl() {
        Reporter.log("click withdrawl"+ "<br>");
        clickOnElement(withdrawl);
    }

    public void withdrawlamount() {
        Reporter.log("withdraw amount"+"<br>");
        clickOnElement(withdrawnamount);
        sendTextToElement(withdrawnamount, "500");
    }

    public void withdrawbutton() {
        Reporter.log("withdrawl button" + "<br>");
        clickOnElement(clickwithdrawlbutton);
    }

    public void verifywithdrawmessage(){
        Reporter.log("verify message " + "<br>");
        clickOnElement(transactionsuccessfull);
    }

}
