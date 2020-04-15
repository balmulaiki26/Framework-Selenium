package HomePageTestCases;

import base.CommonAPI;
import org.testng.annotations.Test;

public class TestGiftCards extends CommonAPI {


    public void GiftCards(){
        sleepFor(3);
        clickOnElementByXpath("//button[@class='close']");
        sleepFor(2);
        clickOnElementByXpath("//a[contains(text(),'Gift Cards')]");
        sleepFor(2);
        clickOnElementByXpath("////button[@class='src-visual-components-tiles-___tile__tile___2IRES src-visual-components-tiles-___tile__align-top___wMmVy']//img[@class='src-visual-components-tile-content-___image__image___20x_L src-visual-components-tile-content-___image__position-bottom___1U8EF']");


    }
}
