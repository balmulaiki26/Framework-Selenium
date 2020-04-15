package homepage;

import base.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

public class HomePagePOM extends CommonAPI {
@FindBy(linkText = "Gift Cards")
    public static WebElement GiftCards;

@FindBy(xpath = "//h2[contains(text(),'Target GiftCards Help')]")
    public static WebElement GiftCardsValue;

public void validateGiftCardsDisplayed(){
    System.out.println(GiftCards.isDisplayed());
    Assert.assertEquals(GiftCards.isDisplayed(),true);
}

public void validateGiftCardsClickAble(){
    GiftCards.click();
    Assert.assertEquals(GiftCardsValue.isDisplayed(),true);
}
}
