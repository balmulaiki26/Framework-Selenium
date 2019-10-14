package homepage;

import base.CommonAPI;

public class SearchOnElement extends CommonAPI {
    public void search() {
      clickOnElementByXpath("//div[@id='personetics-citi-menu']");
        typeOnElementByXpath("//input[@id='citi-autocomplete-content-searchbox-livesearch']", "What is zelle?");
        clickOnElementByXpath(" //button[@class='citi-autocomplete-content-searchbox-go']");
    }

}