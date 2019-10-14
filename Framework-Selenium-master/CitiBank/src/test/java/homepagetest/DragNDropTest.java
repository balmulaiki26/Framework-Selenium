package homepagetest;

import base.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;


public class DragNDropTest extends CommonAPI {



    @Test
    public void testDragNDrop() {
        sleepFor(2);
        Actions actions = new Actions(driver);
        WebElement from = getElement("//a[@id='banking']");
        WebElement to = getElement("/html//a[@id='ratesBanking_Link']");
        actions.dragAndDrop(from, to).build().perform();
        sleepFor(5);
    }

    @Test
    public void testDragNDropUsingCommonAPIMethod() {
        DragNDropByXpaths("//a[@id='banking']", "/html//a[@id='ratesBanking_Link']");
    }
}