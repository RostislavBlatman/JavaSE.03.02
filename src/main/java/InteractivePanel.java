package main.java;

import java.util.Locale;
import java.util.ResourceBundle;
import java.util.Scanner;

public class InteractivePanel {
    private String language;
    private String country;
    private Scanner input = new Scanner(System.in);
    private Locale locale;
    private ResourceBundle bundle;

    public void setLocale() {
        System.out.println("Input your country");
        country = input.next();
        country = country.toLowerCase();
        switch (country) {
            case "ru":
                country = "RU";
                language = "RU";
                break;
            case "en":
                country = "US";
                language = "en";
                break;
        }
        locale = new Locale(language, country);
    }

    public String getQuestions() {
        bundle = ResourceBundle.getBundle("prop", locale);
        return bundle.getString("0");
    }

    public String getAnswer() {
        System.out.println("Choose answer and input his number: ");
        String question = input.next();
        return bundle.getString(question);
    }
}
