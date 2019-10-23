package homepagetest;

import homepage.HomePage;
import homepage.ResultPage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;
import report.TestLogger;

public class HomePageResults extends HomePage {


    ResultPage resultPage = new ResultPage();


    @Test(enabled = false)
    public void validateSearchButtonWorks(){
        clickOnSearchBar();
        typeOnSearchBar("Headphones");
        clickOnSearchBar();
        sleepFor(5);
        resultPage.validateSearchPageDisplayed();
    }

    @Test(enabled = false)
    public void validateTestMouseHoverFashion(){
        WebElement element = getElementByLinkText("Fashion");
        Actions actions = new Actions(driver);
        actions.moveToElement(element).build().perform();
        clickOnElementByLinkText("Watches");
        TestLogger.log("Fashion Mouse Hover");
        sleepFor(7);


    }
    @Test(enabled = false)
    public void validateDailyDeals(){
        clickOnDailyDeals();
        sleepFor(3);
    }




}
