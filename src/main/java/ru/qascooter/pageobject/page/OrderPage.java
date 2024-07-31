package ru.qascooter.pageobject.page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class OrderPage extends BasePage {

    //форма "Для кого самокат", страница заказа
    private final By formForWhomScooter = By.xpath(".//div[@class='Order_Header__BZXOb' and text()='Для кого самокат']");
    //Поле "Имя" в форме "Для кого самокат"
    private final By fieldNameFormForWhomScooter = By.xpath(".//input[@placeholder='* Имя']");
    //Поле "Фамилия" в форме "Для кого самокат"
    private final By fieldLastNameFormForWhomScooter = By.xpath(".//input[@placeholder='* Фамилия']");
    //выпадающий список с выбранной станцией метро
    private final By fieldSubwayFormForWhomScooter = By.className("select-search__input");
    //Поле "Адрес: куда привезти самокат" в форме "Для кого самокат"
    private final By fieldAddressFormForWhomScooter = By.xpath(".//input[@placeholder='* Адрес: куда привезти заказ']");
    //поле "Телефон: на него позвонит курьер" в форме "Для кого самокат"
    private final By fieldPhoneFormForWhomScooter = By.xpath(".//input[@placeholder='* Телефон: на него позвонит курьер']");
    //Кнопка "Далее", страница заказа
    private final By buttonNextFormForWhomScooter = By.xpath(".//button[contains(@class,'Button_Middle__1CSJM') and text()='Далее']");
    //Форма "Про аренду", страница заказа
    private final By formAboutRent = By.xpath(".//div[@class='Order_Header__BZXOb' and text()='Про аренду']");
    //Поле "Когда привезти самокат" с выбором даты
    private final By fieldWhenBringScooterFormAboutRent = By.xpath(".//input[@placeholder='* Когда привезти самокат']");
    //Поле "Срок аренды" в форме "Про аренду"
    private final By fieldRentalPeriodFormAboutRent = By.className("Dropdown-arrow");
    //Выбор срока "Сутки" в поле "Срок аренды"
    private final By rentalPeriodDayFormAboutRent = By.xpath(".//div[contains(text(),'сутки')]");
    //Выбор чекбокса с цветом самоката
    private final By checkboxScooterColor = By.id("black");
    //Поле "Комментарий для курьера"
    private final By fieldCommentForCourier = By.xpath(".//input[@placeholder='Комментарий для курьера']");
    //Кнопка "Заказать", страница заказа
    private final By orderButtonInFormAboutRent = By.xpath(".//button[contains(@class,'Button_Middle__1CSJM') and text()='Заказать']");


    public OrderPage(WebDriver driver) {
        super(driver);
    }

    public void waitFormForWhomScooter() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(formForWhomScooter));
    }

    public void fillFieldNameFormForWhomScooter(String name) {
        driver.findElement(fieldNameFormForWhomScooter).sendKeys(name);
    }

    public void fillFieldLastNameFormForWhomScooter(String lastName) {
        driver.findElement(fieldLastNameFormForWhomScooter).sendKeys(lastName);
    }

    public void fillFieldAddressFormForWhomScooter(String address) {
        driver.findElement(fieldAddressFormForWhomScooter).sendKeys(address);
    }

    public void clickFieldSubwayFormForWhomScooter() {
        driver.findElement(fieldSubwayFormForWhomScooter).click();
    }

    public void chooseNameSubwayFormForWhomScooter(String subwayName) {
        driver.findElement(By.xpath(".//div[@class='Order_Text__2broi' and text()='" + subwayName +"']")).click();
    }

    public void fillFieldPhoneFormForWhomScooter(String phone) {
        driver.findElement(fieldPhoneFormForWhomScooter).sendKeys(phone);
    }

    public void clickButtonNextFormForWhomScooter() {
        driver.findElement(buttonNextFormForWhomScooter).click();
    }

    public void fillFormForWhomScooter(String name, String lastName, String address, String subwayName, String phone) {
        waitFormForWhomScooter();
        fillFieldNameFormForWhomScooter(name);
        fillFieldLastNameFormForWhomScooter(lastName);
        fillFieldAddressFormForWhomScooter(address);
        clickFieldSubwayFormForWhomScooter();
        chooseNameSubwayFormForWhomScooter(subwayName);
        fillFieldPhoneFormForWhomScooter(phone);
        clickButtonNextFormForWhomScooter();
    }

    public void waitFormAboutRent() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(formAboutRent));
    }

    public void fillFieldWhenBringScooterFormAboutRent(String date) {
        driver.findElement(fieldWhenBringScooterFormAboutRent).sendKeys(date);
    }

    public void clickFieldRentalPeriodFormAboutRent() {
        driver.findElement(fieldRentalPeriodFormAboutRent).click();
    }

    public void chooseRentalPeriodDayFormAboutRent() {
        driver.findElement(rentalPeriodDayFormAboutRent).click();
    }

    public void chooseCheckboxScooterColor() {
        driver.findElement(checkboxScooterColor).click();
    }

    public void fillFieldCommentForCourier(String comment) {
        driver.findElement(fieldCommentForCourier).sendKeys(comment);
    }

    public void clickOrderButtonInFormAboutRent() {
        driver.findElement(orderButtonInFormAboutRent).click();
    }

    public void fillFormAboutRent(String date, String comment) {
        waitFormAboutRent();
        fillFieldWhenBringScooterFormAboutRent(date);
        clickFieldRentalPeriodFormAboutRent();
        chooseRentalPeriodDayFormAboutRent();
        chooseCheckboxScooterColor();
        fillFieldCommentForCourier(comment);
        clickOrderButtonInFormAboutRent();
    }


}

