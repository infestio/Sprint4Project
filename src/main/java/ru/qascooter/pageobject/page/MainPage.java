package ru.qascooter.pageobject.page;

import org.openqa.selenium.*;

public class MainPage extends BasePage {

    public static final String URL = "https://qa-scooter.praktikum-services.ru/";

    //кнопка "Заказать" в шапке главной страницы
    private final By orderButtonInHeader = By.xpath(".//button[@class='Button_Button__ra12g']");
    //кнопка "Заказать" в центре главной страницы
    private final By orderButtonInCenter = By.xpath(".//button[contains(@class,'Button_Middle__1CSJM')]");


    public MainPage(WebDriver driver) {
        super(driver);
    }

    public By [] orderButton = {orderButtonInHeader, orderButtonInCenter};

    public void clickOrderButton(int index) {
        driver.findElement(orderButton[index]).click();
    }

}
