package com.company;
import java.util.*;
import javax.swing.JOptionPane;
import java.io.*;

import static jdk.jfr.consumer.EventStream.openFile;

public class Main {

    public static void main(String[] args) {
	// write your code here

        String filename = "SalesData.txt"; // File name
         int months = 0; // Month counter
         double oneMonth; // One month's sales
         double totalSales = 0.0; // Total sales
         double averageSales; // Average sales

         Scanner inputFile = openFile(filename);

        while (inputFile == null)
            {
            filename = JOptionPane.showInputDialog(
                    "ERROR: " + filename +
                            " does not exist.\n" +
                            "Enter another file name: ");
            inputFile = openFile(filename);
            }


    }
}
