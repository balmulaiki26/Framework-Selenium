package homepage;

import base.CommonAPI;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class SignIn extends CommonAPI {
    public void testDropDown() {
            WebElement element = getElement("//a[@id='more']");
            Select select = new Select(element);
            sleepFor(5);
            select.selectByIndex(1);
            sleepFor(5);
        }
    }

