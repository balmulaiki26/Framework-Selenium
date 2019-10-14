package homepageTest;

import homepage.Account;
import org.testng.annotations.Test;

public class AccountTest extends Account {

    @Test
    public void clickOnSignIn() {
        super.clickOnSignIn();
    }

    @Test
    public void createAnAccount() {
        super.createAnAccount();
    }
}


