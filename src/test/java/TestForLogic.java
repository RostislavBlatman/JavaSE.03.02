package test.java;

import main.java.Logic;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestForLogic {

    Logic logic;

    @BeforeEach
    void setUp() {
        logic = new Logic();
    }

    @DisplayName("Test for setLocale")
    @Test
    void testForSetLocale() {
        logic.setLocale("ru");
        assertEquals(logic.getCountry().toLowerCase(), "ru");
        assertEquals(logic.getLanguage().toLowerCase(), "ru");
        logic.setLocale("en");
        assertEquals(logic.getCountry().toLowerCase(), "us");
        assertEquals(logic.getLanguage().toLowerCase(), "en");

    }

    @DisplayName("Test for setLocale with bad country should return locale for Russia")
    @Test
    void testForSetLocaleWithBad() {
        logic.setLocale("z");
        assertEquals(logic.getCountry().toLowerCase(), "ru");
        assertEquals(logic.getLanguage().toLowerCase(), "ru");

    }

    @DisplayName("Test for getQuestion should return string of question")
    @Test
    void testForGetQuestion() {

        assertEquals(logic.getQuestions(logic.setLocale("en")), "1.What is your name?\n2.What are you doing?\n");

    }

    @DisplayName("Test for getAnswer should return string of answer")
    @Test
    void testForGetAnswer() {
        logic.setLocale("en");
        assertEquals(logic.getAnswer("1"), "My name is Rostislav");

    }

    @DisplayName("Test for getAnswer should work with bad number of question")
    @Test
    void testForGetAnswerWithBad() {

        logic.setLocale("en");
        assertEquals(logic.getAnswer("11"), "Uncorrect number of question");

    }


}
