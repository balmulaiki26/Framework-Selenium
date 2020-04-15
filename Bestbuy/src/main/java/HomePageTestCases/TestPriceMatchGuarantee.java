package HomePageTestCases;

import base.CommonAPI;
import org.testng.annotations.Test;

public class TestPriceMatchGuarantee extends CommonAPI {


    public void PriceMatchGuarantee() {
        sleepFor(3);
        clickOnElementByXpath("//button[@class='close']");
        sleepFor(2);
        clickOnElementByXpath("//a[contains(text(),'Price Match Guarantee')]");
        sleepFor(2);

        }
    }