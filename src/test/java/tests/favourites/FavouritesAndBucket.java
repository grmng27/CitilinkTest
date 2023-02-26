package tests.favourites;

import org.testng.annotations.Test;
import tests.base.BaseTest;

public class FavouritesAndBucket extends BaseTest {
    @Test
    public void addToFavourites() {
        basePage.open("https://www.citilink.ru/");
        citilinkHomePage.pressLogin();
        citilinkLoginPage.login();
        citilinkHomePage.pressCatalogPhone();
        citilinkListingPage.addToFavourites();
        citilinkHomePage.pressWish();
        citilinkWishPage.pressAddToBucket();
//        citilinkWishPage.pressClose();
    }
}
