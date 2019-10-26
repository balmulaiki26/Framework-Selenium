package homepagetest;

import homepage.HomePage;
import homepage.ResultPage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;
import report.TestLogger;

public class ResultPageTest extends HomePage {

    ResultPage resultPage = new ResultPage();

    @Test(enabled = false)
    public void validateSearchButtonWorks(){
        clickOnSearchBar();
        typeOnSearchBar("kids holloween costums");
        clickOnSearchBar();
        sleepFor(5);
        resultPage.validateSearchPageDisplayed();
    }

    @Test(enabled = false)
    public void validateTestMouseHoverFashion() {
        WebElement element = getElementByLinkText("Deals");
        Actions actions = new Actions(driver);
        actions.moveToElement(element).build().perform();
        clickOnElementByLinkText("Top Deals");
        TestLogger.log("Deals Mouse Hover");
        sleepFor(7);

    }

    @Test(enabled = false)
     public void validateMore(){
        clickOnMore();
        sleepFor(4);
    }

}
