package tests.city;

import org.testng.annotations.Test;
import tests.base.BaseTest;

public class equalsCityAndNumber extends BaseTest {

    @Test
    public void checkNumber() throws InterruptedException {
        basePage.open("https://www.citilink.ru/");
        citilinkCitiPage.equalsNumbers();
    }
}
