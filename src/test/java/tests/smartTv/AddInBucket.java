package tests.smartTv;

import org.testng.annotations.Test;
import tests.base.BaseTest;

public class AddInBucket extends BaseTest {
    @Test
    public void checkBucket() {
        basePage.open("https://www.citilink.ru/");
        citilinkHomePage.pressCatalog();
        citilinkListingPage.pressAdd();
//        citilinkHomePage.pressBucket();
    }

}
