package homepagetest;

import base.CommonAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class InvestingTest extends CommonAPI {

    @Test
    public void testinvestingvalus() {
        HomePageTest homePageTest = PageFactory.initElements(driver, HomePageTest.class);
        homePageTest.validateInvestingDisplayed();
        homePageTest.validateInvestingClickAble();
    }

}