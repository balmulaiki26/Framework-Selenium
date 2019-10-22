package homepagetest;

import base.CommonAPI;
import org.testng.annotations.Test;

public class SearchOnElementTest extends CommonAPI {
    @Test
    public void search() {
      clickOnElementByXpath("//div[@id='personetics-citi-menu']");
        typeOnElementByXpath("//input[@id='citi-autocomplete-content-searchbox-livesearch']", "What is zelle?");
        clickOnElementByXpath(" //button[@class='citi-autocomplete-content-searchbox-go']");
    }

}