package homepage;

import base.CommonAPI;
import report.TestLogger;

public class Support extends CommonAPI {

    public void clickOnCustomerService(){
        clickOnElementById("header-support-menu");
        sleepFor(3);
        clickOnElementById("support-cs");
        TestLogger.log("clicked on customer service");
    }
    public void clickOnFeedBack(){
        clickOnElementById("header-support-menu");
sleepFor(3);
        clickOnElementById("support-feedback");
        TestLogger.log("clicked on feedback");
    }
}
