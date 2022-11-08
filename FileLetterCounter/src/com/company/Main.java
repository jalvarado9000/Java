package com.company;

import java.util.Scanner;
import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException{

        // Create Scanner object for user input
        Scanner input = new Scanner(System.in);

        // Prompt user for file name
        System.out.print("Enter file name: ");
        String fileName = input.nextLine();

        // Opening File
        File file = new File(fileName + ".txt");

        // Ensure that file exist
        if(!file.exists()){
            System.out.println("The file " + fileName + ".txt does not exist.");
            System.exit(0);
        }

        // Create scanner object to open file.
        Scanner fileInput = new Scanner(file);


        // Prompt user for the specified character and store in variable
        System.out.println("Enter character to count: ");
        String charInput = input.nextLine();
        char character = charInput.charAt(0);


        // Declare var to store lines from the file
        String line;

        // Declare counting variable
        int count = 0;

        // Construct while and for loop to calculate the number of
        // times the specified character appears within the file.
        //int i = 0;
        String bar[];
        while(fileInput.hasNext()){
            line = fileInput.nextLine();
            bar = line.split(" ");
            for(int i = 0; i < bar.length; i++) {

                for (int j = 0; j < bar[i].length(); j++) {
                    if (bar[i].charAt(j) == character) {
                        System.out.println(bar[i]);
                        j = bar[i].length();
                        count += 1;
                    }

                }
            }

        }

        // Diplay character count
        System.out.println("The character " + character + " appears in the file " + fileName + count + " times.");

        // Close file
        fileInput.close();
    }
}
