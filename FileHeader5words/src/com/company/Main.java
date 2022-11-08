/*
Write a program that asks the user for the name of a file. The program should display only
the first five lines of the file’s contents. If the file contains fewer than five lines, it should
display the file’s entire contents.
*/

package com.company;
import java.util.Scanner;
import java.io.*;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner input = new Scanner(System.in);
        System.out.println("What is the name of the file");
        String filename = input.nextLine();

        File file = new File(filename + ".txt");

        if(!file.exists()){
            System.out.println("file name " + file  +".txt does not exist");
            System.exit(0);
        }

        try (Scanner inputFile = new Scanner(file)) {

            String Line = " ";
            int i = 0;
            while (inputFile.hasNext() && i < 6) {
                System.out.println(Line);
                Line = inputFile.nextLine();
                i++;

            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }


    }
}
