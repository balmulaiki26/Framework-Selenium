package homepagetest;

import homepage.HomePage;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class RunTestCases extends HomePage {

   HomePage homePage;
    @BeforeMethod
    public void setPageFactory() {
        homePage = PageFactory.initElements(driver, HomePage.class);
    }
    @Test

    public void DealsTest() {
        homePage.moueseHoverDeals();
    }

    @Test
    public void TestWeeklyAD() {
        homePage.clickOnWeeklyAD();
    }

    @Test
    public void TestMore() {
        homePage.clickOnMore();
    }

    @Test
    public void TestIphone() {
        homePage.searchForIphone();
    }

    @Test
    public void TestAccount() {
        homePage.createAnAccount();
    }


    @Test
    public void SignInTest(){
    homePage.clickOnSignIn();

}
}

