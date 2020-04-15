package homepage;

import base.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;
import report.TestLogger;

public class HomePage extends CommonAPI {




    public void clickOnSignIn() {

        clickOnElementByXpath("//nav[@id='headerMain']//a[@id='account']");
        sleepFor(3);
        clickOnElementByXpath("//div[contains(text(),'Sign in')]");
        sleepFor(5);
        typeOnElementById("username","balmulaiki26@gmail.com");
        typeOnElementById("password","1235f6rrrr");
        clickOnElementByXpath("/html//button[@id='login']");


    }
    public void createAnAccount(){
        clickOnElementByXpath("//nav[@id='headerMain']//a[@id='account']");
        sleepFor(3);
        clickOnElementByXpath("//li[@id='accountNav-createAccount']//a[@class='Link-sc-1khjl8b-0 NavigationLink-kfyxgv-0 ktUEKH']");
        sleepFor(3);
        typeOnElementByXpath("//input[@id='username']","b_almulaiki@yahoo.com");
        typeOnElementByXpath("//input[@id='firstname']","billy");
        typeOnElementByXpath("//input[@id='lastname']","bob");
        typeOnElementByXpath("//input[@id='password']","1234566#");
        clickOnElementByXpath("/html//button[@id='createAccount']");
        TestLogger.log("creating an account");

    }
    public void moueseHoverDeals() {
        WebElement element = getElementByLinkText("Deals");
        Actions actions = new Actions(driver);
        actions.moveToElement(element).build().perform();
        clickOnElementByLinkText("Top Deals");
        sleepFor(5);
        TestLogger.log("mouse hover Deals");

    }
    public void clickOnWeeklyAD(){
        clickOnElementByXpath("//a[@class='Link-sc-1khjl8b-0 lifmEv'][contains(text(),'Weekly Ad')]");
        sleepFor(5);
        TestLogger.log("Weekly AD is clickable");
    }
public void clickOnMore(){
        clickOnElementById("more");
        sleepFor(3);
        clickOnElementByXpath("//div[contains(text(),'Pharmacy')]");
        TestLogger.log("Pharmacy is clickable");
}
    public void typeOnSearchBar(String value) {
        typeOnElementById("search",value);
        TestLogger.log(value + " typed on the search bar");
    }

public void clickOnSearchBar(){
        typeOnElementById("search","kids holloween costums");
        sleepFor(5);
        clickOnElementByXpath("//button[@class='SearchInputButton-sc-1opoijs-0 gyZtAo']");
        sleepFor(4);
        TestLogger.log("typed on Search bar");
}
public void searchForIphone(){
        typeOnElementById("search","Iphones");
        clickOnElementByXpath("//button[@class='SearchInputButton-sc-1opoijs-0 gyZtAo']");
        sleepFor(3);
        clickOnElementByXpath("//div[@class='Row-uds8za-0 styles__StyledProductCardRow-e5kry1-1 dvFLyC']//div[@class='ProductCardImageWrapper-sc-1bal7zm-0 styles__StyledProductCardImageWrapper-e5kry1-4 kGBerw']//h3[@class='Col-favj32-0 kIqrCB']//a[@class='h-display-block Link-sc-1khjl8b-0 jvxzGg']//div[@class='AspectRatio__AspectRatioContainer-sc-1h9ishl-0 cCTyLI']//div//img[@class='Images__FadeInImage-sc-1gcxa3z-1 cieJGf']");
        TestLogger.log("Search for Iphones");

}
public void clickOnCategories(){
        clickOnElementByXpath("//span[contains(text(),'Categories')]");
        clickOnElementByXpath("//div[contains(text(),'Desks')]");
        sleepFor(3);
        TestLogger.log("Desk is clickable");
}

public void clickOnDropDown(){
        clickOnElementByXpath("/html/body/div[1]/div/div[3]/div[2]/nav/a[7]/span[2]/svg");
        TestLogger.log("sign in is clickable");
        sleepFor(4);
}

}
