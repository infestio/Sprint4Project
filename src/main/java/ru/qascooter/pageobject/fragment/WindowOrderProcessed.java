package ru.qascooter.pageobject.fragment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import ru.qascooter.pageobject.page.BasePage;

public class WindowOrderProcessed extends BasePage {

    //Всплывающее окно "Заказ оформлен"
    protected By windowOrderProcessed = By.xpath(".//div[@class='Order_ModalHeader__3FDaJ' and text()='Заказ оформлен']");

    public WindowOrderProcessed(WebDriver driver) {
        super(driver);
    }

    public boolean iSWindowOrderProcessedDisplayed() {
        return driver.findElement(windowOrderProcessed).isDisplayed();
    }
}
