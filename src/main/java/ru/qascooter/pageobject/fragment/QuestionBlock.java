package ru.qascooter.pageobject.fragment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import ru.qascooter.pageobject.page.BasePage;
import org.openqa.selenium.JavascriptExecutor;

public class QuestionBlock extends BasePage {

    //скролл до элемента Вопросы о важном
    private final By questionAboutImportant = By.xpath(".//div[@class='Home_SubHeader__zwi_E' and text()='Вопросы о важном']");
    //стрелочка к вопросу: "Сколько это стоит? И как оплатить?"
    private final By firstImportantQuestion = By.id("accordion__heading-0");
    //стрелочка к вопросу: "Хочу сразу несколько самокатов! Так можно?"
    private final By secondImportantQuestion = By.id("accordion__heading-1");
    //стрелочка к вопросу: "Как рассчитывается время аренды?"
    private final By thirdImportantQuestion = By.id("accordion__heading-2");
    //стрелочка к вопросу: "Можно ли заказать самокат прямо на сегодня?"
    private final By fourthImportantQuestion = By.id("accordion__heading-3");
    //стрелочка к вопросу: "Можно ли продлить заказ или вернуть самокат раньше?"
    private final By fifthImportantQuestion = By.id("accordion__heading-4");
    //стрелочка к вопросу: "Вы привозите зарядку вместе с самокатом?"
    private final By sixthImportantQuestion = By.id("accordion__heading-5");
    //стрелочка к вопросу: "Можно ли отменить заказ?"
    private final By seventhImportantQuestion = By.id("accordion__heading-6");
    //стрелочка к вопросу: "Я жизу за МКАДом, привезёте?"
    private final By eighthImportantQuestion = By.id("accordion__heading-7");

    public By [] arrayQuestions = {firstImportantQuestion,
            secondImportantQuestion,
            thirdImportantQuestion,
            fourthImportantQuestion,
            fifthImportantQuestion,
            sixthImportantQuestion,
            seventhImportantQuestion,
            eighthImportantQuestion};

    //текст ответа к вопросу: "Сколько это стоит? И как оплатить?"
    private final By firstImportantAnswer = By.xpath(".//div[@id='accordion__panel-0']/p");
    //текст ответа к вопросу: "Хочу сразу несколько самокатов! Так можно?"
    private final By secondImportantAnswer = By.xpath(".//div[@id='accordion__panel-1']/p");
    //текст ответа к вопросу: "Как рассчитывается время аренды?"
    private final By thirdImportantAnswer = By.xpath(".//div[@id='accordion__panel-2']/p");
    //текст ответа к вопросу: "Можно ли заказать самокат прямо на сегодня?"
    private final By fourthImportantAnswer = By.xpath(".//div[@id='accordion__panel-3']/p");
    //текст ответа к вопросу: "Можно ли продлить заказ или вернуть самокат раньше?"
    private final By fifthImportantAnswer = By.xpath(".//div[@id='accordion__panel-4']/p");
    //текст ответа к вопросу: "Вы привозите зарядку вместе с самокатом?"
    private final By sixthImportantAnswer = By.xpath(".//div[@id='accordion__panel-5']/p");
    //текст ответа к вопросу: "Можно ли отменить заказ?"
    private final By seventhImportantAnswer = By.xpath(".//div[@id='accordion__panel-6']/p");
    //текст ответа к вопросу: "Я жизу за МКАДом, привезёте?"
    private final By eighthImportantAnswer = By.xpath(".//div[@id='accordion__panel-7']/p");

    public By [] arrayAnswers = {firstImportantAnswer,
            secondImportantAnswer,
            thirdImportantAnswer,
            fourthImportantAnswer,
            fifthImportantAnswer,
            sixthImportantAnswer,
            seventhImportantAnswer,
            eighthImportantAnswer};

    public QuestionBlock(WebDriver driver) {
        super(driver);
    }

    public void scrollQuestionAboutImportant(){
        WebElement element = driver.findElement(questionAboutImportant);
        ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView();", element);
    }

    public void clickImportantQuestion (int index) {
        driver.findElement(arrayQuestions[index]).click();

    }

    public String getTextAnswer(int index) {
       return driver.findElement(arrayAnswers[index]).getText();

    }

}
