package com.company;

enum Planets{EARTH,URANUS,MARS}

public class Main {

    public static void main(String[] args) {
        // write your code here
        Planets myPlanet = Planets.EARTH;
        planet_Select(myPlanet);

    }

    static void planet_Select(Planets myPlanet) {
        switch (myPlanet) {

            case EARTH:
                System.out.println("You selected Earth");
                break;
            default:
                System.out.println("Planet is inhabitable");
                break;

        }

    }
}








