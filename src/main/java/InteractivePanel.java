package main.java;

import java.util.Locale;
import java.util.Scanner;

public class InteractivePanel {
    private String country;
    private Scanner input = new Scanner(System.in);
    private Logic logic = new Logic();

    public Locale interactiveSetLocale() {
        System.out.println("Input your country");
        country = input.next();
        return logic.setLocale(country);

    }

    public String interactiveGetQuestions(Locale locale) {
       return logic.getQuestions(locale);
    }

    public String interactiveGetAnswer() {
        System.out.println("Do you want to know answer?(Y/N)");
        String choose = input.next();
        if (choose.equalsIgnoreCase("Y")) {
            System.out.println("Choose question and input his number: ");
            String question = input.next();
            return logic.getAnswer(question);
        } else if (choose.equalsIgnoreCase("N")) {
            return "Good Bye";
        } else {
            return "Uncorrect input";
        }
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getCountry() {
        return country;
    }

}
