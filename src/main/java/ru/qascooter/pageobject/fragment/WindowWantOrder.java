package ru.qascooter.pageobject.fragment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import ru.qascooter.pageobject.page.BasePage;

public class WindowWantOrder extends BasePage {

    //Всплывающее окно "Хотите оформить заказ?"
    private final By windowWantPlaceOrder = By.className("Order_ModalHeader__3FDaJ");
    //Кнопка "Да" в всплывающем окне "Хотите оформить заказ?"
    private final By yesButtonInWindowWantPlaceOrder = By.xpath(".//button[contains(@class,'Button_Middle__1CSJM') and text()='Да']");

    public WindowWantOrder(WebDriver driver) {
        super(driver);
    }

    public void waitWindowWantPlaceOrder() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(windowWantPlaceOrder));
    }

    public void clickYesButtonInWindowWantPlaceOrder() {
        driver.findElement(yesButtonInWindowWantPlaceOrder).click();
    }


}
