package tests.search;

import org.testng.annotations.Test;
import tests.base.BaseTest;

public class WrongSearch extends BaseTest {
    @Test
    public void checkWrongSearch() {
        basePage.open("https://www.citilink.ru/");
        citilinkHomePage.wrongPressSearch();
    }
}
