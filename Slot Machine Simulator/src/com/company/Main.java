/*
22. Slot Machine Simulation
A slot machine is a gambling device that the user inserts money into and then pulls a lever
(or presses a button). The slot machine then displays a set of random images. If two or more
of the images match, the user wins an amount of money that the slot machine dispenses
back to the user.
Create a program that simulates a slot machine. When the program runs, it should do
the following:
• Asks the user to enter the amount of money he or she wants to enter into the slot machine.
• Instead of displaying images, the program will randomly select a word from the
following list:
Cherries, Oranges, Plums, Bells, Melons, Bars
To select a word, the program can generate a random number in the range of 0
through 5. If the number is 0, the selected word is Cherries; if the number is 1, the
selected word is Oranges; and so forth. The program should randomly select a word
from this list three times and display all three of the words.
• If none of the randomly selected words match, the program will inform the user that
he or she has won $0. If two of the words match, the program will inform the user
that he or she has won two times the amount entered. If three of the words match, the
program will inform the user that he or she has won three times the amount entered.
• The program will ask whether the user wants to play again. If so, these steps are
repeated. If not, the program displays the total amount of money entered into the slot
machine and the total amount won.Decision Structures
*/
package com.company;
import java.util.Scanner;
import java.util.Random;

public class Main
{
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        char response = ' ';
        double money = 0;
        double money_won = 0;

        do{
            System.out.print("enter the amount of money he or");
            System.out.println(" she wants to enter into the slot machine.");
            money = input.nextDouble();
            String[] images = {"Cherries", "Oranges", "Plums",
                    "Bells", "Melons", "Bars"};
            int counter[] = new int[6];



            for(int i = 0; i < 3; i++){
                Random random = new Random();
                int value = random.nextInt(5 + 0);
                switch(value){
                    case 0: System.out.println(images[value]);
                        counter[value]+=1;
                        break;
                    case 1: System.out.println(images[value]);
                        counter[value]+=1;
                        break;
                    case 2: System.out.println(images[value]);
                        counter[value]+=1;
                        break;
                    case 3: System.out.println(images[value]);
                        counter[value]+=1;
                        break;
                    case 4: System.out.println(images[value]);
                        counter[value]+=1;
                        break;
                    case 5: System.out.println(images[value]);
                        counter[value]+=1;
                        break;
                    default: System.out.println("Wrong");
                        break;
                }
            }

            boolean flag = true;



            for(int i = 0; i <= 5; i++){

                if(counter[i] == 3){
                    System.out.println("User has won 3 times amount entered");
                    money_won = money*3.0;
                    flag = false;
                }

                else if(counter[i] == 2){
                    System.out.println("User has won 2 times the amount entered");
                    money_won = money*2.0;
                    flag = false;
                }


                else{
                    if(i == 5 && flag == true)
                        System.out.println("User has won $0");
                }




            }

            System.out.println("Do you want to play again Yes : 'Y' or No 'N'");
            response = input.next().toUpperCase().charAt(0);

        }while(response == 'Y');

        System.out.println("total amount of money entered into the slot machine: " + money);
        System.out.println("and the total amount won: " + money_won);






    }











}