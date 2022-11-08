/*
The distance a vehicle travels can be calculated as follows:
Distance 5 Speed * Time
For example, if a train travels 40 miles-per-hour for three hours, the distance traveled is
120 miles. Write a program that asks for the speed of a vehicle (in miles-per-hour) and the
number of hours it has traveled. It should use a loop to display the distance a vehicle has
traveled for each hour of a time period specified by the user. For example, if a vehicle is
traveling at 40 mph for a three-hour time period, it should display a report similar to the
one that follows:
Input Validation: Do not accept a negative number for speed and do not accept any value
less than 1 for time traveled.

Modify the program you wrote for Programming Challenge 2 (Distance Traveled) so it
writes the report to a file instead of the screen. Open the file in Notepad or another text
editor to confirm the output.

*/
package com.company;
import java.util.Scanner;
import java.io.*;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner input = new Scanner(System.in);
        int hours,mph = 0;
        System.out.println("Enter the file name");
        String filename = input.nextLine();
        PrintWriter outputFile = null;
        try {
            outputFile = new PrintWriter(filename);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        do {
            System.out.println("What is the speed of the vehicle (in miles-per-hour)");
            mph = input.nextInt();
            System.out.println("Hours that the vehicle has traveled");
            hours = input.nextInt();
            if(hours < 0 || mph <= 1){
                System.out.println("Invalid speed of the vehicle or hours traveled");
                System.out.println("Please Try again");}
        }while(hours < 0 || mph <= 1);

        int total_distance = mph*hours;
        int hours_iteration = total_distance/hours;
        int acc = hours_iteration;
        String table = "Hours \t Distance Traveled";
        String lines = "--------------------------";
        outputFile.println(table);
        outputFile.println(lines);

        for(int i = 1; i < hours+1; i++){
            outputFile.println(i + " \t\t " + acc);
            acc += hours_iteration;

        }

        outputFile.close();
        System.out.println("Data written to the file.");



    }
}
