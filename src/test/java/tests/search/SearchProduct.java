package tests.search;

import org.testng.annotations.Test;
import tests.base.BaseTest;

public class SearchProduct extends BaseTest {
    @Test
    public void checkSearchProduct() {
        basePage.open("https://www.citilink.ru/");
//        citilinkHomePage.pressLogin();
//        citilinkLoginPage.login();
        citilinkSearchPage.inputSearch();
    }
}
