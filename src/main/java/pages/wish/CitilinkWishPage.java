package pages.wish;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import pages.base.BasePage;

import java.time.Duration;

public class CitilinkWishPage extends BasePage {

    public CitilinkWishPage(WebDriver driver) {
        super(driver);
    }

    By buttonClose = By.xpath("//*[@id=\"content\"]/div[2]/section/div[1]/div[2]/aside/div/button");
    By buttonAddToBucket = By.xpath("//*[@id=\"content\"]/div[2]/section/div[1]/div[2]/div/div[2]/div/div[1]/div[1]/div/div[2]/div[3]/div/div[2]");
    By buttonContinue = By.xpath("/html/body/div[6]/div[2]/div[1]/div[2]/div/section/header[1]/div/div[1]/button");

    public CitilinkWishPage pressClose() {
        driver.findElement(buttonContinue).click();
        driver.findElement(buttonClose).click();
        return this;
    }

    public CitilinkWishPage pressAddToBucket() {
//        driver.get();
        new WebDriverWait(driver, Duration.ofSeconds(10)).until(ExpectedConditions.elementToBeClickable(buttonAddToBucket));
        driver.findElement(buttonAddToBucket).isEnabled();
        driver.findElement(buttonAddToBucket).click();
        return this;
    }

}
