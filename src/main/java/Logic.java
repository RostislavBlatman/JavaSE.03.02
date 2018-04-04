package main.java;

import java.util.Locale;
import java.util.MissingResourceException;
import java.util.ResourceBundle;

public class Logic {
    private String language;
    private String country;
    private Locale locale;
    private ResourceBundle questions;
    private ResourceBundle answers;

    public Locale setLocale(String country) {
        country.toLowerCase();
        switch (country) {
            case "ru":
                this.country = "RU";
                language = "ru";
                break;
            case "en":
                this.country = "US";
                language = "en";
                break;
            default:
                System.out.println("Bad country. I`will set Russia");
                this.country = "RU";
                language = "ru";
                break;
        }

        return locale = new Locale(language, this.country);

    }

    public String getQuestions(Locale locale) {

        questions = ResourceBundle.getBundle("questions", locale);
        return questions.getString("0");
    }

    public String getAnswer(String str) {
        String question = str;

        answers = ResourceBundle.getBundle("answers", locale);
        try {
            return answers.getString(question);
        } catch (MissingResourceException e) {
            return "Uncorrect number of question";

        }

    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getCountry() {
        return country;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public String getLanguage() {
        return language;
    }
}
