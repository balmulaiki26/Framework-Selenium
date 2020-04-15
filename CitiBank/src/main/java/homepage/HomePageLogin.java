package homepage;


import base.CommonAPI;

public class HomePageLogin extends CommonAPI {

    public void loginValues() {
            typeOnElementByXpath("/html//input[@id='username']","Tanvir");
            typeOnElementByXpath("/html//input[@id='password']","Tanvir111");
            clickOnElementByXpath("//input[@id='signInBtn']");
    }
}

