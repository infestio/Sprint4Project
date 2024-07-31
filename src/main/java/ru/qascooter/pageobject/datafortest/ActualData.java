package ru.qascooter.pageobject.datafortest;

public class ActualData {

    private final String actualTextFirstAnswer = "Сутки — 400 рублей. Оплата курьеру — наличными или картой.";
    private final String actualTextSecondAnswer = "Пока что у нас так: один заказ — один самокат. Если хотите покататься с друзьями, можете просто сделать несколько заказов — один за другим.";
    private final String actualTextThirdAnswer = "Допустим, вы оформляете заказ на 8 мая. Мы привозим самокат 8 мая в течение дня. Отсчёт времени аренды начинается с момента, когда вы оплатите заказ курьеру. Если мы привезли самокат 8 мая в 20:30, суточная аренда закончится 9 мая в 20:30.";
    private final String actualTextFourthAnswer = "Только начиная с завтрашнего дня. Но скоро станем расторопнее.";
    private final String actualTextFifthAnswer = "Пока что нет! Но если что-то срочное — всегда можно позвонить в поддержку по красивому номеру 1010.";
    private final String actualTextSixthAnswer = "Самокат приезжает к вам с полной зарядкой. Этого хватает на восемь суток — даже если будете кататься без передышек и во сне. Зарядка не понадобится.";
    private final String actualTextSeventhAnswer = "Да, пока самокат не привезли. Штрафа не будет, объяснительной записки тоже не попросим. Все же свои.";
    private final String actualTextEighthAnswer = "Да, обязательно. Всем самокатов! И Москве, и Московской области.";

    public String[] actualAnswers = {actualTextFirstAnswer,
            actualTextSecondAnswer,
            actualTextThirdAnswer,
            actualTextFourthAnswer,
            actualTextFifthAnswer,
            actualTextSixthAnswer,
            actualTextSeventhAnswer,
            actualTextEighthAnswer};

    public String getActualTextAnswer(int index) {
       return actualAnswers[index];
    }
}
