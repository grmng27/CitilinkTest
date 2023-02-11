package pages.login;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import pages.base.BasePage;

import java.time.Duration;

import static common.Config.*;

public class CitilinkLoginPage extends BasePage {
    public CitilinkLoginPage(WebDriver driver) {
        super(driver);
    }

    private final By emailInput = By.xpath("/html/body/div[5]/div/div/div/div/div[2]/div/div/div/form/div/div[1]/div/div/label/input");
    private final By passwordInput = By.xpath("/html/body/div[5]/div/div/div/div/div[2]/div/div/div/form/div/div[2]/div/label/input");
    private final By buttonLogin = By.cssSelector("body > div.PopupScrollContainer > div > div > div > div > div.css-10n8sd6.e73syig0 > div > div > div > form > div > div:nth-child(5) > button > span");

    public CitilinkLoginPage login() {
        driver.findElement(emailInput).sendKeys(email);
        driver.findElement(passwordInput).sendKeys(password);
        driver.findElement(buttonLogin).click();
        return this;
    }

    public CitilinkLoginPage wrongLogin() {
        driver.findElement(emailInput).sendKeys(wrongEmail);
        driver.findElement(passwordInput).sendKeys(wrongPassword);
        driver.findElement(buttonLogin).click();
        Assert.assertEquals(driver.getCurrentUrl(), "https://www.citilink.ru/login/?_from=https%3A%2F%2Fwww.citilink.ru%2F&error=10");
        return this;
    }

}
