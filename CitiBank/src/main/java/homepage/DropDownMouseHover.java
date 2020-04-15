package homepage;

        import base.CommonAPI;
        import org.openqa.selenium.JavascriptExecutor;
        import org.openqa.selenium.WebElement;
        import org.openqa.selenium.interactions.Actions;
        import org.openqa.selenium.support.ui.Select;
        import org.testng.annotations.Test;

public class DropDownMouseHover extends CommonAPI {

    public void testDropDown() {
        WebElement element = getElement("//a[@id='banking']");
        Select select = new Select(element);
        select.selectByIndex(3);
        sleepFor(5);
    }

    public void testMouseHover() {
        WebElement element = getElementByLinkText("Careers");
        Actions actions = new Actions(driver);
        actions.moveToElement(element).build().perform();
        clickOnElementByLinkText("Rewards");
        sleepFor(5);
    }

    public void scrollToView() {
        WebElement element = getElementByLinkText("Citi Priority");
        JavascriptExecutor javascriptExecutor = (JavascriptExecutor) driver;
        javascriptExecutor.executeScript("arguments[0].scrollIntoView(true);", element);
        sleepFor(10);
    }

    public void testScrolling() {
        JavascriptExecutor javascriptExecutor = (JavascriptExecutor) driver;
        javascriptExecutor.executeScript("window.scrollBy(0,1000)");
        sleepFor(10);
    }


}