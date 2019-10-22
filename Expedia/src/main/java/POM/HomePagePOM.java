package POM;

import base.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;


public class HomePagePOM extends CommonAPI {
    @FindBy(xpath = "//button[@class='btn-primary btn-utility']")
    public static WebElement ContactUs;

    public void ValidateContactUsDisplayed(){
        System.out.println(ContactUs.isDisplayed());
        Assert.assertEquals(ContactUs.isDisplayed(),true);}

        public void ValidateContactClickAble(){
        ContactUs.click();
        Assert.assertEquals(ContactUs.isDisplayed(),true);
        }
    }


