package com.company;
import java.util.Scanner;
import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
	// write your code here
        Scanner input = new Scanner(System.in);
        System.out.println("what is the input file name");
        String filename = input.nextLine();

        File file = new File(filename + ".txt");

        System.out.println("what is the output file name");
        String filename2 = input.nextLine();


/*
        if(!file.exists()){
            System.out.println("file name " + file + ".txt does not exist");
            System.exit(0);
        }

*/





        Scanner inputFile = new Scanner(file);
        String Line = inputFile.nextLine();
        FileWriter fwriter = new FileWriter(filename2);
        PrintWriter outputFile = new PrintWriter(fwriter);
            while(inputFile.hasNext()){
                String out = Line.toUpperCase();
                outputFile.println(out);

            }

            outputFile.close();
            System.out.println("the file has been written in uppercase");













    }
}
