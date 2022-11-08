package com.company;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        /*
         * Given the name of an animal, return the name of a group of that animal
         * (e.g. "Elephant" -> "Herd", "Rhino" - "Crash").
         *
         * The animal name should be case insensitive so "elephant", "Elephant", and
         * "ELEPHANT" should all return "herd".
         *
         * If the name of the animal is not found, null, or empty, return "unknown".
         *
         * Rhino -> Crash
         * Giraffe -> Tower
         * Elephant -> Herd
         * Lion -> Pride
         * Crow -> Murder
         * Pigeon -> Kit
         * Flamingo -> Pat
         * Deer -> Herd
         * Dog -> Pack
         * Crocodile -> Float
         *
         * animalGroupName("giraffe") → "Tower"
         * animalGroupName("") -> "unknown"
         * animalGroupName("walrus") -> "unknown"
         * animalGroupName("Rhino") -> "Crash"
         * animalGroupName("rhino") -> "Crash"
         * animalGroupName("elephants") -> "unknown"
         *
         */

            Scanner input = new Scanner(System.in);
            Map<String,String> animalGroup = new HashMap<String,String>();
            String group = "";
            String animal = "";
            for (int i = 0; i < 3; i++) {
            System.out.println("What is the name of the animal:");
            animal = input.nextLine();


            switch(animal.toLowerCase()){
                case "rhino" : group = "Crash";
                    break;
                case "deer" : group = "Crash";
                    break;
                case "giraffe" : group = "Tower";
                    break;
                case "elephant" : group = "Herd";
                    break;
                case "lion" : group = "Pride";
                    break;
                case "crow" : group = "Murder";
                    break;
                case "pidgeon" : group = "Kit";
                    break;
                case "flamingo" : group = "Pat";
                case "dog" : group = "Pack";
                    break;
                case "crocodile" : group = "Float";
                    break;
                default : group = "unkown";
                    break;
            }



            animalGroup.put(animal,group);
        }

        for (String name: animalGroup.keySet()) {
            System.out.println(name + " -> " + animalGroup.get(name) );
        }




        }


    }

