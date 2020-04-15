package HomePageTestCases;

import base.CommonAPI;
import org.testng.annotations.Test;

public class TestGiftIdeas extends CommonAPI {


    public void GiftIdeas(){
        sleepFor(3);
        clickOnElementByXpath("//button[@class='close']");
        sleepFor(2);
        clickOnElementByXpath("////nav[@class='top-nav-items']//a[@class='link'][contains(text(),'Gift Ideas')]");
        sleepFor(2);
        clickOnElementByXpath("////div[contains(text(),'Gifts for kids')]");
    }
}

