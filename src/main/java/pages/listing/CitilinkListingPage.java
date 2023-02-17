package pages.listing;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import pages.base.BasePage;
import java.time.Duration;
import java.util.ArrayList;

public class CitilinkListingPage extends BasePage {
    public CitilinkListingPage(WebDriver driver) {
        super(driver);
    }
    private final By card = By.className("ProductCardHorizontal__labels-block");
    private final By cardTvAdd = By.xpath("/html/body/div[5]/div[2]/main/section/div[1]/div[1]/div[3]/div[1]/section/div[1]/div[6]/div[2]/div[1]/div[1]/button");
    private final By bucket = By.xpath("/html/body/div[7]/div[2]/div[1]/div[2]/div/section/header[1]/div/div[2]/button");
    private final By delete = By.xpath("//*[@id=\"__next\"]/div/main/div[1]/div[2]/section/div[1]/div/div/div/div[5]/div/div[4]/div/button");
    private final By cardPhone1 = By.xpath("//*[@id=\"__next\"]/div/main/section/div[2]/div/div/section/div[2]/div[2]/div[2]");
    private final By wishlist = By.xpath("//*[@id=\"__next\"]/div/main/section/div[2]/div/div/section/div[2]/div[2]/div[2]/div/div[4]/div/div[2]/button");

    ArrayList<WebElement> buttonWish = new ArrayList<>(driver.findElements(wishlist));
    public void addList() {
        buttonWish.add(driver.findElement(By.xpath("//*[@id=\"__next\"]/div/main/section/div[2]/div/div/section/div[2]/div[2]/div[1]/div/div[4]/div/div[2]/button/div")));
        buttonWish.add(driver.findElement(By.xpath("//*[@id=\"__next\"]/div/main/section/div[2]/div/div/section/div[2]/div[2]/div[2]/div/div[4]/div/div[2]/button/div")));
        buttonWish.add(driver.findElement(By.xpath("//*[@id=\"__next\"]/div/main/section/div[2]/div/div/section/div[2]/div[2]/div[3]/div/div[4]/div/div[2]/button/div")));
        buttonWish.add(driver.findElement(By.xpath("//*[@id=\"__next\"]/div/main/section/div[2]/div/div/section/div[2]/div[2]/div[4]/div/div[4]/div/div[2]/button/div")));
        buttonWish.add(driver.findElement(By.xpath("//*[@id=\"__next\"]/div/main/section/div[2]/div/div/section/div[2]/div[2]/div[5]/div/div[4]/div/div[2]/button/div")));
        buttonWish.add(driver.findElement(By.xpath("//*[@id=\"__next\"]/div/main/section/div[2]/div/div/section/div[2]/div[2]/div[6]/div/div[4]/div/div[2]/button/div")));
        buttonWish.add(driver.findElement(By.xpath("//*[@id=\"__next\"]/div/main/section/div[2]/div/div/section/div[2]/div[2]/div[7]/div/div[4]/div/div[2]/button/div")));
        buttonWish.add(driver.findElement(By.xpath("//*[@id=\"__next\"]/div/main/section/div[2]/div/div/section/div[2]/div[2]/div[8]/div/div[4]/div/div[2]/button/div")));
        buttonWish.add(driver.findElement(By.xpath("//*[@id=\"__next\"]/div/main/section/div[2]/div/div/section/div[2]/div[2]/div[9]/div/div[4]/div/div[2]/button/div")));
        buttonWish.add(driver.findElement(By.xpath("//*[@id=\"__next\"]/div/main/section/div[2]/div/div/section/div[2]/div[2]/div[10]/div/div[4]/div/div[2]/button/div")));
    }

    ArrayList<WebElement> cardPhone = new ArrayList<>(driver.findElements(cardPhone1));

    public void cardScroll() {
        cardPhone.add(driver.findElement(By.xpath("//*[@id=\"__next\"]/div/main/section/div[2]/div/div/section/div[2]/div[2]/div[2]/div")));
        cardPhone.add(driver.findElement(By.xpath("//*[@id=\"__next\"]/div/main/section/div[2]/div/div/section/div[2]/div[2]/div[3]/div")));
        cardPhone.add(driver.findElement(By.xpath("//*[@id=\"__next\"]/div/main/section/div[2]/div/div/section/div[2]/div[2]/div[4]/div")));
        cardPhone.add(driver.findElement(By.xpath("//*[@id=\"__next\"]/div/main/section/div[2]/div/div/section/div[2]/div[2]/div[5]/div")));
        cardPhone.add(driver.findElement(By.xpath("//*[@id=\"__next\"]/div/main/section/div[2]/div/div/section/div[2]/div[2]/div[6]/div")));
        cardPhone.add(driver.findElement(By.xpath("//*[@id=\"__next\"]/div/main/section/div[2]/div/div/section/div[2]/div[2]/div[7]/div")));
        cardPhone.add(driver.findElement(By.xpath("//*[@id=\"__next\"]/div/main/section/div[2]/div/div/section/div[2]/div[2]/div[8]/div")));
        cardPhone.add(driver.findElement(By.xpath("//*[@id=\"__next\"]/div/main/section/div[2]/div/div/section/div[2]/div[2]/div[9]/div")));
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

    JavascriptExecutor js = (JavascriptExecutor) driver;

    public CitilinkListingPage addToFavourites() {
        addList();
        cardScroll();
        buttonWish.get(0).click();
        buttonWish.get(1).click();
        js.executeScript("arguments[0].scrollIntoView();", cardPhone.get(0));
        new WebDriverWait(driver, Duration.ofSeconds(20));
        buttonWish.get(2).click();
        buttonWish.get(3).click();
        js.executeScript("arguments[0].scrollIntoView();", cardPhone.get(1));
        buttonWish.get(4).click();
        js.executeScript("arguments[0].scrollIntoView();", cardPhone.get(2));
        buttonWish.get(5).click();
        js.executeScript("arguments[0].scrollIntoView();", cardPhone.get(3));
        buttonWish.get(6).click();
        js.executeScript("arguments[0].scrollIntoView();", cardPhone.get(4));
        buttonWish.get(7).click();
        js.executeScript("arguments[0].scrollIntoView();", cardPhone.get(5));
        buttonWish.get(8).click();
        js.executeScript("arguments[0].scrollIntoView();", cardPhone.get(6));
        buttonWish.get(9).click();
        return this;
    }
}
