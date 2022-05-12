package com.globalsqa.pages;

import com.globalsqa.utility.Utility;
import org.openqa.selenium.By;
import org.testng.Reporter;

public class BankManagerLoginPage extends Utility {

    By managerlogin = By.xpath("//button[contains(text(),'Bank Manager Login')]");
    By clickaddcustomer = By.xpath("//body/div[1]/div[1]/div[2]/div[1]/div[1]/button[1]");
    By clickfirstname = By.xpath("//body/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/form[1]/div[1]/input[1]");
    By clicklastname = By.xpath("//body/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/form[1]/div[2]/input[1]");
    By postcode = By.xpath("//body/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/form[1]/div[3]/input[1]");
    By addcustomerbutton = By.xpath("//body/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/form[1]/button[1]");
   By verifymessage2 = By.xpath("//body/div[1]/div[1]/div[2]");
    By popupbutton = By.className("ng-scope");


    //Customer added successfully

    public void clickmanagerloginbutton(){
        Reporter.log("click manager login button "+ "<br>");
        clickOnElement(managerlogin);
    }

    public void addcustomer(){
        Reporter.log("add customer" + "<br>");
        clickOnElement(clickaddcustomer);
    }

    public void firstname(){
        Reporter.log("firstname "+ "<br>");
        clickOnElement(clickfirstname);
    }

    public void lastname(){
        Reporter.log("lastname"+"<br>");
        clickOnElement(clicklastname);
    }

    public void postcode(){
        Reporter.log("postcode"+"<br>");
        clickOnElement(postcode);
    }

    public void addcustomerbutton(){
    Reporter.log("add customer button "+ "<br>");
        clickOnElement(addcustomerbutton);
    }

    public void verifymessage2(){
        Reporter.log("verify message 2 " + "<br>");
        clickOnElement(verifymessage2);
    }

    public void popuphandle(){
        Reporter.log("popup handle " + "<br>");
        mouseHoverToElementAndClick(popupbutton);
    }
}
