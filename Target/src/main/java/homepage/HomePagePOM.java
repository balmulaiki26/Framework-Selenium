package POM;

import base.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;


public class HomePagePOM extends CommonAPI {
    @FindBy(xpath = "//h2[contains(text(),'Target GiftCards Help')]")
    public static WebElement GiftCardsValue;
    @FindBy(xpath = "//a[@class='Link-sc-1khjl8b-0 lifmEv'][contains(text(),'Gift Cards')]")
    public static WebElement GiftCards;


    public void ValidateGiftCardsClickAble(){
        GiftCards.click();
        Assert.assertEquals(GiftCardsValue.isDisplayed(),true);
    }
    public void ValidateGiftCardsDisplayed(){
        System.out.println(GiftCards.isDisplayed());
        Assert.assertEquals(GiftCards.isDisplayed(),true);}
}


