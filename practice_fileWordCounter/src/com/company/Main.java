package com.company;
import java.util.Scanner;
import java.io.*;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner input = new Scanner(System.in);

        //preguntamos el nombre del archivo
        System.out.println("What is the name of the file");
        String filename = input.nextLine();

        //Abrimos el Archivo
        File file = new File(filename + ".txt");

        //verificamos si el archivo existe
        if(!file.exists()){
            System.out.println("File with the name " + filename + ".txt Does not exist");
            System.exit(0);
        }

        //create scanner object to open file
        Scanner inputFile = new Scanner(file);






    }
}
