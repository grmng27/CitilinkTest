package tests.base;

import common.CommonAction;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.Listeners;
import pages.base.BasePage;
import pages.home.CitilinkHomePage;
import pages.listing.CitilinkListingPage;
import pages.login.CitilinkLoginPage;
import pages.wish.CitilinkWishPage;
import tests.CustomListener;
@Listeners(CustomListener.class)
public class BaseTest {
    protected WebDriver driver = CommonAction.createDriver();
    protected BasePage basePage = new BasePage(driver);
    protected CitilinkHomePage citilinkHomePage = new CitilinkHomePage(driver);
    protected CitilinkListingPage citilinkListingPage = new CitilinkListingPage(driver);
    protected CitilinkLoginPage citilinkLoginPage = new CitilinkLoginPage(driver);
    protected CitilinkWishPage citilinkWishPage = new CitilinkWishPage(driver);

//        @AfterSuite(alwaysRun = true)
//    public void close() {
//        driver.quit();
//    }

//    @AfterClass(alwaysRun = true)
//    public void close() {
//        driver.quit();
//    }
}
