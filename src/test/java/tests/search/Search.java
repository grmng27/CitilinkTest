package tests.search;

import org.testng.annotations.Test;
import tests.base.BaseTest;

public class Search extends BaseTest {
    @Test
    public void checkSearch() {
        basePage.open("https://www.citilink.ru/");
        citilinkHomePage.pressSearch();
    }
}
