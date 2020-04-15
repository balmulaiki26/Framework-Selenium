package homepage;

import base.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class DragNDrop extends CommonAPI {

    public void testDragNDrop() {
        Actions actions = new Actions(driver);
        WebElement from = getElement("//a[@id='banking']");
        WebElement to = getElement("/html//a[@id='ratesBanking_Link']");
        actions.dragAndDrop(from, to).build().perform();
    }

    public void testDragNDropUsingCommonAPIMethod() {
        DragNDropByXpaths("//a[@id='banking']", "/html//a[@id='ratesBanking_Link']");
    }
}