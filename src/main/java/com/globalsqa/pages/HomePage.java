package com.globalsqa.pages;

import com.globalsqa.utility.Utility;
import org.openqa.selenium.By;
import org.testng.Reporter;

public class HomePage extends Utility {

    By loginbutton = By.xpath("//button[contains(text(),'Customer Login')]");
    By managerlogin = By.xpath("//button[contains(text(),'Bank Manager Login')]");

    public void clickoncustomerloginbutton() {
        Reporter.log("click customer login button"+"<br>");
        clickOnElement(loginbutton);

    }
    public void clickmanagerloginbutton(){
        Reporter.log("click manager login button "+"<br>");
        clickOnElement(managerlogin);
    }
}
