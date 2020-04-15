package HomePageTestCases;

        import base.CommonAPI;
        import org.testng.annotations.Test;

public class TestBrands extends CommonAPI {


    public void Brandsvalue() {
        sleepFor(3);
        clickOnElementByXpath("//button[@class='close']");
        sleepFor(2);
        clickOnElementByXpath("//button[contains(text(),'Brands')]");
        sleepFor(2);
        clickOnElementByXpath("//div[contains(text(),'Apple')]");

    }
}
