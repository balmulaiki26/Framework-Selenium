package SearchTest;

import base.CommonAPI;

public class Flights extends CommonAPI {

    public void searchForFlight(){
        typeOnElementByXpath("//input[@id='package-origin-hp-package']", "New York");
        typeOnElementByXpath("//input[@id='package-destination-hp-package']", "Los Angles");
        typeOnElementById("package-departing-hp-package","10/10/2019");
        typeOnElementById("package-returning-hp-package","10/20/2019");
    }

}
