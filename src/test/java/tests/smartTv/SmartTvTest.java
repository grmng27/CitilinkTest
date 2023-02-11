package tests.smartTv;

import org.testng.annotations.Test;
import tests.base.BaseTest;

public class SmartTvTest extends BaseTest {
    @Test
    public void checkRedirectToListingPage() {
        basePage.open("https://www.citilink.ru/");
        citilinkHomePage.pressCatalog();
        citilinkListingPage.checkCountCards();
    }
}
