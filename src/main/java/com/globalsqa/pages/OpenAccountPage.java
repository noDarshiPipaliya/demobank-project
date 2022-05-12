package com.globalsqa.pages;

import com.globalsqa.utility.Utility;
import org.openqa.selenium.By;
import org.testng.Reporter;

public class OpenAccountPage extends Utility {

    By managerlogin = By.xpath("//button[contains(text(),'Bank Manager Login')]");
    By openaccountTab = By.xpath("//body/div[1]/div[1]/div[2]/div[1]/div[1]/button[2]");
    By customertab = By.xpath("//select[@id='userSelect']");
    By currency = By.xpath("//select[@id='currency']");
    By processbottun = By.xpath("//button[contains(text(),'Process')]");
  //  By verifymessage3 = By.xpath("");
   // By popup1 = By.xpath("");

    public void clickmanagerloginbutton() {
        Reporter.log("click manager login button "+"<br>");
        clickOnElement(managerlogin);
    }

    public void openaccount(){
        Reporter.log("open account "+"<br>");
        clickOnElement(openaccountTab);
    }
    public void customertab(){
        Reporter.log("customer tab "+"<br>");
        clickOnElement(customertab);
        selectByValueFromDropDown(customertab,"2");
    }
    public void currencytab(){
        Reporter.log("currency tab "+"<br>");
        clickOnElement(currency);
        selectByValueFromDropDown(currency,"Pound");
    }
    public void processbutton(){
    Reporter.log("process button "+"<br>");
        clickOnElement(processbottun);
    }
//    public void Verifymessage3(){
//        clickOnElement(verifymessage3);
//    }

//    public void popuphandle(){
//        mouseHoverToElementAndClick(popup1);
//    }
}
