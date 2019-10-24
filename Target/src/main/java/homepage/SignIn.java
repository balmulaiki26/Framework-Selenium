package homepage;

import base.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class SignIn extends CommonAPI {

       /* typeOnElementById("username","balmulaiki26@gmail.com");
        typeOnElementById("password","asdheoklp1234");
        clickOnElementByXpath("/html//button[@id='login']");*/


    public void clickOnSignIn() {
        Actions actions = new Actions(driver);
        WebElement from = getElement("/html//a[@id='account']/span[.='Sign in']");
        WebElement to = getElement("//li[@id='accountNav-signIn']//div[@class='Row-uds8za-0 kjjHUt']");
        actions.dragAndDrop(from, to).build().perform();
    }
}