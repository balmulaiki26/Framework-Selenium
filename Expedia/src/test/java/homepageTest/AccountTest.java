package homepageTest;

import homepage.Account;
import org.testng.annotations.Test;

public class AccountTest extends Account {

    @Test
    public void clickOnAccount() {
        super.clickOnAccount();
    }

    @Test
    public void createAnAccount() {
        super.createAnAccount();
    }
}

}
