package pages.home;

import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import pages.base.BasePage;

import java.time.Duration;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class CitilinkCitiPage extends BasePage {

    public CitilinkCitiPage(WebDriver driver) {
        super(driver);
    }

    By cityName = By.cssSelector("#__next > div > header > div.fresnel-container.fresnel-greaterThanOrEqual-tabletL > div > div > div.e1r0p2ss0.css-1xo9wkr.e1loosed0 > div.css-11xi843.ek2ob5f0 > button > span");
    By cityNumber = By.cssSelector("#__next > div > header > div.fresnel-container.fresnel-greaterThanOrEqual-tabletL > div > div > div.e1r0p2ss0.css-1xo9wkr.e1loosed0 > div.css-11xi843.ek2ob5f0 > a");
    By buttonChange = By.xpath("//*[@id=\"__next\"]/div/header/div[2]/div/div/div[2]/div[1]/button/div");

    HashMap<String, String> cityAndNumbers = new HashMap<>();

    private static final String PREV_CITY_XPATH = "/html/body/div[5]/div/div/div/div/div[2]/div/div/div/div/div[2]/div/div[3]/div[2]/div[1]/ul/li[";
    private static final String END_CITY_XPATH = "]/a";

    private List<String> createList() {
        ArrayList<String> buttonCity = new ArrayList<>();
        for (int i = 1; i < 25; i++) {
            buttonCity.add(PREV_CITY_XPATH + i + END_CITY_XPATH);
        }
        return buttonCity;
    }

    public CitilinkCitiPage equalsNumbers() throws InterruptedException {
        for ( int i = 0; i < 24; i++ ) {
                driver.findElement(buttonChange).click();
                List<String> buttonCity = createList();
                driver.findElement(By.xpath(buttonCity.get(i))).sendKeys(Keys.ENTER);
                cityAndNumbers.put(driver.findElement(cityName).getText(), driver.findElement(cityNumber).getText());
        }
        System.out.println(cityAndNumbers);
        return this;
    }
}
