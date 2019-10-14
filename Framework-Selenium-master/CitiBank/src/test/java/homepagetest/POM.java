package homepagetest;

import base.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

public class POM extends CommonAPI {

        //Option 1
        @FindBy(xpath = "//h2[contains(text(),'Get more value out of shopping')]")
        public static WebElement shopperToolkitValue;


        @FindBy(linkText = "Shopper Toolkit")
        public static WebElement shopperToolkit;

        public void validateShopperDisplayed() {
            Assert.assertEquals(shopperToolkit.isDisplayed(), true);
        }

        public void validateShopperClickAble() {
            shopperToolkit.click();
            Assert.assertEquals(shopperToolkitValue.isDisplayed(), true);
        }

    }
