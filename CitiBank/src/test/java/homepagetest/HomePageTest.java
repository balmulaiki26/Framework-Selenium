package homepagetest;


import base.CommonAPI;

import org.testng.annotations.Test;

public class HomePageTest extends CommonAPI {
    @Test
    public void loginvalues() {
        typeOnElementByXpath("/html//input[@id='username']","Tanvir");
        typeOnElementByXpath("/html//input[@id='password']","Tanvir111");
        clickOnElementByXpath("//input[@id='signInBtn']");
    }

    public void validateInvestingClickAble() {
    }

    public void validateInvestingDisplayed() {
    }
}
