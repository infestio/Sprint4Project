package ru.qascooter;


import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import ru.qascooter.pageobject.datafortest.ActualData;
import ru.qascooter.pageobject.fragment.QuestionBlock;

import java.time.Duration;

import static org.junit.Assert.assertEquals;


@RunWith(Parameterized.class)
public class TextConsistencyCheckTest extends BaseTest {

    private final int indexArrays;


    public TextConsistencyCheckTest(int indexArrays) {
        this.indexArrays = indexArrays;
    }

    @Parameterized.Parameters
    public static Object[][] ConsistencyText() {
        return new Object[][] {
                {0},
                {1},
                {2},
                {3},
                {4},
                {5},
                {6},
                {7},

        };
    }

    @Test
    public void textConsistencyCheck() {
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));

        QuestionBlock questionBlock = new QuestionBlock(driver);
        questionBlock.scrollQuestionAboutImportant();
        questionBlock.clickImportantQuestion(indexArrays);
        questionBlock.getTextAnswer(indexArrays);

        ActualData actualData = new ActualData();
        actualData.getActualTextAnswer(indexArrays);

        assertEquals(questionBlock.getTextAnswer(indexArrays),actualData.getActualTextAnswer(indexArrays));
    }

}
