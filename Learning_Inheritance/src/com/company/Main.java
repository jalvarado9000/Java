package com.company;

public class Main {

    public static void main(String[] args) {
        Greeting[] greetings =
                new Greeting[]{new French(), new English(), new Spanish()};

        for (Greeting g : greetings) {
            System.out.print(g.getGreeting() + " ");
        }
    }
}
