package tests.login;

import org.testng.annotations.Test;
import tests.base.BaseTest;

public class WrongLogin extends BaseTest {
    @Test
    public void checkBucket() {
        basePage.open("https://www.citilink.ru/");
        citilinkHomePage.pressLogin();
        citilinkLoginPage.wrongLogin();
    }
}
