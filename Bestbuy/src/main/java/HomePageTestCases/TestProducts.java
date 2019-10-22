package HomePageTestCases;

import base.CommonAPI;
import org.testng.annotations.Test;

public class TestProducts extends CommonAPI {


    public void ProductsValue() {
        sleepFor(3);
        clickOnElementByXpath("//button[@class='close']");
        sleepFor(2);
        clickOnElementByXpath("//button[@class='btn-unstyled menuHeader active flyBtn']");
        sleepFor(2);
        clickOnElementByXpath("//button[contains(text(),'Computers & Tablets')]");

    }
}
