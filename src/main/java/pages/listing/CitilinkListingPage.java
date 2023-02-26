package pages.listing;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import pages.base.BasePage;
import java.util.ArrayList;
import java.util.List;

public class CitilinkListingPage extends BasePage {
    public CitilinkListingPage(WebDriver driver) {
        super(driver);
    }
    private final By card = By.className("ProductCardHorizontal__labels-block");
    private final By cardTvAdd = By.xpath("/html/body/div[5]/div[2]/main/section/div[1]/div[1]/div[3]/div[1]/section/div[1]/div[6]/div[2]/div[1]/div[1]/button");
    private final By bucket = By.xpath("/html/body/div[7]/div[2]/div[1]/div[2]/div/section/header[1]/div/div[2]/button");
    private final By delete = By.xpath("//*[@id=\"__next\"]/div/main/div[1]/div[2]/section/div[1]/div/div/div/div[5]/div/div[4]/div/button");

    private static final String PREV_BUTTON_WISH_XPATH = "//*[@id=\"__next\"]/div/main/section/div[2]/div/div/section/div[2]/div[2]/div[";
    private static final String END_BUTTON_WISH_XPATH = "]/div/div[4]/div/div[2]/button/div";
    private List<WebElement> createList() {
        ArrayList<WebElement> buttonWish = new ArrayList<>();
        for (int i = 1; i < 11; i++) {
            buttonWish.add(driver.findElement(By.xpath(PREV_BUTTON_WISH_XPATH + i + END_BUTTON_WISH_XPATH)));
        }
        return buttonWish;
    }

    public CitilinkListingPage checkCountCards() {
        waitElementIsVisible(driver.findElement(card));
        int countCard = driver.findElements(card).size();
        Assert.assertEquals(countCard, 48);
        return this;
    }

    public CitilinkListingPage pressAdd() {
        driver.findElement(cardTvAdd).click();
        driver.findElement(bucket).click();
        driver.findElement(delete).click();
//        new WebDriverWait(driver, Duration.ofSeconds(30)).until(ExpectedConditions.alertIsPresent()).dismiss();
        return this;
    }

    public CitilinkListingPage addToFavourites() {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        List<WebElement> buttonWish = createList();
        for (int i = 0; i < 10; i++) {
            buttonWish.get(i).click();
            js.executeScript("arguments[0].scrollIntoView();", buttonWish.get(i));
        }
        return this;
    }
}
