package homepagetest;

import base.CommonAPI;
import homepage.HomePagePOM;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class GiftCardsTest extends CommonAPI {
    @Test
    public void testGiftCards(){
        HomePagePOM homePagePOM = PageFactory.initElements(driver,HomePagePOM.class);
        homePagePOM.validateGiftCardsClickAble();
        homePagePOM.validateGiftCardsDisplayed();
    }
}
