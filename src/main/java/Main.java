package main.java;


public class Main {

    public static void main(String[] args) {
        InteractivePanel interactivePanel = new InteractivePanel();
        interactivePanel.setLocale();
        System.out.println(interactivePanel.getQuestions());
        System.out.println(interactivePanel.getAnswer());


    }
}
