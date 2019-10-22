package homepagetest;

import HomePageTestCases.*;
import base.CommonAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

public class TestAllCases extends CommonAPI {

    Login login;

    @BeforeMethod
    public void initElements(){
        login=PageFactory.initElements(driver,Login.class);
    }
    @Test
    public void testLoginclass(){
        login.loginSearchbar();
    }


    @Test@Ignore
    public void runLoginclass(){
        sleepFor(3);
        //login.login();
    }

    TestBrands testBrands;
    @Test
    public void testTestBrandsclass(){
        sleepFor(3);
        TestBrands testBrands = PageFactory.initElements(driver,TestBrands.class);
    }
    @Test
    public void runTestBrandsclass(){
        testBrands.Brandsvalue();
    }
    TestCustomerService testCustomerService;
    @Test
    public void testTestCustomerServiceclass(){
        TestCustomerService testCustomerService = PageFactory.initElements(driver,TestCustomerService.class);
    }
    @Test
    public void runTestCustomerServiceclass(){
        testCustomerService.CustomerService();
    }
    TestGiftCards testGiftCards;
    @Test
    public void testTestGiftCardsclass(){
        TestGiftCards testGiftCards = PageFactory.initElements(driver,TestGiftCards.class);
    }
    @Test
    public void runTestGiftCardsGiftCardsclass(){
        testGiftCards.GiftCards();
    }
    TestGiftIdeas testGiftIdeas;
    @Test
    public void testTestGiftIdeas(){
        TestGiftIdeas testGiftIdeas = PageFactory.initElements(driver,TestGiftIdeas.class);
    }
    @Test
    public void runTestGiftIdeasclass() {
        testGiftIdeas.GiftIdeas();
    }
    TestPriceMatchGuarantee testPriceMatchGuarantee;
    @Test
    public void testTestPriceMatchGuarantee(){
        TestPriceMatchGuarantee testPriceMatchGuaranteee = PageFactory.initElements(driver,TestPriceMatchGuarantee.class);
    }
    @Test

   public void runTestPriceMatchGuaranteeclass(){
        testPriceMatchGuarantee.PriceMatchGuarantee();
    }
    TestProducts testProducts;
    @Test
    public void testTestProducts(){
        TestProducts testProducts = PageFactory.initElements(driver,TestProducts.class);
    }
    @Test
    public void runTestProductsclass(){
        testProducts.ProductsValue();
    }

    TestServices testServices;
    @Test
    public void testTestService(){
        sleepFor(3);
        TestServices testServices = PageFactory.initElements(driver,TestServices.class);
    }
    @Test@Ignore
    public void runTestServicesclass(){
        testServices.ValueServices();
    }
}
