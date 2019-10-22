package homepage;

import base.CommonAPI;
import org.testng.annotations.Test;
import report.TestLogger;

public class Account extends CommonAPI {


    public void clickOnSignIn() {
        clickOnElementByXpath("//button[@id='header-account-menu']");
        sleepFor(5);
        clickOnElementByXpath("//a[@id='account-signin']");
        sleepFor(5);
        typeOnElementById("gss-signin-email", "b_almulaiki@yahoo.com");
        typeOnElementById("gss-signin-password", "Asshole1234#");
        clickOnElementById("gss-signin-submit");
        TestLogger.log("click on account");
        sleepFor(5);
    }
//    public void createAnAccount(){
//        clickOnElementByXpath("//button[@id='header-account-menu']");
//        sleepFor(2);
//        clickOnElementById("account-register");
//        sleepFor(5);
//        typeOnElementById("gss-signup-first-name","John");
//        typeOnElementById("gss-signup-last-name","wack");
//        typeOnElementById("gss-signup-email","balmulaiki26@gmail.com");
//        typeOnElementByXpath("//input[@id='gss-signup-password']","ashoklo12");
//        clickOnElementById("gss-signup-join-program-check");
//        clickOnElementById("gss-signup-submit");
//        sleepFor(15);
//
//    }
}

