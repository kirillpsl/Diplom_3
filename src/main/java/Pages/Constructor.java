package Pages;

import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Constructor {
    private final WebDriver driver;

    public Constructor(WebDriver driver) {
        this.driver = driver;
    }

    //Заголовок h1 главной страницы
    private final By mainH1 = By.xpath("//h1[text()='Соберите бургер']");

    //локаторы кнопок меню
    private final By linkBuns = By.xpath("//span[text()='Булки']");
    private final By linkSauces = By.xpath("//span[text()='Соусы']");
    private final By linkToppings = By.xpath("//span[text()='Начинки']");

    //локаторы заголовков разделов в меню
    private final By h2Buns = By.xpath("//h2[text()='Булки']");
    private final By h2Sauces = By.xpath("//h2[text()='Соусы']");
    private final By h2Toppings = By.xpath("//h2[text()='Начинки']");

    public void waitForLoadMainPage(){
        new WebDriverWait(driver, Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOfElementLocated(mainH1));
    }

    //метод клика по кнопке "Булки"
    public void clickBunsLink() {
        driver.findElement(linkBuns).click();
    }

    //метод клика по кнопке "Соусы"
    public void clickSaucesLink() {
        driver.findElement(linkSauces).click();
    }

    //метод клика по кнопке "Начинки"
    public void clickToppingsLink() {
        driver.findElement(linkToppings).click();
    }

    public String bunsText() {
        return driver.findElement(h2Buns).getText();
    }

    public String saucesText() {
        return driver.findElement(h2Sauces).getText();
    }

    public String toppingsText() {
        return driver.findElement(h2Toppings).getText();
    }
}
