package pages.home;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import pages.base.BasePage;

import java.time.Duration;

import static common.Config.request;
import static common.Config.wrongRequest;

public class CitilinkHomePage extends BasePage {

    public CitilinkHomePage(WebDriver driver) {
        super(driver);
    }

    By catalog = By.xpath("//*[@id=\"__next\"]/div/div[3]/div/div[2]/div/div/div[1]/div/button");
    By tv = By.xpath("/html/body/div[5]/div/div/div/div/div[2]/div/div/div/div[5]/div/div/div/div/div/div/div[1]/div/a[3]/div/span");
    By phone = By.xpath("/html/body/div[5]/div/div/div/div/div[2]/div/div/div/div[5]/div/div/div/div/div/div/div[1]/div/a[1]");
    By smartPhone = By.xpath("//*[@id=\"__next\"]/div/main/div[1]/div/div[2]/section/section[2]/div/a[1]");
    By smartTv = By.xpath("//*[@id=\"__next\"]/div/main/div[1]/div/div[2]/aside/div/div/div[1]/ul/li[2]/a");
    By login = By.xpath("//*[@id=\"__next\"]/div/div[3]/div/div[2]/div/div/div[2]/div[2]/div[1]/div");
    By search = By.xpath("//*[@id=\"__next\"]/div/div[3]/div/div[2]/div/div/div[2]/div[1]/form/div/div/label/input");
    By buttonSearch = By.xpath("/html/body/div[2]/div/div[3]/div/div[2]/div/div/div[2]/div[1]/form/div/div/label/div/div/button[2]");
    By buttonWish = By.xpath("//*[@id=\"__next\"]/div/div[3]/div/div[2]/div/div/div[2]/div[2]/a[1]");

    public CitilinkHomePage pressCatalog() {
        driver.findElement(catalog).click();
        driver.findElement(tv).click();
        driver.findElement(smartTv).click();
        return this;
    }

    public CitilinkHomePage pressCatalogPhone() {
        driver.findElement(catalog).click();
        driver.findElement(phone).click();
        driver.findElement(smartPhone).click();
        return this;
    }

    public CitilinkHomePage pressLogin() {
        driver.findElement(login).click();
        return this;
    }

    public CitilinkHomePage pressSearch() {
        driver.findElement(search).sendKeys(request);
        new WebDriverWait(driver, Duration.ofSeconds(80)).until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[2]/div/div[3]/div/div[2]/div/div/div[2]/div[1]/form/div/div/label/div/div/button[2]")));
        driver.findElement(buttonSearch).click();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
        Assert.assertEquals(driver.getCurrentUrl(), "https://www.citilink.ru/search/?text=%D1%85%D0%BE%D0%BB%D0%BE%D0%B4%D0%B8%D0%BB%D1%8C%D0%BD%D0%B8%D0%BA");
        return this;
    }

    public CitilinkHomePage wrongPressSearch() {
        driver.findElement(search).sendKeys(wrongRequest);
        new WebDriverWait(driver, Duration.ofSeconds(800)).until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[2]/div/div[3]/div/div[2]/div/div/div[2]/div[1]/form/div/div/label/div/div/button[2]")));
        driver.findElement(buttonSearch).click();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        Assert.assertEquals(driver.getCurrentUrl(), "https://www.citilink.ru/search/?text=hghghghgh");
        return this;
    }

    public CitilinkHomePage pressWish() {
        driver.findElement(buttonWish).click();
        return this;
    }
}
