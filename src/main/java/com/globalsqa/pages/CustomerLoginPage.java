package com.globalsqa.pages;

import com.globalsqa.utility.Utility;
import org.openqa.selenium.By;
import org.testng.Reporter;

public class CustomerLoginPage extends Utility {

    By loginbutton = By.xpath("//button[contains(text(),'Customer Login')]");
    By yourname = By.name("userSelect");
    By clickloginbutton = By.xpath("//button[contains(text(),'Login')]");
    By verifymessage = By.xpath("//body[1]/div[1]/div[1]/div[2]/div[1]/div[1]/strong[1]");
    By logout = By.xpath("//button[contains(text(),'Logout')]");
    By verifyyournametextdisplay = By.xpath("//label[contains(text(),'Your Name :')]");

    public void clickoncustomerloginbutton() {
        clickOnElement(loginbutton);

    }

    public void clicknamedropdown() {
        Reporter.log("click name dropdown" + "<br>");
        clickOnElement(yourname);
        selectByValueFromDropDown(yourname, "2");
    }

    public void clickloginbutton() {
        Reporter.log("click login button " + "<br>");
        clickOnElement(clickloginbutton);
    }

    public void verifywelcomeMessage() {
        Reporter.log("verify welcome message "+ "<br>");
        verifyThatTextIsDisplayed(verifymessage, "Welcome Harry Potter !!");
    }

    public void logout(){
        Reporter.log("log out " +"<br>");
        clickOnElement(logout);
    }

    public void yournametextdisplay(){
        Reporter.log("your name text verification "+"<br>");
        clickOnElement(verifyyournametextdisplay);
    }
}
