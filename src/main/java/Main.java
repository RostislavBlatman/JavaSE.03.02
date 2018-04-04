package main.java;


public class Main {

    public static void main(String[] args) {
        InteractivePanel interactivePanel = new InteractivePanel();

        System.out.println(interactivePanel.interactiveGetQuestions(interactivePanel.interactiveSetLocale()));
        System.out.println(interactivePanel.interactiveGetAnswer());


    }
}
