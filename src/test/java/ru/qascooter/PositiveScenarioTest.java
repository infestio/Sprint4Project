package ru.qascooter;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import ru.qascooter.pageobject.fragment.WindowOrderProcessed;
import ru.qascooter.pageobject.fragment.WindowWantOrder;
import ru.qascooter.pageobject.page.MainPage;
import ru.qascooter.pageobject.page.OrderPage;

import static org.junit.Assert.assertTrue;

@RunWith(Parameterized.class)
public class PositiveScenarioTest extends BaseTest {

    private final int index;
    private final String name;
    private final String lastName;
    private final String subwayName;
    private final String address;
    private final String phone;
    private final String date;
    private final String comment;

    public PositiveScenarioTest(int index, String name, String lastName, String subwayName,
                                String address, String phone, String date, String comment) {
        this.index = index;
        this.name = name;
        this.lastName = lastName;
        this.subwayName = subwayName;
        this.address = address;
        this.phone = phone;
        this.date = date;
        this.comment = comment;
    }

    @Parameterized.Parameters
    public static Object [][] positiveData() {
        return new Object[][] {
                {0,"Василий", "Обломов", "Киевская", "ул Лесорубов 64", "+79608334455", "01.08.2024", "Поспеши, пора рубить лес"},
                {1,"Инокентий", "Бессмертный", "Сокольники", "проезд Могильный 4", "89992314565", "02.08.2024", "Поспеши жить, смертный"},
        };
    }

    @Test
    public void positiveScenarioCheck() {

        MainPage mainPage = new MainPage(driver);
        mainPage.clickOrderButton(index);

        OrderPage orderPage = new OrderPage(driver);
        orderPage.fillFormForWhomScooter(name,lastName, address, subwayName, phone);
        orderPage.fillFormAboutRent(date, comment);

        WindowWantOrder windowWantOrder = new WindowWantOrder(driver);
        windowWantOrder.waitWindowWantPlaceOrder();
        windowWantOrder.clickYesButtonInWindowWantPlaceOrder();

        WindowOrderProcessed windowOrderProcessed = new WindowOrderProcessed(driver);
        boolean result = windowOrderProcessed.iSWindowOrderProcessedDisplayed();

        assertTrue(result);
    }

}
