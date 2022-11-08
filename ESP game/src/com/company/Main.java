/*
18. esp game
Write a program that tests your ESP (extrasensory perception). The program should ran-
domly select the name of a color from the following list of words:
Red, Green, Blue, Orange, Yellow
To select a word, the program can generate a random number.
Next, the program should ask the user to enter the color that the computer has selected.
After the user has entered his or her guess, the program should display the name of the ran-
domly selected color. The program should repeat this 10 times and then display the number
of times the user correctly guessed the selected color. Be sure to modularize the program
into methods that perform each major task.
This page intentionally left blank
*/
package com.company;

import java.util.Scanner;
import java.util.Random;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int PC_array[] = new int[5];
        int User_array[] = new int[5];
        random_numbers(PC_array);


        System.out.println("Guess the color the computer has entered");
        Menu();
        for (int x = 0; x < 5; x++) {
            int user_select = input.nextInt();
            User_array[x] = user_select;
        }

        int counter = 0;
        for (int i = 0; i < 5; i++) {
            if (PC_array[i] == User_array[i])
                counter++;

            Colors(PC_array[i]);
            Colors(User_array[i]);
        }

        System.out.println("Your Guessed " + counter + " times correctly");
        int select = input.nextInt();


    }


    public static void Colors(int select) {
        switch (select) {
            case 0:
                System.out.println("Red");
                break;
            case 1:
                System.out.println("Green");
                break;
            case 2:
                System.out.println("Blue");
                break;
            case 3:
                System.out.println("Orange");
                break;
            case 4:
                System.out.println("Yellow");
                break;
        }
    }

    public static void Menu() {
        System.out.println("Select 0 for Red");
        System.out.println("Select 1 for Green");
        System.out.println("Select 2 for Blue");
        System.out.println("Select 3 for Orange");
        System.out.println("Select 4 for Yellow");


    }

    public static int[] random_numbers(int arr[]) {
        Random rand = new Random();
        //int rand_int1 = rand.nextInt(5);

        for (int i = 0; i < 5; i++) {
            int rand_int1 = rand.nextInt(5);
            arr[i] = rand_int1;
        }

        return arr;

    }

}



