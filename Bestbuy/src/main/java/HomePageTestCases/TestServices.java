package HomePageTestCases;

import base.CommonAPI;
import org.testng.annotations.Test;

public class TestServices extends CommonAPI {


    public void ValueServices() {
        sleepFor(3);
        clickOnElementByXpath("//button[@class='close']");
        sleepFor(2);
        clickOnElementByXpath("//button[contains(text(),'Services')]");
        sleepFor(2);
        clickOnElementByXpath("//a[contains(text(),'Computer & Tablet Services')]");

    }
}
