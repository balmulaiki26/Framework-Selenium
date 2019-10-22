package HomePageTestCases;

import base.CommonAPI;
import org.testng.annotations.Test;

public class Login extends CommonAPI {

    public void PopUpBestBuy() {
        clickOnElementByXpath("//button[@class='close']//span[contains(text(),'×')]");
    }

    public void loginSearchbar(){
        PopUpBestBuy();
        sleepFor(2);
        clickOnElementByXpath("//span[@class='flyBtn']");
        sleepFor(2);
        clickOnElementByXpath("//button[@class='lam-signIn__button btn btn-secondary']");
        typeOnElementByXpath("//input[@id='fld-e']","foysol99@yahoo.com");
        typeOnElementByXpath("//input[@id='fld-p1']","123456");
        clickOnElementByXpath("//button[@type='submit']");

    }
}
