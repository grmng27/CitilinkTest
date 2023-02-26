package pages.home;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import pages.base.BasePage;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

public class CitilinkSearchPage extends BasePage {

    public CitilinkSearchPage(WebDriver driver) {
        super(driver);
    }

    By search = By.xpath("//*[@id=\"__next\"]/div/div[3]/div/div[2]/div/div/div[2]/div[1]/form/div/div/label/input");
    By buttonSearch = By.xpath("//*[@id=\"__next\"]/div/div[3]/div/div[2]/div/div/div[2]/div[1]/form/div/div/label/div/div/button[2]");

    By buttonClose = By.xpath("//*[@id=\"__next\"]/div/div[3]/div/div[2]/div/div/div[2]/div[1]/form/div/div/label/div/div/button[1]");

    public List<String> addRequest() {
        ArrayList<String> searchRequest = new ArrayList<>();
        searchRequest.add("Apple MacBook Air");
        searchRequest.add("Apple iPhone 14");
        searchRequest.add("Телевизор SunWind");
        searchRequest.add("Монитор игровой Huawei");
        searchRequest.add("Процессор AMD Ryzen 5");
        searchRequest.add("Мотопомпа бензиновая для грязной воды");
        searchRequest.add("Стиральная машина Samsung с сушкой");
        searchRequest.add("Погодная станция Buro");
        searchRequest.add("Винный шкаф однокамерный");
        searchRequest.add("Компьютер iRU Game 310H5GMA");
        return searchRequest;
    }

    public List<String> addResult() {
        ArrayList<String> result = new ArrayList<>();
        result.add("//*[@id=\"__next\"]/div/main/div[1]/div/div[2]/section/div[2]/div[2]/div[14]/div/div/div[2]/div[2]/a");
        result.add("//*[@id=\"__next\"]/div/main/div[1]/div/div[2]/section/div[2]/div[2]/div[1]/div/div/div[2]/div[3]/a");
        result.add("//*[@id=\"__next\"]/div/main/div[1]/div/div[2]/section/div[2]/div[2]/div[3]/div/div/div[2]/div[3]/a");
        result.add("//*[@id=\"__next\"]/div/main/div[1]/div/div[2]/section/div[2]/div[2]/div[1]/div/div/div[2]/div[3]/a");
        result.add("//*[@id=\"__next\"]/div/main/div[1]/div/div[2]/section/div[2]/div[2]/div[6]/div/div/div[2]/div[2]/a");
        result.add("//*[@id=\"__next\"]/div/main/div[1]/div/div[2]/section/div[2]/div[2]/div/div/div/div[2]/div[3]/a");
        result.add("//*[@id=\"__next\"]/div/main/div[1]/div/div[2]/section/div[2]/div[2]/div[1]/div/div/div[2]/div[2]/a");
        result.add("//*[@id=\"__next\"]/div/main/div[1]/div/div[2]/section/div[2]/div[2]/div[1]/div/div/div[2]/div[3]/a");
        result.add("//*[@id=\"__next\"]/div/main/div[1]/div/div[2]/section/div[2]/div[2]/div/div/div/div[2]/div[2]/a/span");
        result.add("//*[@id=\"__next\"]/div/main/div[1]/div/div[2]/section/div[2]/div[2]/div[1]/div/div/div[2]/div[3]/a");
        return result;
    }

    public List<String> addName() {
        ArrayList<String> name = new ArrayList<>();
        name.add("Ноутбук Apple MacBook Air A2337, 13.3\",  IPS, Apple M1 8 core 3.2ГГц, 8ГБ, 256ГБ SSD,  Mac OS, серый космос [mgn63zp/a]");
        name.add("Смартфон Apple iPhone 14 128Gb, A2881, голубой");
        name.add("32\" Телевизор SunWind SUN-LED32XB200, HD, черный");
        name.add("Монитор игровой Huawei MateView GT XWU-CBA 27\" черный [53060446]");
        name.add("Процессор AMD Ryzen 5 5500, SocketAM4, OEM [100-000000457]");
        name.add("Мотопомпа бензиновая Huter MP-80, для грязной воды, 900л/мин [70/11/7]");
        name.add("Стиральная машина Samsung WD70TA047BE/LD, с фронтальной загрузкой, с паром, 7кг, 1400об/мин, с сушкой");
        name.add("Погодная станция Buro H146G, серебристый");
        name.add("Винный шкаф однокамерный Liebherr WTes 5972 вместимость: 211 бутылок, инверторный серебристый");
        name.add("Компьютер iRU Game 310H5GMA, Intel Core i5 11400F, DDR4 16ГБ, 1ТБ(SSD), NVIDIA GeForce RTX 3060 - 12288 Мб, Free DOS, черный [1859665]");
        return name;
    }

    public CitilinkSearchPage inputSearch() {
        List<String> searchRequest = addRequest();
        List<String> name = addName();
        List<String> result = addResult();
        for (int i = 0; i < 10; i++) {
            driver.findElement(search).sendKeys(searchRequest.get(i));
            new WebDriverWait(driver, Duration.ofSeconds(30));
            driver.findElement(buttonSearch).sendKeys(Keys.ENTER);
            System.out.println(driver.findElement(By.xpath(result.get(i))).getAttribute("title").equals(name.get(i)));
            driver.get("https://www.citilink.ru");
        }
        return this;
        }
}
