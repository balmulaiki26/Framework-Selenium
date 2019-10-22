package homepageTest;

import POM.HomePagePOM;
import org.testng.annotations.Test;

public class HomePagePOMTest extends HomePagePOM {

    @Test
    public void Validation(){
        ValidateContactClickAble();
        ValidateContactUsDisplayed();
    }

}
